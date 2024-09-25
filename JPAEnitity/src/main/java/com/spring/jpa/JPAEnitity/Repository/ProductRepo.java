package com.spring.jpa.JPAEnitity.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.jpa.JPAEnitity.MainEntities.Product;

public interface ProductRepo extends JpaRepository<Product,Long> {
	
	

}
