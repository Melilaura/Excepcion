package model;

import processing.core.PApplet;

public class Logic 
{
	Square squ;
	Circle circ;
	PApplet app;
	movingBar movBarR, movBarG, movBarB;

	public Logic(PApplet app) 
	{
		this.app = app;
		squ = new Square(105, 148, 100, 0, 0, 0, app);
		circ = new Circle(500-105, 148, 100, 0, 0, 0, app);
		movBarR = new movingBar(250, 270, 250, 270, app);
		movBarG = new movingBar(330, 270, 330, 270, app);
		movBarB = new movingBar(390, 270, 390, 270, app);
	}
	
	public void drawBars(PApplet app)
	{
		this.app = app;
		
		movBarR.moveKnobs(app);
		movBarG.moveKnobs(app);
		movBarB.moveKnobs(app);
	}
	
	public void drawFigures()
	{
		squ.draw(app);
		circ.draw(app);
	}

}
