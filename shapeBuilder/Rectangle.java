package shapeBuilder;

public class Rectangle {
	public double Area;
	public double Circumference;
	
	/** 
	 * The below methods set the passed area and circumference
	 * @param length
	 * @param width
	 */
	public void Area(double length, double width){
		Area = length*width;
	}

	public void Circumference(double length, double width) {
		Circumference = 2*(length + width);
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
