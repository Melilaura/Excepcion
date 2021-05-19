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

	boolean areTheSame;
	
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
		
		fill(0);
		controls.drawBars(this);
	
		rect(knobRX, 270, 15, 40);
		rect(knobGX, 330, 15, 40);
		rect(knobBX, 390, 15, 40);
		
		fill(255);
		
		rect(125, 460, 170, 40);
		rect(375, 460, 170, 40);
		
		fill(0);
		
		textSize(15);
		textAlign(LEFT);
		text("Compare", 90, 465);
		text("Clear", 355, 465);
		
		limitKnobs();
		
		if(areTheSame)
		{
			textAlign(CENTER);
			fill(0, 255, 0);
			text("They are the same", 250, 20);
		}
		
		else if(!areTheSame)
		{
			textAlign(CENTER);
			fill(255, 0, 0);
			text("They are different", 250, 20);
		}

		//System.out.println(squareSelected + " " + circleSelected);
		
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
		
		if(knobRX < 120)
		{
			knobRX = 120;
		}
		
		if(knobGX > 380)
		{
			knobGX = 380;
		}
		
		if(knobGX < 120)
		{
			knobGX = 120;
		}
		
		if(knobBX > 380)
		{
			knobBX = 380;
		}
		
		if(knobBX < 120)
		{
			knobBX = 120;
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
		interactAreas();
	}
	
	public void interactAreas()
	{
		if(mouseX > 54 && mouseX < 154 && mouseY > 98 && mouseY < 198)
		{
			squareSelected = true;
			circleSelected = false;
		}
		
		if(dist(mouseX, mouseY, 395, 198) < 50)
		{
			squareSelected = false;
			circleSelected = true;
		}
		
		if(mouseX > 289 && mouseY > 438 && mouseX < 461 && mouseY < 481)
		{
			clearButton();
		}
		
		if(mouseX > 40 && mouseY > 437 && mouseX < 211 && mouseY < 479)
		{
			compareButton();
		}
	}
	
	public void clearButton()
	{
		rectR = 0;
		rectB = 0;
		rectG = 0;
		
		circR = 0;
		circB = 0;
		circG = 0;
		
		squareSelected = false;
		circleSelected = false;
	}
	
	public void compareButton()
	{	
		try
		{
			if(rectR == circR && rectB == circB && rectG == circG)
			{
				areTheSame = true;
			}
			
			if(rectR != circR && rectB == circB && rectG == circG)
			{
				throw new Exception("The R values are different");
			}
			
			if(rectR == circR && rectB != circB && rectG == circG)
			{
				throw new Exception("The B values are different");
			}
			
			if(rectR == circR && rectB == circB && rectG != circG)
			{
				throw new Exception("The G values are different");
			}
			
			if(rectR == circR && rectB != circB && rectG != circG)
			{
				throw new Exception("The G and B values are different");
			}
			
			if(rectR != circR && rectB != circB && rectG == circG)
			{
				throw new Exception("The R and B values are different");
			}
			
			if(rectR != circR && rectB == circB && rectG != circG)
			{
				throw new Exception("The R and G values are different");
			}
			
			if(rectR != circR && rectB != circB && rectG != circG)
			{
				throw new Exception("All the values are different");
			}
			
			//else
			//{
			//	textAlign(CENTER);
			//	fill(255, 0, 0);
			//	text("They are different", 250, 20);
			//}
		}
		
		catch(Exception e)
		{	
			areTheSame = false;
			System.out.println(e.getMessage());
		}

	}

}

