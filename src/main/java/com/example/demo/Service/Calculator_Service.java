package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.example.demo.DTo.Calculator;
import com.example.demo.Repository.Calculator_JPA;

@Component
public class Calculator_Service {
	@Autowired
	Calculator_JPA jpa;

	public ResponseEntity<String> add(int a, int b) {
		int ans=a+b;
		Calculator c=new Calculator();
		c.setA(a);
		c.setB(b);
		c.setAnswer(ans);
		jpa.save(c);
		return new ResponseEntity<String>("Addition Successfull ! = "+ans, HttpStatus.CREATED);
	}

	public ResponseEntity<String> sub(int a, int b) {
		int ans=a-b;
		Calculator c=new Calculator();
		c.setA(a);
		c.setB(b);
		c.setAnswer(ans);
		jpa.save(c);
		return new ResponseEntity<String>("Subtraction Successfull != "+ans, HttpStatus.CREATED);
	}

	public ResponseEntity<String> mul(int a, int b) {
		int ans=a*b;
		Calculator c=new Calculator();
		c.setA(a);
		c.setB(b);
		c.setAnswer(ans);
		jpa.save(c);
		return new ResponseEntity<String>("Multiplication Successfull != "+ans, HttpStatus.CREATED);
	}
	
	public ResponseEntity<String> div(int a, int b) {
		int ans=a/b;
		Calculator c=new Calculator();
		c.setA(a);
		c.setB(b);
		c.setAnswer(ans);
		jpa.save(c);
		return new ResponseEntity<String>("Division Successfull != "+ans, HttpStatus.CREATED);
	}


	
	
	
}
