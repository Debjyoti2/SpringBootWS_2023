package com.secondLvlCache.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.secondLvlCache.entity.Project;
import com.secondLvlCache.service.ProjectService;

@RestController
@RequestMapping("/project")
public class ProjectController {
	
	@Autowired
	private ProjectService projectService;

	@PostMapping("/saveProject")
	public ResponseEntity<Project> saveProject(@RequestBody Project project){
		Project savedproject = projectService.saveProject(project);
		return new ResponseEntity<>(savedproject,HttpStatus.OK);
		
	}
	
	@GetMapping("/getProjectById/{projectId}")
	public ResponseEntity<Project> getProjectById(@PathVariable("projectId") Long projectId ){
		Project projectGet = projectService.getProjectById(projectId);
		return new ResponseEntity<>(projectGet,HttpStatus.OK);
	}
	
	
}
