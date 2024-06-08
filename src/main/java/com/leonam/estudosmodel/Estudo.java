package com.leonam.estudosmodel;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name ="ESTUDO")
public class Estudo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private Long Id;
	
	@Column(nullable = false)
	private String name;
	
	public Long getId() {
		return Id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(Id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Estudo other = (Estudo) obj;
		return Objects.equals(Id, other.Id) && Objects.equals(name, other.name);
	}
	
	
	
	
	

}
