package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value="prototype") // each time it will create new 
//obj because we changed singleton scope to prototype scope
public class Home {
	private String owner;
	private int doorNo;
	@Autowired// auto wired the two objects
	@Qualifier("newmodem")// component name of wiring obj
	private InternetConnection modem;
	Home(){
		System.out.println("Hello World");
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public int getDoorNo() {
		return doorNo;
	}
	public void setDoorNo(int doorNo) {
		this.doorNo = doorNo;
	}
	public void connect() {
		modem.switchOn();
		System.out.println("Connecting to Internet");
	}

}
