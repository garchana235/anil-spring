package com.dhs.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.Data;

@Data
@Document(collection = "CustomerDetails")

public class PizzaCustomerDetails {
	
	@Id
	@Field("_id")
	private String id;
	private String name;
	private int age;
	private String address;
	private long phonenumber ;
	private String gmail;
	
}
