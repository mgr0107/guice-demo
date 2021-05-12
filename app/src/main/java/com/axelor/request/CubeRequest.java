package com.axelor.request;

import com.axelor.annotations.Cube;
import com.axelor.services.DrawCube;
import com.axelor.services.DrawShape;
import com.google.inject.Inject;
import com.google.inject.Provider;

public class CubeRequest {
	
	Provider<DrawCube> cubeProvider; //to create more than one instance of DrawCube; no bindings required; does not inject DrawCubeProvider.java **** 
	
	@Inject
	public CubeRequest(Provider<DrawCube> cubeProvider) 
	{
		this.cubeProvider = cubeProvider;
	}
	
	public void makeRequest() {
		DrawCube d1 = cubeProvider.get(); //cubeProvider.get() creates an obj of DrawCube using no-args cons/cons annotated with @Inject.
		d1.draw();
		DrawCube d2 = cubeProvider.get();
		d2.draw();
		
	}

}
