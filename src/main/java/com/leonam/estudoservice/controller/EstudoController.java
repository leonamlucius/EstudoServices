package com.leonam.estudoservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.leonam.estudoservice.model.Estudo;
import com.leonam.estudoservice.services.EstudosService;

@RestController
@RequestMapping("/estudo")
public class EstudoController {

	@Autowired
	private EstudosService estudosservices;

	@GetMapping("/get")
	public List<Estudo> findAll() {

		return estudosservices.findAll();
	}

	@PostMapping("/post")
	public Estudo post(@RequestBody Estudo estudo) {
		
		return estudosservices.post(estudo);
		
	}

}
