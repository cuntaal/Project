
public class Rectangle extends Shape {

	
	private double width, height; 


	public Rectangle(double width, double height) {
	this.width = width;
	this.height = height;
	}

	@Override
	public double area() {
	// TODO Auto-generated method stub
	return width * height;
	}

	@Override
	public double circumference() {
	// TODO Auto-generated method stub
	return 2 * (width * height);
	}
	}