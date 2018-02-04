package unit1;

//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;

class Robot extends Canvas
{
 public Robot()    //constructor method - sets up the class
 {
    setSize(800,600);
    setBackground(Color.WHITE);   	
    setVisible(true);
 }

 public void paint( Graphics window )
 {
    window.setColor(Color.BLUE);

    window.drawString("Robot LAB ", 35, 35 );

    head( window );
    
    upperBody(window);
    
    lowerBody(window);
    
 }

 public void head( Graphics window )
 {
    window.setColor(Color.YELLOW);

    window.fillOval(300, 100, 200, 100);
    window.setColor(Color.BLACK);
    window.fillOval(350, 130, 20, 20);
    window.fillOval(430, 130, 20, 20);
    window.drawArc(350, 170, 100, 20, 180, 180);


		//add more code here
				
 }

 public void upperBody( Graphics window )
 {

		window.setColor(Color.BLUE);
		window.fillRect(320, 200, 150, 100);
		window.drawLine(320, 200, 220, 150);
		window.drawLine(470, 200, 570, 150);
 }

 public void lowerBody( Graphics window )
 {

		window.setColor(Color.GREEN);
		window.fillRect(320, 300, 150, 100);
		window.drawLine(320, 400, 270, 500);
		window.drawLine(470, 400, 520, 500);

 }
}