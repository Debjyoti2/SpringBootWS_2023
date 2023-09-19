package com.transctional.isolation.repo;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.transctional.isolation.entities.Order;

public interface OrderRepo extends PagingAndSortingRepository<Order, Long>{

}
