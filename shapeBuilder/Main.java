package shapeBuilder;
import java.util.Scanner;
import javax.swing.*;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		System.out.println("Press 1 to exit the program"); 
		System.out.println("Press 2 to access the square area and circumference calculator");
		System.out.println("Press 3 to access the rectangle area and circumference calculator");
		System.out.println("Press 4 to access the triangle area and circumference calculator"); // won't display GUI, see line 86
		System.out.println("Press 5 to access the circle area and circumference calculator");
		int userCommand = input.nextInt();
		
		// exits program if userCommand = 1
		if (userCommand == 1) { 
			return;
		}
		if (userCommand == 2){ 
			System.out.println("What is the length of the sides of the square?");
			int length = input.nextInt();
			
			Square yourSquare = new Square(); 
			
			yourSquare.Area(length); 
			yourSquare.Circumference(length);
			
			System.out.println("The area of the square is " + yourSquare.getArea()); 
			System.out.println("The circumference of the square is " + yourSquare.getCircumference());
			
			//Creates JFrame window which displays square with measurements
			JFrame f = new JFrame("Your square"); 
			f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			SquareGraphics p = new SquareGraphics(length);
			f.add(p);
			f.setSize(500, 500);
			f.setVisible(true);
		}
		if (userCommand == 3) {
			System.out.println("What is the length of the rectangle?");
			int length = input.nextInt();
			
			System.out.println("What is the width of the rectangle?");
			int width = input.nextInt();
			
			Rectangle yourRectangle = new Rectangle(); 
			
			yourRectangle.Area(length, width); 
			yourRectangle.Circumference(length, width);
			
			System.out.println("The area of the rectangle is " + yourRectangle.getArea()); 
			System.out.println("The circumference of the rectangle is " + yourRectangle.getCircumference());
			
			//Creates JFrame window which displays rectangle with measurements 
			JFrame f = new JFrame("Your rectangle"); 
			f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			RectangleGraphics p = new RectangleGraphics(length, width);
			f.add(p);
			f.setSize(500, 500);
			f.setVisible(true);
		}
		if (userCommand == 4) {
			System.out.println("What is the length of the triangle?");
			int length = input.nextInt();
			
			System.out.println("What is the height of the triangle?");
			int height = input.nextInt();
			
			System.out.println("What is side 1 of the triangle?");
			int side1 = input.nextInt();
			
			System.out.println("What is the side 2 of the triangle?");
			int side2 = input.nextInt();
			
			System.out.println("What is the side 3 of the triangle?");
			int side3 = input.nextInt();
			
			Triangle yourTriangle = new Triangle(); 
			
			yourTriangle.Area(length, height); 
			yourTriangle.Circumference(side1, side2, side3);
			
			System.out.println("The area of the triangle is " + yourTriangle.getArea());
			System.out.println("The circumference of the triangle is " + yourTriangle.getCircumference());
			
			// Doesn't work right now, so commenting out.
			/* JFrame f = new JFrame("Your rectangle"); 
			f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			trianglegraphics p = new trianglegraphics(length, width);
			f.add(p);
			f.setSize(500, 500);
			f.setVisible(true); */ 
		}
		if (userCommand == 5) {
			System.out.println("What is the radius of the circle?");
			int radius = input.nextInt();
			
			Circle yourCircle = new Circle(); 
			
			yourCircle.Area(radius); 
			yourCircle.Circumference(radius);
			
			System.out.println("The area of the circle is " + yourCircle.getArea()); 
			System.out.println("The circumference of the circle is " + yourCircle.getCircumference());
			
			//Creates JFrame window which displays circle with measurements 
			JFrame f = new JFrame("Your circle"); 
			f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			CircleGraphics p = new CircleGraphics(radius);
			f.add(p);
			f.setSize(500, 500);
			f.setVisible(true);
		}
		if (userCommand != 1 && userCommand != 2 && userCommand != 3 && userCommand != 4 && userCommand != 5) {
			System.out.println("Invalid option, please rerun the program");
		}
	}
}

