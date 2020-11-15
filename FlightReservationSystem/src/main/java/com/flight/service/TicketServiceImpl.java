package com.flight.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flight.pojo.CardDetails;
import com.flight.pojo.Ticket;
import com.flight.pojo.User;
import com.flight.repository.CardDetailsRepository;
import com.flight.repository.TicketRepository;

@Service
@Transactional
public class TicketServiceImpl implements ITicketService {

	@Autowired
	private TicketRepository ticketRepo;
	
	@Autowired
	private CardDetailsRepository cardRepo;
	
	@Override
	public Ticket savePassangerTicket(Ticket t, User u) {
		
		t.setUserTicket(u);
		return ticketRepo.save(t);
	}

	@Override
	public CardDetails saveCardDetails(CardDetails card, User u) {
		
		card.setUserPayment(u);
		return cardRepo.save(card);
	}

}
