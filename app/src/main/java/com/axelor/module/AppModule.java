package com.axelor.module;


import com.axelor.services.DrawShape;
import com.axelor.services.DrawSquare;
import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.Scopes;
import com.google.inject.Singleton;
import com.axelor.annotations.CircleColorValue;
import com.axelor.annotations.Cube;
import com.axelor.annotations.CubeColorValue;
import com.axelor.annotations.CubeEdgeValue;
import com.axelor.services.DrawCircle;
import com.axelor.annotations.EdgeValue;
import com.axelor.annotations.RadiusValue;
import com.axelor.annotations.SquareColorValue;
import com.axelor.providers.DrawCubeProvider;
//import com.google.inject.name.Names;
import com.axelor.annotations.Circle;
import com.axelor.annotations.Square;


public class AppModule extends AbstractModule{ //class to prove meta data/ binding information
	
	@Override
	protected void configure() {
		//bind(DrawShape.class).annotatedWith(Square.class).to(DrawSquare.class); //whenever user requests for DrawShaped, an object of its mapped concrete class (DrawSquare) is returned.
		//bind(DrawShape.class).annotatedWith(Names.named("Square")).to(DrawSquare.class); //same functionality as above with @Named annotation
		//bind(DrawShape.class).annotatedWith(Circle.class).to(DrawCircle.class);	
		
		bind(String.class).annotatedWith(SquareColorValue.class).toInstance("blue");
		bind(Integer.class).annotatedWith(EdgeValue.class).toInstance(40);
		
		bind(String.class).annotatedWith(CircleColorValue.class).toInstance("yellow");
		bind(Integer.class).annotatedWith(RadiusValue.class).toInstance(10);
		
		//bind(DrawShape.class).annotatedWith(Cube.class).toProvider(DrawCubeProvider.class).in(Scopes.SINGLETON); //Provider class concept
		bind(String.class).annotatedWith(CubeColorValue.class).toInstance("Greenn");
		bind(Integer.class).annotatedWith(CubeEdgeValue.class).toInstance(10);
		
	}
	
	@Provides
	@Singleton //guice will provide a singleton object of DrawSquare with the dependencies whenever a DrawShape is requested
	@Square
	DrawShape providesDrawSquare(@SquareColorValue String color, @EdgeValue Integer edge) //use parameters if guice has to provide value 
	{
		DrawShape d = new DrawSquare(color, edge);
		return d;
	}
	
	@Provides
	@Singleton 
	@Circle
	DrawShape providesDrawCircle(@CircleColorValue String color, @RadiusValue Integer radius) 
	{
		DrawShape d = new DrawCircle(color, radius);
		return d;
	}
}
