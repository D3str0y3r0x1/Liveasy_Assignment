package com.springrest.springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.entities.Load;
import com.springrest.springrest.services.LoadService;

@RestController
public class MyController {
	
	@Autowired
	private LoadService loadService;
	//get the loads
	@GetMapping("/loads")
	public List<Load> getLoads()
	{
		return this.loadService.getLoads();
	}
	
	//get load with shipper id
	@GetMapping("/loads/{loadId}")
	public Load getLoad(@PathVariable String loadId) {
		return this.loadService.getLoad(Long.parseLong(loadId));
	}
	
	//adding loads
	@PostMapping("/loads")
	public Load addLoad(@RequestBody Load load) {
		return this.loadService.addLoad(load);
	}
	
	//update load
	@PutMapping
	public Load updateLoad(@RequestBody Load load) {
		return this.loadService.updateLoad(load);
	}
	
	@DeleteMapping("loads/{loadId}")
	public ResponseEntity<HttpStatus> deleteLoad(@PathVariable String loadId){
		try {
			this.loadService.deleteLoad(Long.parseLong(loadId));
			return new ResponseEntity<>(HttpStatus.OK);
		}catch (Exception e){
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
