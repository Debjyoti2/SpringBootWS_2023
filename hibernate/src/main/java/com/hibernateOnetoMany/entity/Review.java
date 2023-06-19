package com.hibernateOnetoMany.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

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
public class Review {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long reviewId;
	private String reviewDesc;
	private int reviewStar;
	
	@ManyToOne
	private Course course;

	public Review(String reviewDesc, int reviewStar) {
		super();
		this.reviewDesc = reviewDesc;
		this.reviewStar = reviewStar;
	}
	
	

}
