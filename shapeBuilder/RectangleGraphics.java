package shapeBuilder;
import java.awt.*;
import javax.swing.*;

public class RectangleGraphics extends JPanel{
	public int length;
	public int width;
	
	/** 
	 * The below method sets the passed length and width
	 * @param rectangleLength
	 * @param rectangleWidth
	 */
	public RectangleGraphics(int rectangleLength,int rectangleWidth) {
		length = rectangleLength;
		width = rectangleWidth;
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.fillRect(25, 25, length, width);
	}
}