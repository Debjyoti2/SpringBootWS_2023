package com.secondLvlCache.repo;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.secondLvlCache.entity.Project;

public interface ProjectRepository extends PagingAndSortingRepository<Project,Long>{

}
