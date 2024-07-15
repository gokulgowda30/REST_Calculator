package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.Calculator_Service;



@RestController
@RequestMapping("/calc")
public class Calaci_Controller {
	
	@Autowired
	Calculator_Service cal;
	
	@PostMapping("/add/{a}/{b}")
	public ResponseEntity<String> add(@PathVariable int a,@PathVariable int b){
		return cal.add(a,b);
		
	}
	
	@PostMapping("/sub/{a}/{b}")
	public ResponseEntity<String> subtraction(@PathVariable int a,@PathVariable int b){
		return cal.sub(a,b);
		
	}
	
	@PostMapping("/mul/{a}/{b}")
	public ResponseEntity<String> multipliction(@PathVariable int a,@PathVariable int b){
		return cal.mul(a,b);
		
	}
	
	@PostMapping("/div/{a}/{b}")
	public ResponseEntity<String> division(@PathVariable int a,@PathVariable int b){
		return cal.div(a,b);
		
	}
	
   
}
