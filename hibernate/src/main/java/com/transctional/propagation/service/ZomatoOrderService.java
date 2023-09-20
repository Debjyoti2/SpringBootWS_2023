package com.transctional.propagation.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.transctional.propagation.entities.Address;
import com.transctional.propagation.entities.Customer;
import com.transctional.propagation.entities.Order;
import com.transctional.propagation.exceptions.InvalidAddressException;
import com.transctional.propagation.repo.AddressRepo;
import com.transctional.propagation.repo.CustomerRepo;
import com.transctional.propagation.repo.OrderRepo;
import com.transctional.propagation.util.model.OrderInputObject;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class ZomatoOrderService {
	
	@Autowired
	private CustomerRepo customerRepo;
	
	@Autowired
	private AddressRepo addressRepo;
	
	@Autowired
	private OrderRepo orderRepo;
	
	/*
    When we mention @Transctional above any method , spring will create a proxy class using proxy design pattern and spring AOP
    it will wrap all your code present in service class method. structure be like...
    
    // begin transction  -- included with help of PointCut and @Before Advice
     
    // all your code present inside the method
     
    // commit transction -- with the help of PointCut and @After advice
 
 
    Propagation.REQUIRE = use calling method existing transction, if not then create its own transction.
    Propagation.REQUIRES_NEW = always create its own new transction
    Propagation.SUPPORTS = if calling method has a transction then it will use the same transction, it calling method dont have any transction
                           then its run without transction.
                           
    Propagation.NOT_SUPPORTED= lets say 1st method e Propagation.REQUIRE kora ache ,s o it will create a new transction.
                               lets say 2nd method which called from 1st method , Propagation.NOT_SUPPORTED kora ache,
                               then 2nd method call hobar age it will suspend the 1st method existing transction,
                               and 2nd method will always run without a transction. and once 2nd method executed its again resumed the 1st method 
                               transction which was suspended.
  
    Propagation.NEVER= its never create a transction. jodi 1st method theke call hoy and sei method er transction thake,
                      then exception throw kore dbe. 
  
	 */
	
	// If we raise any unchecked exception then transction automatically rollback the commit.
	// but for checked exception we need to mention it , rollbackFor/ noRollbackfor
	
	
	//@Transactional(noRollbackFor  = InvalidAddressException.class)
	//@Transactional(rollbackFor = InvalidAddressException.class)
	@Transactional(propagation = Propagation.REQUIRED,noRollbackFor = InvalidAddressException.class)
	public Customer doOrder(OrderInputObject orderInputObject) throws InvalidAddressException {
		
		Customer customer = saveCustomerDetails(orderInputObject.getCustomer());
		
		ArrayList<Address> addressList = saveAddress(orderInputObject.getAddresses());
		ArrayList<Order> ordersList = saveOrders(orderInputObject.getOrders());
		
		log.info("addressList :: " + addressList);
		log.info("ordersList :: " + ordersList);
		
   		return customer;
		
		
	}

	public Customer saveCustomerDetails(Customer customer) {
		return customerRepo.save(customer);
	}
	
	@Transactional(propagation = Propagation.REQUIRED,rollbackFor  = InvalidAddressException.class)                
	public ArrayList<Address> saveAddress(ArrayList<Address> address) throws InvalidAddressException{
		ArrayList<Address> savedAddressList = new ArrayList<>();
		
		addressRepo.saveAll(address).forEach(e->savedAddressList.add(e));
		
		return savedAddressList;
	}
	
	@Transactional(propagation = Propagation.REQUIRED)
    public ArrayList<Order> saveOrders(ArrayList<Order> orders) throws InvalidAddressException{
		ArrayList<Order> savedOrderList = new ArrayList<>();
		if(true) {
			throw new InvalidAddressException("Invalid Address !!!");
		}
		orderRepo.saveAll(orders).forEach(e->savedOrderList.add(e));
		return savedOrderList;
	}
	
}
