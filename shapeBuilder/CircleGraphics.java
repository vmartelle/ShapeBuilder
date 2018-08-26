package shapeBuilder;
import java.awt.*;
import javax.swing.*;

public class CircleGraphics extends JPanel{
	private int radius;
	
	/** 
	 * The below method sets the passed radius
	 * @param circleRadius
	 */
	public CircleGraphics(int circleRadius) {
		radius = circleRadius;
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.fillOval(25, 25, radius, radius);
	}
}