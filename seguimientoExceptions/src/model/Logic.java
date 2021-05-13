package model;

import processing.core.PApplet;

public class Logic 
{
	Square squ;
	Circle circ;
	PApplet app;

	public Logic(PApplet app) 
	{
		this.app = app;
		squ = new Square(105, 148, 100, 0, 0, 0, app);
		circ = new Circle(500-105, 148, 100, 0, 0, 0, app);
	}
	
	public void drawBar(PApplet app)
	{
		this.app = app;
	}

}
