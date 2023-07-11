package com.pagingAndSorting.repo;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import com.pagingAndSorting.entity.Product;

public interface ProductRepo extends PagingAndSortingRepository<Product, Long>{
	
	    //custom finder methods using native query with named query param
		@Query(value = "select * from t_product_jpa s where s.name=:name",nativeQuery = true)
		public List<Product> getproductfiltername(@Param("name") String name);
		
		
		
		
		//custom finder methods using native query with named query param
		//for DML (insert , update , delete we need @Modifying annotation)
		@Modifying
		@Query(value = "delete from t_product_jpa s where s.name=:name",nativeQuery = true)
		public List<Product>deleteproductbyname(@Param("name") String name);

}
