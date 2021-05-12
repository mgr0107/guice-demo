package com.axelor.request;

import com.axelor.annotations.Square;
import com.axelor.services.DrawShape;
import com.google.inject.Inject;
//import com.google.inject.name.Named;

public class SquareRequest {
	
	DrawShape d;		
	
	@Inject
	public SquareRequest(@Square DrawShape d) //With @Named("Square") annotation, we don't have to create custom annotations like Square.java. @Named is not good practice.
	{
		this.d = d;
	}
	
	public void makeRequest() {
		d.draw();
	}

}
