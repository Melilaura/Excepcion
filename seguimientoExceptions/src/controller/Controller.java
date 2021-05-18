package controller;

import model.Logic;
import processing.core.PApplet;

public class Controller 
{

	Logic logic;
	PApplet app;
	
	public Controller(PApplet app) 
	{
		logic = new Logic(app);
	}
	
	public void drawBars(PApplet app)
	{
		logic.drawBars(app);
	}
	
	public void drawFigures(PApplet app)
	{
		logic.drawFigures(app);
	}
	
	public void changeSquareColors()
	{
		logic.changeSquareColor();
		
		app.fill(logic.getrSquare(), logic.getbSquare(), logic.getgSquare());
	}
	
	public void changeCircleColors()
	{
		logic.changeCircColor();
		
		app.fill(logic.getrCircle(), logic.getgCircle(), logic.getbCircle());
	}

}
