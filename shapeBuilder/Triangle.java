package shapeBuilder;

public class Triangle {
	public double Area;
	public double Circumference;
	
	/** 
	 * The below methods set the passed area and circumference
	 * @param height
	 * @param base
	 */
	public void Area(double base, double height){
		Area = .5*base*height;
	}

	public void Circumference(double side1, double side2, double side3) {
		Circumference = side1 + side2 + side3;
	}
	
	/** 
	 * The below methods returns Area and Circumference 
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
