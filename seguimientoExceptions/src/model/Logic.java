package model;

import processing.core.PApplet;

public class Logic 
{
	Square squ;
	Circle circ;
	PApplet app;
	movingBar movBarR, movBarG, movBarB,drawBar;
	int rSquare, gSquare, bSquare;
	int rCircle, gCircle, bCircle;

	public Logic(PApplet app) 
	{
		this.app = app;
		squ = new Square(105, 148, 100, app);
		circ = new Circle(500-105, 148, 100, app);
		movBarR = new movingBar(250, 270, 250, 270, app);
		movBarG = new movingBar(330, 270, 330, 270, app);
		movBarB = new movingBar(390, 270, 390, 270, app);
		drawBar = new movingBar(255, 270, 255, 15, app);
	}
	
	public void drawBars(PApplet app)
	{
		//this.app = app;
		drawBar.drawKnobs(app);
		movBarR.moveKnobs(app);
		movBarG.moveKnobs(app);
		movBarB.moveKnobs(app);
	}
	
	public void drawFigures(PApplet app)
	{
		squ.draw(app);
		circ.draw(app);
		
		System.out.println(squ.posX);
	}
	
	public void changeSquareColor()
	{
		rSquare = movBarR.getKnobX() - 120;
		gSquare = movBarG.getKnobX() - 120;
		bSquare = movBarB.getKnobX() - 120;
	}
	
	public void changeCircColor()
	{
		rCircle = movBarR.getKnobX() - 120;
		gCircle = movBarG.getKnobX() - 120;
		bCircle = movBarB.getKnobX() - 120;
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
