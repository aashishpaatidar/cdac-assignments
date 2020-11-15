package com.flight.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.flight.pojo.Ticket;
import com.flight.pojo.User;
import com.flight.service.IFlightService;
import com.flight.service.ITicketService;

@Controller
@RequestMapping("/tickets")
public class TicketController {

	@Autowired
	private IFlightService flightService;
	
	@Autowired
	private ITicketService ticketService;
	
	@GetMapping("/book")
	public String displayBookTicketsPage(@RequestParam int id, Ticket t, Model map) {
		
		map.addAttribute("flight", flightService.getFlightDetails(id));
		return "/tickets/book";
	}
	
	@PostMapping("/book")
	public String bookPassangerTicket(Ticket ticket, HttpSession hs, @RequestParam int id) {
		
		User user = (User) hs.getAttribute("user_details");
		ticket.setUserFlight(flightService.getFlightDetails(id));
		hs.setAttribute("ticket", ticket);
		ticketService.savePassangerTicket(ticket, user);
		return "redirect:/payments/card_details";
	}
	
	
}
