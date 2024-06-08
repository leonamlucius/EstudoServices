package com.leonam.estudoservices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leonam.estudosmodel.Estudo;
import com.leonam.estudosrepository.EstudosRepository;

@Service
public class EstudosService {
	
	@Autowired
	EstudosRepository estudorepository;
	
	
	public void save(Estudo estudo) {
		
		estudorepository.save(estudo);
	}
	
	public List<Estudo> findAll(){
		
		return estudorepository.findAll();
	}

}
