package com.flight.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.flight.pojo.Flight;
import com.flight.service.IFlightService;

@Controller
@RequestMapping("/flight")
public class FlightController {

	
	@Autowired
	private IFlightService flightService;
	
	@GetMapping("/search")
	public String displaySearchPage(Flight f) {
		return "/flight/search";
	}
	
	@PostMapping("/search")
	public String queryFlightSearch(Flight f, Model flash) {
		
		List<Flight> list = flightService.getFlightSchedule(f.getDeparture(), f.getArrival());
		if(list != null) {
			flash.addAttribute("flight_list", list);
			System.out.println(list);
			return "/flight/display";
		}
		flash.addAttribute("msg", "No flights available");
		return "/flight/search";
	}
	
}
