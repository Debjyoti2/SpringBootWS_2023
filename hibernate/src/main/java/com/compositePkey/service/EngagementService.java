package com.compositePkey.service;

import com.compositePkey.entity.Engagement;

public interface EngagementService {
	
	public Engagement saveEngagement(Engagement engagement);
	public Engagement getEngagementById(Long engagementId);

}
