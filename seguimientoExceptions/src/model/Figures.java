package model;

import processing.core.PApplet;

public abstract class Figures 
{
	int posX, posY, size;
	PApplet app;

	public Figures(int posX, int posY, int size, PApplet app) 
	{
		this.posX = posX;
		this.posY = posY;
		this.size = size;
		this.app = app;
	}
	
	public abstract void draw(PApplet app);


}
