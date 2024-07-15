package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.example.demo.DTo.Calculator;

@Component
public interface Calculator_JPA extends JpaRepository<Calculator, Integer> {

	

}
