package com.flight.pojo;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "card_details")
public class CardDetails extends BaseEntity {

	@Column(name = "card_no")
	private Integer cardNo;
	
	@Column(name = "card_name", length = 20)
	private String cardName;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate expDate;
	
	@OneToOne
	@JoinColumn(name = "user_id")
	private User userPayment;
	
	public CardDetails() {
		System.out.println("in card details");
	}

	public CardDetails(Integer cardNo, String cardName, LocalDate expDate) {
		super();
		this.cardNo = cardNo;
		this.cardName = cardName;
		this.expDate = expDate;
	}

	public Integer getCardNo() {
		return cardNo;
	}

	public void setCardNo(Integer cardNo) {
		this.cardNo = cardNo;
	}

	public String getCardName() {
		return cardName;
	}

	public void setCardName(String cardName) {
		this.cardName = cardName;
	}

	public LocalDate getExpDate() {
		return expDate;
	}

	public void setExpDate(LocalDate expDate) {
		this.expDate = expDate;
	}

	public User getUserPayment() {
		return userPayment;
	}

	public void setUserPayment(User userPayment) {
		this.userPayment = userPayment;
	}
		
	
}
