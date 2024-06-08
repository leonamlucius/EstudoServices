package com.leonam.estudosrepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.leonam.estudosmodel.Estudo;
@Repository
public interface EstudosRepository extends JpaRepository<Estudo, Long>{

}
