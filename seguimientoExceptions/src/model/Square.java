package model;

import processing.core.PApplet;

public class Square extends Figures
{

	public Square(int posX, int posY, int size, int r, int g, int b, PApplet app) 
	{
		super(posX, posY, size, r, g, b, app);
	}

	@Override
	public void draw(PApplet app) 
	{
		app.rectMode(app.CENTER);
		app.fill(r, g, b);
		app.noStroke();
		app.square(posX, posY, size);
	}
	
	

}
