
package assignments;

import java.awt.Color;
import java.awt.Graphics;

public class DrawGraphics {
	BouncingBox box;
	
	 /** Initializes this class for drawing. */
    public DrawGraphics() {
    	System.out.println("ekhan2");
        box = new BouncingBox(200, 100, Color.RED);
        // box.setMovementVector(0, -2);
        // box = new BouncingBox(5, 100, Color.RED);
        System.out.println("ekhan3");
        box.setMovementVector(1, 0);
         
    }	
    
    public void DrawGraphics1() {
    	
       // box = new BouncingBox(200, 100, Color.RED);
        // box.setMovementVector(0, -2);
         box = new BouncingBox(5, 100, Color.RED);
        box.setMovementVector(0, -2);
         
    }
	

	/** Draw the contents of the window on surface. Called 20 times per second. */
    public void draw(Graphics surface) {
        surface.drawLine(65, 50, 250, 250);
        box.draw(surface);
        surface.drawRoundRect(65, 50, 10, 10, 10, 10);//(65, 50, 250,250);//(65, 50, 250, 250);
        box.draw(surface);
       // box.setMovementVector(0, -2);
        surface.drawRect(200, 200, 50, 50);
        box.draw(surface);
       // box.setMovementVector(1, 0);
       

    }

}
