package model;

import processing.core.PApplet;

public class Circle extends Figures
{

	public Circle(int posX, int posY, int size, int r, int g, int b, PApplet app) 
	{
		super(posX, posY, size, r, g, b, app);
	}

	@Override
	public void draw(PApplet app) 
	{
		app.fill(r, g, b);
		app.noStroke();
		app.circle(posX, posY, size);
	}

}
