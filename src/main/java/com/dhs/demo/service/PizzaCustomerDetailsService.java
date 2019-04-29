package com.dhs.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dhs.demo.dao.PizzaCustomerDetailsRepository;
import com.dhs.demo.model.PizzaCustomerDetails;



@Service
public class PizzaCustomerDetailsService {
	
	@Autowired
	PizzaCustomerDetailsRepository pizzaCustomerDetailsRepository;
	
	public PizzaCustomerDetails createPizzaCustomerDetails(PizzaCustomerDetails pizzaCustomerDetails){
		PizzaCustomerDetails response = pizzaCustomerDetailsRepository.save(pizzaCustomerDetails);
		return response;
		
	}

	public List<PizzaCustomerDetails> getPizzaCustomerDetails() {
		return pizzaCustomerDetailsRepository.findAll();
	}

}
