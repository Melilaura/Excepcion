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
	
	public abstract void draw(PApplet app);
	
	public int getR() {
		return r;
	}
	
	public void setR(int r) {
		this.r = r;
	}
	
	public int getB() {
		return b;
	}
	
	public void setB(int b) {
		this.b = b;
	}
	
	public int getG() {
		return g;
	}
	
	public void setG(int g) {
		this.g = g;
	}

}
