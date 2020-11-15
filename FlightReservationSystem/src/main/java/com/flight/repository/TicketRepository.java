package com.flight.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.flight.pojo.Ticket;

@Repository
public interface TicketRepository extends JpaRepository<Ticket, Integer> {

}
