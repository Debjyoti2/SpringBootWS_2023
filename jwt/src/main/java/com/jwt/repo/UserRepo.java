package com.jwt.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jwt.entities.JWTUser;

@Repository
public interface UserRepo extends CrudRepository<JWTUser,String>{

}
