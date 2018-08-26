package shapeBuilder;
import java.awt.*;
import javax.swing.*;

public class SquareGraphics extends JPanel{
	public int length;
	
	/** 
	 * The below method sets length to passed parameter
	 * @param squareLength
	 */
	public SquareGraphics(int sideLength) {
		length = sideLength;
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.fillRect(25, 25, length, length);
	}
}