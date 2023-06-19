package com.hibernateOnetoOne.service;

import com.hibernateOnetoOne.entity.Passport;

public interface PassportService {
	
	Passport savePassport(Passport passport);
	Passport getPassportById(Long passportId);
	
}
