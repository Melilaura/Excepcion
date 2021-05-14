package model;

import processing.core.PApplet;

public class Square extends Figures
{

	public Square(int posX, int posY, int size, PApplet app) 
	{
		super(posX, posY, size, app);
	}

	@Override
	public void draw(PApplet app) 
	{
		app.noStroke();
		app.square(posX, posY, size);
	}
	
	

}
