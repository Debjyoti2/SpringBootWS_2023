package com.transctional.propagation.repo;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.transctional.propagation.entities.Address;

public interface AddressRepo extends PagingAndSortingRepository<Address,Long> {

}
