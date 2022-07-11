package com.zensar.springboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.zensar.springboot.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

	@Query("from Product p where p.productName=:name")
	List<Product> test(@Param("name") String productName);

	@Query("from Product p where p.productName=:name and p.productPrice=:price")
	List<Product> test1(@Param("name") String productName, @Param("price") int productPrice);

}
