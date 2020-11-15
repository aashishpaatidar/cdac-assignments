package com.flight.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.flight.pojo.City;
import com.flight.pojo.Flight;

@Repository
public interface FlightRepository extends JpaRepository<Flight, Integer> {

	List<Flight> findByDepartureAndArrival(City departure, City arrival);
	
}
