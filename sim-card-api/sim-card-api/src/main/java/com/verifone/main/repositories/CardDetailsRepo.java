package com.verifone.main.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.verifone.main.entities.CardDetails;

public interface CardDetailsRepo extends JpaRepository<CardDetails, Long> {

}
