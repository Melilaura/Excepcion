package model;

import processing.core.PApplet;

public class movingBar 
{
	int barX, barY, barSizeX, barSizeY;
	int knobX, knobY, knobSizeX, knobSizeY;

	public movingBar(int barX, int barY, int knobX, int knobY, PApplet app) 
	{
		this.barSizeX = 255;
		this.barSizeY = 15;
		this.knobSizeX = 15;
		this.knobSizeY = 40;
		
		this.barX = barX;
		this.barY = barY;
		this.knobX = knobX;
		this.knobY = knobY;
	}
	
	public void moveKnobs(PApplet app)
	{
		/*if(app.mouseX == knobX)
		{
			knobX = app.mouseX;
		}*/
	}
	
	public int getKnobX() {
		return knobX;
	}
	
	public void setKnobX(int knobX) {
		this.knobX = knobX;
	}
	
	public int getKnobY() {
		return knobY;
	}
	
	public void setKnobY(int knobY) {
		this.knobY = knobY;
	}

}
