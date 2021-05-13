package view;
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
	
	@Override
	public void setup() //void Start
	{
		
	}
	
	@Override
	public void draw() //void Update
	{		
		System.out.println(mouseX + ", " + mouseY);
		background(0);
		
		rectMode(CENTER);
		stroke(255, 207, 249);
		strokeWeight(3);
		fill(255);
		square(135, 148, 150);
		circle(500-135, 148, 150);
		
		rect(250, 270, 400, 15);
		rect(250, 270, 15, 40);
		rect(250, 330, 400, 15);
		rect(250, 330, 15, 40);
		rect(250, 390, 400, 15);
		rect(250, 390, 15, 40);
	}

}

