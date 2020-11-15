package com.flight.pojo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User extends BaseEntity {

	@Column(length = 20)
	private String name;
	
	@Column(length = 20, unique = true)
	private String email;
	
	@Column(length = 20)
	private String password;
	
	@OneToOne(mappedBy = "userPayment", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private CardDetails cardInfo;
	
	@OneToMany(mappedBy = "userTicket", cascade = CascadeType.ALL)
	private List<Ticket> ticket = new ArrayList<>();
	
	public User() {
		System.out.println("in User constr");
	}
	
	public User(String name, String email, String password) {
		super();
		this.email = email;
		this.name = name;
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<Ticket> getTicket() {
		return ticket;
	}

	public void setTicket(List<Ticket> ticket) {
		this.ticket = ticket;
	}

	public CardDetails getCardInfo() {
		return cardInfo;
	}

	public void setCardInfo(CardDetails cardInfo) {
		this.cardInfo = cardInfo;
	}
	
	
}
