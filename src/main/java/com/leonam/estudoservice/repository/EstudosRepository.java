package com.leonam.estudoservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leonam.estudoservice.model.Estudo;

public interface EstudosRepository extends JpaRepository<Estudo, Long>{

}
