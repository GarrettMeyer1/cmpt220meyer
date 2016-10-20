/**
 * Problem9_1_rectangle:
 *
 * My class for Problem9_1
 *
 */
class Rectangle {

 	private double width;
 	private double height;

 	public Rectangle() {
 		this.width = 1.0;
 		this.height = 1.0;
 	}

 	public Rectangle(double width, double height) {
 		this.width = width;
 		this.height = height;
 	}
 	//Return Area //
 	public double getArea() {
 		return this.width * this.height;
 	}

  	//Return Perimeter //
 	public double getPerimeter() {
 		return this.width * 2 + this.height * 2;
 	}
 }