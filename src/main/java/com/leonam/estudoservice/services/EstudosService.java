package com.leonam.estudoservice.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.leonam.estudoservice.model.Estudo;
import com.leonam.estudoservice.repository.EstudosRepository;

@Service
public class EstudosService {

	@Autowired
	private EstudosRepository estudorepository;

	public Estudo save(Estudo estudo) {

		return estudorepository.save(estudo);
	}

	public List<Estudo> findAll() {

		List<Estudo> estudo = estudorepository.findAll();

		return estudo;

	}

	public Estudo post(@RequestBody Estudo estudo) {
		
		estudo =  estudorepository.save(estudo);
		
		return estudo;

	}

}
