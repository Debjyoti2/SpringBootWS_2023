package com.secondLvlCache.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.secondLvlCache.entity.Project;
import com.secondLvlCache.repo.ProjectRepository;

@Service
public class ProjectServiceImpl implements ProjectService {
	@Autowired
	private ProjectRepository projectRepository;

	@Override
	public Project saveProject(Project project) {
		return projectRepository.save(project);
	}

	@Override
	@Transactional
	public Project getProjectById(Long projectId) {
		Project project = projectRepository.findById(projectId).get();
		return project;
	}

}
