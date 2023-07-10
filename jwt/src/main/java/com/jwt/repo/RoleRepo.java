package com.jwt.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jwt.entities.Role;

@Repository
public interface RoleRepo extends CrudRepository<Role,String>{

}
