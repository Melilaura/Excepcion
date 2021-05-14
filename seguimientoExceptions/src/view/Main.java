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
	
	@Override
	public void setup() //void Start
	{
		controls = new Controller(this);
		squareSelected = false;
		circleSelected = false;
	}
	
	@Override
	public void draw() //void Update
	{		
		System.out.println(mouseX + ", " + mouseY);
		background(0);
		rectMode(CENTER);
		fill(255);
		
		controls.drawFigures();
		controls.drawBars();
		
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
		
	}
	
	public void mousePressed()
	{
		
	}

}

