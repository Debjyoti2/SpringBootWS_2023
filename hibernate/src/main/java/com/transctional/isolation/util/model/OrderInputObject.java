package com.transctional.isolation.util.model;

import java.util.ArrayList;

import com.transctional.isolation.entities.Address;
import com.transctional.isolation.entities.Customer;
import com.transctional.isolation.entities.Order;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class OrderInputObject {
	
	private Customer customer;
	
	private ArrayList<Address> addresses;
	
	private ArrayList<Order> orders;
	
	

}
