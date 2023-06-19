package com.hibernateOnetoOne.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hibernateOnetoOne.dao.PassportRepo;
import com.hibernateOnetoOne.entity.Passport;

@Service
public class PassportServiceImpl implements PassportService{
	
	@Autowired
	private PassportRepo dao;
	
	@Override
	public Passport savePassport(Passport passport) {
		return dao.save(passport);
	}
	
	@Override
	public Passport getPassportById(Long passportId) {
		Passport passport  = dao.findById(passportId).orElse(new Passport());
		return passport;
	}

}
