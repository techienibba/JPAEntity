package com.spring.jpa.JPAEnitity.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.jpa.JPAEnitity.MainEntities.Student;

public interface StudentRepo extends JpaRepository<Student,Long> {

}
