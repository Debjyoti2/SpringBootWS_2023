package com.compositePkey.repo;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.compositePkey.entity.EngagamentId;
import com.compositePkey.entity.Engagement;

public interface EngagementRepository extends PagingAndSortingRepository<Engagement,EngagamentId>{

}
