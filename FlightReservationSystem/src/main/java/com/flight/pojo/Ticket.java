package com.flight.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tickets")
public class Ticket extends BaseEntity {

	@Column(name = "customer_name", length = 20)
	private String customerName;
	
	@Column(length = 20)
	private String email;
	
	@Column(length = 20)
	private String phone;
	
	@ManyToOne
	@JoinColumn(name = "user_id")
	private User userTicket;
	
	@OneToOne(targetEntity = Flight.class)
	@JoinColumn(name = "flight_id")
	private Flight userFlight;
	
	public Ticket() {
		System.out.println("in Tickets constr");
	}

	public Ticket(String customerName, String email, String phone) {
		super();
		this.customerName = customerName;
		this.email = email;
		this.phone = phone;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}


	public User getUserTicket() {
		return userTicket;
	}

	public void setUserTicket(User userTicket) {
		this.userTicket = userTicket;
	}

	public Flight getUserFlight() {
		return userFlight;
	}

	public void setUserFlight(Flight userFlight) {
		this.userFlight = userFlight;
	}

	
}
