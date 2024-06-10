package com.leonam.estudoservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.leonam.estudoservice.model.Estudo;
import com.leonam.estudoservice.repository.EstudosRepository;
import com.leonam.estudoservice.services.EstudosService;

@RestController
@RequestMapping("/estudo")
public class EstudoController {

	
	
	@Autowired
	private EstudosService services;
	
	


	@GetMapping("/teste")
	public List<Estudo> getInf(){
		
		
		return services.findAll();
		
	}
	
	

}
