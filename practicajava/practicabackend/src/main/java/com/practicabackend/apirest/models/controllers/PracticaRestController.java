package com.practicabackend.apirest.models.controllers;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practicabackend.apirest.models.entity.Practicas;
import com.practicabackend.apirest.models.services.IPracticaService;

@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/api")

public class PracticaRestController {
	
	@Autowired
	private IPracticaService practicaService;
	
	@GetMapping("/practicas")	
	public List<Practicas> index(){
	
		return practicaService.findAll();
		
	}
	
	@PostMapping("")
	public void save(@RequestBody Practicas Practicas) {
		practicaService.save(Practicas);
	}

}
