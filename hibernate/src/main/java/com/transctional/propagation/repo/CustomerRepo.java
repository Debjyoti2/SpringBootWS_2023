package com.transctional.propagation.repo;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.transctional.propagation.entities.Customer;

public interface CustomerRepo extends PagingAndSortingRepository<Customer,Long> {

}
