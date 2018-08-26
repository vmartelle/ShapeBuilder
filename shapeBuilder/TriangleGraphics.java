package shapeBuilder;
import java.awt.*;
import javax.swing.*;

public class TriangleGraphics extends JPanel{
	public int length;
	public int height;
	
	/** 
	 * The below methods set the passed length and height
	 * @param trianglelength
	 * @param triangleheight
	 */
	public TriangleGraphics(int triangleLength, int triangleHeight ) {
		length = triangleLength;
		height = triangleHeight;
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		// g.fillPolygon(25, 25, length);  (Potential source of GUI display error: needs fixin')
	}
}