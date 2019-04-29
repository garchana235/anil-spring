package com.dhs.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dhs.demo.model.PizzaCustomerDetails;
import com.dhs.demo.service.PizzaCustomerDetailsService;

@RestController
@RequestMapping(value = "/pizzahut")
public class PizzaCustomerDetailsController {
	
	@Autowired
	PizzaCustomerDetailsService pizzaCustomerDetailsService;

	@PostMapping("/createPizzaCustomer")
	public PizzaCustomerDetails createCustomerDetails(@RequestBody PizzaCustomerDetails pizzaCustomerDetails) {
		return pizzaCustomerDetailsService.createPizzaCustomerDetails(pizzaCustomerDetails);
	}
		
		@GetMapping("/getPizzaCustomer")
		public List<PizzaCustomerDetails> getCustomerDetails() {
			return pizzaCustomerDetailsService.getPizzaCustomerDetails();
	}

}
