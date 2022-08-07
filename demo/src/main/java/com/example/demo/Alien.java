package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Alien {
	
	public Alien() {
		System.out.println("object created");
	}
	
	@Autowired
	@Qualifier("lap")
	private Laptop laptop;
	private int tech;
	private int name;
	private int id;
	public int getTech() {
		return tech;
	}
	public void setTech(int tech) {
		this.tech = tech;
	}
	public int getName() {
		return name;
	}
	public void setName(int name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public void show() {
		System.out.println("in show");
		
		laptop.show();
	}
	
}
