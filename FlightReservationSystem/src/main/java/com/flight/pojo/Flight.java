package com.flight.pojo;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "flight")
public class Flight extends BaseEntity {

	@Column(length = 30)
	private String airline;
	
	@Enumerated(EnumType.STRING)
	@Column(length = 30)
	private City departure;
	
	@Enumerated(EnumType.STRING)
	@Column(length = 30)
	private City arrival;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate date;
	
	public Flight() {
		System.out.println("in Schedule constr");
	}

	public Flight(String airline, City departure, City arrival, LocalDate date) {
		super();
		this.airline = airline;
		this.departure = departure;
		this.arrival = arrival;
		this.date = date;
	}

	public String getAirline() {
		return airline;
	}

	public void setAirline(String airline) {
		this.airline = airline;
	}

	public City getDeparture() {
		return departure;
	}

	public void setDeparture(City departure) {
		this.departure = departure;
	}

	public City getArrival() {
		return arrival;
	}

	public void setArrival(City arrival) {
		this.arrival = arrival;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Flight [airline=" + airline + ", departure=" + departure + ", arrival=" + arrival + ", date=" + date
				+ "]";
	}
	
	
	
}
