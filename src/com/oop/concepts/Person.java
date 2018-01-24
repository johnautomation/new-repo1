package com.oop.concepts;

public class Person {
	
	private String name, address;
	  
  	public Person(String d_name, String d_address) {
		this.name = d_name;
		this.address = d_address;
	}
	
	
	public void setName(String d_name){
		d_name = this.name;
	}
	
	public void setAddress(String d_address){
		d_address =  this.address;
	}
	
	
	public String getName(){
		return this.name;
	}
	
	public String getAddress(){
		return this.address;
	}

}


