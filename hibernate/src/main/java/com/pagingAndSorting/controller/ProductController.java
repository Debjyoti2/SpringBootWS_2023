package com.pagingAndSorting.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pagingAndSorting.entity.Product;
import com.pagingAndSorting.service.ProductService;

@RequestMapping("/product")
@RestController
public class ProductController {
	
	@Autowired
	private ProductService productService;

	@PostMapping("/addProduct")
	public ResponseEntity<Product> addProduct(@RequestBody Product product){
		Product savedProduct = productService.addProduct(product);
		return new ResponseEntity<Product>(savedProduct,HttpStatus.OK);
	}
	
	@GetMapping("/fetchAllProducts/{pageNum}/{pageSize}")
	public ResponseEntity<Page<Product>> fetchAllProducts(@PathVariable("pageNum") Integer pageNum, @PathVariable("pageSize") Integer pageSize){
		
	 Page<Product> products = productService.fetchAllProducts(pageNum, pageSize);
	 return new ResponseEntity<Page<Product>>(products,HttpStatus.OK);
		
	}
	
}
