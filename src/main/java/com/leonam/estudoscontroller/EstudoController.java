package com.leonam.estudoscontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.leonam.estudoservices.EstudosService;
import com.leonam.estudosmodel.Estudo;
import com.leonam.estudosrepository.EstudosRepository;

@RestController
@RequestMapping("/estudo")
public class EstudoController {

	@Autowired
	EstudosService estudoservice;
	
	@Autowired
	EstudosRepository repository;


	@GetMapping("/get")
	public List<Estudo> getInf(){
		
		return repository.findAll();
		
	}
	
	@PostMapping("/post")
	public Estudo post(@RequestBody Estudo estudo) {
		
		return repository.save(estudo);
	
}

}
