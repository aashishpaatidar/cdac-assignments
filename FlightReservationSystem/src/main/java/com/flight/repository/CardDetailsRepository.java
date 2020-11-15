package com.flight.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.flight.pojo.CardDetails;

@Repository
public interface CardDetailsRepository extends JpaRepository<CardDetails, Integer> {

}
