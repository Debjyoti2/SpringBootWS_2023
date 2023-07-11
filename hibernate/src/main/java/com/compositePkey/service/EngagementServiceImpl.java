package com.compositePkey.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.compositePkey.entity.Engagement;
import com.compositePkey.repo.EngagementRepository;

@Service
public class EngagementServiceImpl implements EngagementService {
	@Autowired
	private EngagementRepository engagementRepository;

	@Override
	public Engagement saveEngagement(Engagement engagement) {
		return engagementRepository.save(engagement);
	}

	@Override
	@Transactional
	public Engagement getEngagementById(Long engagementId) {
		Engagement engagement = new Engagement();
		return engagement;
	}

}
