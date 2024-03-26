package com.fisglobal.admin.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fisglobal.admin.model.Flights;
import com.fisglobal.admin.service.FlightsService;

@RestController
@RequestMapping("kk")
public class FlightsController {
	
	@Autowired
	FlightsService service;
	
	@GetMapping("/find")
	public String find() {
		return "Hello Dinesh Reddy";
	}
	
	@GetMapping("/all")
	public ResponseEntity<List<Flights>> getAll(){
		return new ResponseEntity<List<Flights>>(service.allFlights(),HttpStatus.OK);
	}

}
