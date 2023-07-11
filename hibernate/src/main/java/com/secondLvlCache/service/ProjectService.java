package com.secondLvlCache.service;

import com.secondLvlCache.entity.Project;

public interface ProjectService {
	
	public Project saveProject(Project project);
	public Project getProjectById(Long projectId);

}
