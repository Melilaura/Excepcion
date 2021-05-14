package model;

import processing.core.PApplet;

public class Circle extends Figures
{

	public Circle(int posX, int posY, int size, PApplet app) 
	{
		super(posX, posY, size, app);
	}

	@Override
	public void draw(PApplet app) 
	{
		app.noStroke();
		app.circle(posX, posY, size);
	}

}
