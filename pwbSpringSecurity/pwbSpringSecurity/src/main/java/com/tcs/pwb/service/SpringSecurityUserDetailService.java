package com.tcs.pwb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.tcs.pwb.dao.SpringSecurityUserRepository;
import com.tcs.pwb.vo.SpringSecurityCustomUserDetail;
import com.tcs.pwb.vo.User;

@Service
public class SpringSecurityUserDetailService implements UserDetailsService{

	@Autowired
	private SpringSecurityUserRepository springSecurityUserRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		User user=  this.springSecurityUserRepository.findByUsername(username);
		if(user ==null) {
			throw new UsernameNotFoundException("User not found");
		}
		return new SpringSecurityCustomUserDetail(user);
		
	}

}
