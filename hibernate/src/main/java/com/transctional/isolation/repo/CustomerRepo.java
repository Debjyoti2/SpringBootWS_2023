package com.transctional.isolation.repo;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.transctional.isolation.entities.Customer;

public interface CustomerRepo extends PagingAndSortingRepository<Customer,Long> {

}
