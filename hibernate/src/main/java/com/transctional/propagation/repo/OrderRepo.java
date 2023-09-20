package com.transctional.propagation.repo;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.transctional.propagation.entities.Order;

public interface OrderRepo extends PagingAndSortingRepository<Order, Long>{

}
