package com.flight.service;

import com.flight.pojo.CardDetails;
import com.flight.pojo.Ticket;
import com.flight.pojo.User;

public interface ITicketService {

	Ticket savePassangerTicket(Ticket t, User u);
	
	CardDetails saveCardDetails(CardDetails card, User u);
}
