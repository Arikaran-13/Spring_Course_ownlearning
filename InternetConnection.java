package com.example.demo;

import org.springframework.stereotype.Component;

@Component("newmodem")
public class InternetConnection {
	private int id;
	private String name;
	private int speed;
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
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public void switchOn() {
		System.out.print("Switched on");
	}
	

}
