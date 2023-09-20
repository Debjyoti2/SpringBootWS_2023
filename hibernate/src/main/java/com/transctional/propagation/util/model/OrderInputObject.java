package com.transctional.propagation.util.model;

import java.util.ArrayList;

import com.transctional.propagation.entities.Address;
import com.transctional.propagation.entities.Customer;
import com.transctional.propagation.entities.Order;

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
