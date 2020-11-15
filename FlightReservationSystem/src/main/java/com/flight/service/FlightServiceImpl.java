package com.flight.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flight.pojo.City;
import com.flight.pojo.Flight;
import com.flight.repository.FlightRepository;

@Service
@Transactional
public class FlightServiceImpl implements IFlightService {

	@Autowired
	private FlightRepository flightRepo;

	@Override
	public List<Flight> getFlightSchedule(City departure, City arrival) {
		
		return flightRepo.findByDepartureAndArrival(departure, arrival);
	}

	@Override
	public Flight getFlightDetails(int id) {
		
		 return flightRepo.findById(id).get();
	}

}
