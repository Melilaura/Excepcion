package model;

import processing.core.PApplet;

public class Logic 
{
	Square squ;
	Circle circ;
	PApplet app;
	movingBar drawBar;
	int rSquare, gSquare, bSquare;
	int rCircle, gCircle, bCircle;

	public Logic(PApplet app) 
	{
		this.app = app;
		squ = new Square(105, 148, 100, app);
		circ = new Circle(395, 148, 100, app);
		drawBar = new movingBar(255, 270, 255, 15, app);
	}
	
	public void drawBars(PApplet app)
	{
		//this.app = app;
		drawBar.drawKnobs(app);
	}
	
	public void drawSquare(PApplet app)
	{
		squ.draw(app);
	}
	
	public void drawCircle(PApplet app)
	{
		circ.draw(app);
	}
	
	public int getrSquare() {
		return rSquare;
	}
	
	public void setrSquare(int rSquare) {
		this.rSquare = rSquare;
	}
	
	public int getgSquare() {
		return gSquare;
	}
	
	public void setgSquare(int gSquare) {
		this.gSquare = gSquare;
	}
	
	public int getbSquare() {
		return bSquare;
	}
	
	public void setbSquare(int bSquare) {
		this.bSquare = bSquare;
	}
	
	public int getrCircle() {
		return rCircle;
	}
	
	public void setrCircle(int rCircle) {
		this.rCircle = rCircle;
	}
	
	public int getgCircle() {
		return gCircle;
	}
	
	public void setgCircle(int gCircle) {
		this.gCircle = gCircle;
	}
	
	public int getbCircle() {
		return bCircle;
	}
	
	public void setbCircle(int bCircle) {
		this.bCircle = bCircle;
	}
	
}
