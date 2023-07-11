package com.pagingAndSorting.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.pagingAndSorting.entity.Product;
import com.pagingAndSorting.repo.ProductRepo;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepo productRepo;

	public Product addProduct(Product product) {
		return productRepo.save(product);
	}

	public Page<Product> fetchAllProducts(Integer pageNum, Integer pageSize){
		
		/* VVI for Paging Sorting */ 
		
		Sort sort = Sort.by(new Sort.Order(Direction.ASC, "name"), new Sort.Order(Direction.DESC,"price"));
 		PageRequest pagereq =PageRequest.of(pageNum, pageSize,sort);
		
		/* VVI for Paging Sorting */
		
		
		Page<Product> products= productRepo.findAll(pagereq);
		return products;
	}
	
}
