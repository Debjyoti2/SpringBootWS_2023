package com.compositePkey.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@IdClass(EngagamentId.class)
public class Engagement implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private Long engagementId;
	
	@Id
	private String engagementStatus;
	
	private String engagementName;

}
