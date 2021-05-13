package model;

public class movingBar 
{
	int barX, barY, barSizeX, barSizeY;
	int knobX, knobY, knobSizeX, knobSizeY;

	public movingBar(int barX, int barY, int knobX, int knobY) 
	{
		this.barSizeX = 400;
		this.barSizeY = 15;
		this.knobSizeX = 15;
		this.knobSizeY = 40;
		
		this.barX = barX;
		this.barY = barY;
		this.knobX = knobX;
		this.knobY = knobY;
	}

}
