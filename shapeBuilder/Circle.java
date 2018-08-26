package shapeBuilder;
import java.lang.Math;

public class Circle {
	private double Area;
	private double Circumference;
	
	/** 
	 * The below methods set the passed radius into area and circumference
	 * @param radius
	 * @param radius
	 */
	public void Area(double radius){
		Area = Math.PI*radius*radius;
	}
	
	public void Circumference(double radius) {
		Circumference = 2*Math.PI*radius;
	}

	/** 
	 * The below methods return area and circumference
	 * @return Area
	 * @return Circumference
	 */
	public double getArea() {
		return Area;
	}
	
	public double getCircumference() {
		return Circumference;
	}

}
