package com.flight.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.flight.pojo.CardDetails;
import com.flight.pojo.User;
import com.flight.service.ITicketService;

@Controller
@RequestMapping("/payments")
public class PaymentController {
	
	@Autowired
	private ITicketService tickets;

	@GetMapping("/card_details")
	public String displayPaymentForm(CardDetails card) {
		return "/payments/card_details";
	}
	
	@PostMapping("/card_details")
	public String processCardPayment(CardDetails card, HttpSession hs, Model flash) {
		
		User user = (User)hs.getAttribute("user_details");
		tickets.saveCardDetails(card, user);
		flash.addAttribute("status", user.getId());
		return "redirect:/payments/status";
	}
	
	@GetMapping("/status")
	public String showStatus() {
		return "/payments/status";
	}
}
