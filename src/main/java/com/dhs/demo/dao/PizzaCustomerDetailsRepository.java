package com.dhs.demo.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.dhs.demo.model.PizzaCustomerDetails;

public interface PizzaCustomerDetailsRepository extends MongoRepository<PizzaCustomerDetails, String> {

}
