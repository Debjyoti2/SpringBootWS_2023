package com.hibernateOnetoMany.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "t_reviews")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,property = "reviewId")
public class Review {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long reviewId;
	private String reviewDesc;
	private int reviewStar;
	
	@ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinColumn(name = "courseId",referencedColumnName = "courseId")
	private Course course;

	public Review(String reviewDesc, int reviewStar) {
		super();
		this.reviewDesc = reviewDesc;
		this.reviewStar = reviewStar;
	}
	
	

}
