package com.inheritance.entity;

import org.springframework.data.repository.CrudRepository;

public interface PaymentRepo extends CrudRepository<CreditCardPayment,Integer>{

}
