package com.leonam.estudoservice.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.leonam.estudoservice.model.Estudo;
import com.leonam.estudoservice.repository.EstudosRepository;


public class EstudosService {
	
	@Autowired
	private EstudosRepository estudorepository;
	
	public Estudo save(Estudo estudo) {
		
		return estudorepository.save(estudo);
	}
	
	public List<Estudo> findAll(){
		
		return estudorepository.findAll();
	}

}
