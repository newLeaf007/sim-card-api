package com.verifone.main.services;

import java.util.List;

import com.verifone.main.payloads.CardDetailsDTO;

public interface CardDetailsService  {
	
	//add a new entry in database
	CardDetailsDTO addSimCard(CardDetailsDTO cardDetailsDTO);
	
	//list all the records
	List<CardDetailsDTO> listAllRecords();
	
	// update the records with id
	CardDetailsDTO updateSimCardDetails(Long cardDetailsId);
	
	//delete the records with id
	CardDetailsDTO deleteRecordsById(Long cardDetailsId);

}
