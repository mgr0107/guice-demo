package com.axelor.services;

//import com.axelor.annotations.ColorValue;
//import com.axelor.annotations.EdgeValue;
//import com.google.inject.Inject;

public class DrawSquare implements DrawShape {
	//default constructor (no-args constructor) by java to instantiate an object of this class when no other constructor in mentioned
	
	private String color;
	private Integer edge;

	public DrawSquare(String color, Integer edge) {
		this.color = color;
		this.edge = edge;
	}

	@Override
	public void draw() {
		System.out.println("Drawing Square of color: "+ color + " and edge: "+ edge + " //provides method" );
	}
	
}
