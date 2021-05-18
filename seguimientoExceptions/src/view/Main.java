package view;
import controller.Controller;
import processing.core.PApplet;

public class Main extends PApplet
{

	public static void main(String[] args) 
	{
		PApplet.main("view.Main");
	}
	
	@Override
	public void settings() //void Awake
	{
		size(500, 500);
	}
	
	Controller controls;
	boolean squareSelected, circleSelected;
	
	int knobRX, knobGX, knobBX;
	
	@Override
	public void setup() //void Start
	{
		controls = new Controller(this);
		squareSelected = false;
		circleSelected = false;
		
		knobRX = 250;
		knobGX = 250;
		knobBX = 250;
	}
	
	@Override
	public void draw() //void Update
	{		
		//System.out.println(mouseX + ", " + mouseY);
		background(0);
		rectMode(CENTER);
		fill(255);
		
		controls.drawFigures(this);
		controls.drawBars(this);
		
		rect(knobRX, 270, 15, 40);
		rect(knobGX, 330, 15, 40);
		rect(knobBX, 390, 15, 40);
		
		/*rectMode(CENTER);
		stroke(255, 207, 249);
		strokeWeight(3);
		fill(255);
		square(135, 148, 150);
		circle(500-135, 148, 150);
		
		rect(250, 270, 255, 15);
		rect(250, 270, 15, 40);
		rect(250, 330, 255, 15);
		rect(250, 330, 15, 40);
		rect(250, 390, 255, 15);
		rect(250, 390, 15, 40);*/
	}
	
	public void mouseDragged()
	{
		if(dist(mouseX, mouseY, knobRX, 270) < 20)
		{			
			knobRX = mouseX;
		}
		
		if(dist(mouseX, mouseY, knobBX, 390) < 20)
		{			
			knobBX = mouseX;
		}
		
		if(dist(mouseX, mouseY, knobGX, 330) < 20)
		{			
			knobGX = mouseX;
		}
	}
	
	public void mousePressed()
	{
		
	}

}

