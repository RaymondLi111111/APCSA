package unit15;

//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;

public class Ball extends Block
{
	private int xSpeed;
	private int ySpeed;

	public Ball()
	{
		super(200,200);
		xSpeed = 3;
		ySpeed = 1;
	}

	public Ball(int x, int y) {
		super(x,y);
		xSpeed = 3;
		ySpeed = 1;
	}
	
	public Ball(int x, int y, int w, int h) {
		super(x,y,w,h);
		xSpeed = 3;
		ySpeed = 1;
	}
	public Ball(int x, int y, int w, int h, Color c) {
		super(x,y,w,h,c);
		xSpeed = 3;
		ySpeed = 1;
	}
	public Ball(int x, int y, int w, int h, Color c,int vx, int vy) {
		super(x,y,w,h,c);
		xSpeed = vx;
		ySpeed = vy;
	}
	public void setXSpeed(int x) {
		xSpeed = x;
	}
	public void setYSpeed(int y) {
		ySpeed = y;
	}
 

 public void moveAndDraw(Graphics window)
 {
 	draw(window, Color.white);

    setX(getX()+xSpeed);
	setY(getY()+ySpeed);

	draw(window);
 }
 
	public boolean equals(Object obj)
	{
		Ball b = (Ball) obj;
		if (super.equals((Block) b) && b.xSpeed == xSpeed && b.ySpeed == ySpeed) {
			return true;
		}



		return false;
	}   

 public int getXSpeed() {
	 return xSpeed;
 }
 public int getYSpeed() {
	 return ySpeed;
 }

public String toString() {
	return super.toString() + " " + xSpeed + " " + ySpeed;
}
}