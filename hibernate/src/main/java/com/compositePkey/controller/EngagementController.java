package com.compositePkey.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.compositePkey.entity.Engagement;
import com.compositePkey.service.EngagementService;

@RestController
@RequestMapping("/engagement")
public class EngagementController {
	
	@Autowired
	private EngagementService engagementService;

	@PostMapping("/saveengagement")
	public ResponseEntity<Engagement> saveProject(@RequestBody Engagement engagement){
		Engagement savedengagement = engagementService.saveEngagement(engagement);
		return new ResponseEntity<>(savedengagement,HttpStatus.OK);
		
	}
	
	@GetMapping("/getProjectById/{projectId}")
	public ResponseEntity<Engagement> getProjectById(@PathVariable("engagementId") Long engagementId ){
		Engagement engagementGet = engagementService.getEngagementById(engagementId);
		return new ResponseEntity<>(engagementGet,HttpStatus.OK);
	}
	
	
}
