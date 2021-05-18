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
	int rectR, rectG, rectB;
	int circR, circG, circB;
	
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
		
		stroke(255);
		strokeWeight(2);
		
		colorer();
		
		fill(rectR, rectG, rectB);
		controls.drawSquare(this);
		
		fill(circR, circG, circB);
		controls.drawCircle(this);
		
		controls.drawBars(this);
		fill(255);
		
		rect(knobRX, 270, 15, 40);
		rect(knobGX, 330, 15, 40);
		rect(knobBX, 390, 15, 40);
		
		limitKnobs();
		
		//System.out.println(mouseX + ", " + mouseY);
		System.out.println(squareSelected + " " + circleSelected);
		
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
	
	public void limitKnobs()
	{
		if(knobRX > 380)
		{
			knobRX = 380;
		}
		
		if(knobRX < 125)
		{
			knobRX = 125;
		}
		
		if(knobGX > 380)
		{
			knobGX = 380;
		}
		
		if(knobGX < 125)
		{
			knobGX = 125;
		}
		
		if(knobBX > 380)
		{
			knobBX = 380;
		}
		
		if(knobBX < 125)
		{
			knobBX = 125;
		}
	}
	
	public void colorer()
	{
		if(squareSelected)
		{
			rectR = knobRX - 120;
			rectB = knobBX - 120;
			rectG = knobGX - 120;
		}
		
		if(circleSelected)
		{
			circR = knobRX - 120;
			circB = knobBX - 120;
			circG = knobGX - 120;
		}
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
		if(mouseX > 54 && mouseX < 154 && mouseY > 98 && mouseY < 198)
		{
			squareSelected = true;
			circleSelected = false;
		}
		
		if(dist(mouseX, mouseY, 395, 198) < 100)
		{
			squareSelected = false;
			circleSelected = true;
		}
	}

}

