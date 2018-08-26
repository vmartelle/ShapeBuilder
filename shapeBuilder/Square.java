package shapeBuilder;

public class Square {
	public double Area;
	public double Circumference;
	
	/** 
	 * The below methods set the passed area and circumference
	 * @param sideLength
	 * @param sideLength
	 */
	public void Area(double sideLength){
		Area = sideLength*sideLength;
	}

	public void Circumference(double sideLength) {
		Circumference = 4*sideLength;
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

