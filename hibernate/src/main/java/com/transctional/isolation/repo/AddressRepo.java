package com.transctional.isolation.repo;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.transctional.isolation.entities.Address;

public interface AddressRepo extends PagingAndSortingRepository<Address,Long> {

}
