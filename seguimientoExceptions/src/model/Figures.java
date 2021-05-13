package model;

import processing.core.PApplet;

public abstract class Figures 
{
	int posX, posY, size, r, g, b;
	PApplet app;

	public Figures(int posX, int posY, int size, int r, int g, int b, PApplet app) 
	{
		this.posX = posX;
		this.posY = posY;
		this.size = size;
		this.r = r;
		this.g = g;
		this.b = b;
		this.app = app;
	}
	
	public abstract void draw();

}
