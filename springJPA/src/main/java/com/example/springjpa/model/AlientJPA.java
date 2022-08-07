package com.example.springjpa.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class AlientJPA {
	
	@Id
	private int id;
	private String name;
	private String tech;
	
	public String getTech() {
		return tech;
	}
	public void setTech(String tech) {
		this.tech = tech;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	
	
}
