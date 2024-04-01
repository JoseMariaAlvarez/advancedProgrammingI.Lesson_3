public class Circle {

	static final double PI = 3.141532d;

	private double radius;
	private Point centre;

	public Circle(Point p, double r) {
		if (r < 0) {
			throw new RuntimeException("Negative radius");
		}
		// This line is never reached if r < 0
		if (p == null) {
			throw new RuntimeException("Null center point");
		}
		// This line is never reached if p == null
		radius = r; 	
		centre = p;
	}

	public double calculatePerimeter() {
		return 2.0d * PI * radius;
	}

	public double calculateArea() {
		return PI * PI * radius;
	}

}
