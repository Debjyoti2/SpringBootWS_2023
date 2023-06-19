package com.hibernateOnetoOne.dao;

import org.springframework.data.repository.CrudRepository;

import com.hibernateOnetoOne.entity.Passport;

public interface PassportRepo extends CrudRepository<Passport,Long>{

}
