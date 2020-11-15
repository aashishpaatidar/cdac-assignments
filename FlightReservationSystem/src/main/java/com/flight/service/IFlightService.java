package com.flight.service;

import java.util.List;

import com.flight.pojo.City;
import com.flight.pojo.Flight;

public interface IFlightService {
	
	List<Flight> getFlightSchedule(City departure, City arrival);
	
	Flight getFlightDetails(int id);
}
