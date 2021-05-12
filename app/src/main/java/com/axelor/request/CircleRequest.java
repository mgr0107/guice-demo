package com.axelor.request;

import com.axelor.annotations.Circle;
import com.axelor.services.DrawShape;
import com.google.inject.Inject;

public class CircleRequest {
	
	DrawShape d;
	
	@Inject
	public CircleRequest(@Circle DrawShape d) { 
		this.d = d;
	}

	public void makeRequest() {
		d.draw();
	}
}
