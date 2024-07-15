package com.example.demo.DTo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Calculator {
    @Id
  //  @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int a;
	private int b;
	private int answer;
}
