package com.axelor.services;

import com.axelor.annotations.CubeColorValue;
import com.axelor.annotations.CubeEdgeValue;
import com.google.inject.Inject;

public class DrawCube implements DrawShape {

	private String color;
	private Integer edge;
	
	Thread t = new Thread(() -> System.out.println("Drawing Cube of color: "+ color + " and edge: "+ edge + " //provider class"));  //Creating a thread so that one instance can call its method only once.  
    
	@Inject
	public DrawCube(@ CubeColorValue String color, @CubeEdgeValue Integer edge) {
		this.color = color;
		this.edge = edge;
	}

	@Override
	public void draw() {
		t.start(); 
	}

}
