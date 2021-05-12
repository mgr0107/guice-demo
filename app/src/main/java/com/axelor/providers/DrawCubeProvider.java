package com.axelor.providers;

import com.axelor.annotations.CubeColorValue;
import com.axelor.annotations.CubeEdgeValue;
import com.axelor.services.DrawCube;
import com.google.inject.Inject;
import com.google.inject.Provider;

public class DrawCubeProvider implements Provider<DrawCube> //Provider interface is present in guice library with a single method get() 
{
	private String color;
	private Integer edge;
	
    @Inject //guice going to provide color and edge to constructor, checks bindings for the same
	public DrawCubeProvider(@CubeColorValue String color, @CubeEdgeValue Integer edge) {
		this.color = color;
		this.edge = edge;
	}
	
	@Override //after creating an object, guice calls the get() method
	public DrawCube get() //Return type should be same as generic type (DrawCube)
	{
		DrawCube d = new DrawCube(color, edge);
		return d;
}
}
