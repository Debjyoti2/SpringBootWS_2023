package com.compositePkey.entity;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EngagamentId implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Long engagementId;
	
	private String engagementStatus;

}
