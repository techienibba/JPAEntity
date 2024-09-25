package com.spring.jpa.JPAEnitity.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.jpa.JPAEnitity.MainEntities.category;

public interface CategoryRepo extends JpaRepository<category,Long> {

}
