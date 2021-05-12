package com.axelor.services;


//import com.axelor.annotations.ColorValue;
//import com.axelor.annotations.EdgeValue;
//import com.google.inject.Inject;

public class DrawCircle implements DrawShape {
	//default constructor (no-args constructor) by java to instantiate an object of this class when no other constructor in mentioned
	
	private String color;
	private Integer radius;	

	public DrawCircle(String color, Integer radius) {
		this.color = color;
		this.radius = radius;
	}

	@Override
	public void draw() {
		System.out.println("Drawing Circle of color: "+ color + " and radius: "+ radius + " //provides method");
	}
	
}
