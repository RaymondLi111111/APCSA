package unit1;

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;

class RectangleMaker extends Canvas {
	 public RectangleMaker()    //constructor method - sets up the class
	 {
	    setSize(800,600);
	    setBackground(Color.WHITE);   	
	    setVisible(true);
	 }
	 public void paint( Graphics window ) {
		 window.fillRect(420, 420, 6, 7);
		 window.fillRect(333, 333, 20, 1);
	 }
}
