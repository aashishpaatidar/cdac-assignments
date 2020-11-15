package com.flight.controller; 

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.flight.pojo.User;
import com.flight.service.IUserService;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private IUserService service;
	
	@GetMapping("/login")
	public String displayLoginPage() {
		return "/user/login";
	}
	
	@PostMapping("/login")
	public String userAuthentication(@RequestParam String email, @RequestParam String password,
			HttpSession session, Model map) {
		
		User authUser = service.authenticateUser(email, password);
		if(authUser != null) {
			session.setAttribute("user_details", authUser);
			return "redirect:/flight/search";
		}
		map.addAttribute("msg", "Invalid email or password");
		return "/user/login";
	}
	
	@GetMapping("/logout")
	public void userLogout(HttpSession hs, HttpServletRequest request, HttpServletResponse response) {
		
		hs.invalidate();
		response.setHeader("refresh", "3;url=" + request.getContextPath() + "/");
		
	}
	
	@GetMapping("/signup")
	public String displaySignupForm(User u) {
		return "/user/signup";
	}
	
	@PostMapping("/signup")
	public String userSign(User u, Model map) {
		
		service.saveUserDetails(u);
		map.addAttribute("signup_msg", "Sign up successful, please login");
		return "/index";
	}
}
