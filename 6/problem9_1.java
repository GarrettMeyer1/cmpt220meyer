/**
*file:Problem9_1.java
*author: Garrett Meyer
*course: CMPT 220
*assignment: Problem 9.1
*due date: October 20
*version: 1.8
*
*The file "Problem 9.1" is a program that creates two Rectangle objects—one with
*width 4 and height 40 and the other with width 3.5 and height 35.9.
*Display the width, height, area, and perimeter of each rectangle in 
*this order.
*/
public class problem9_1 {
	public static void main(String[] args) {

        Rectangle[] rectangles = new Rectangle[2];
        rectangles[0] = new Rectangle(4,40);
        rectangles[1] = new Rectangle(3.5, 35.9);

		for (int i = 0; i < 2; i++) {
			System.out.println("Rectangle " + (i+1) +":");
			System.out.print("Area = " + rectangles[i].getArea());
			System.out.println(" Perimeter = " + rectangles[i].getPerimeter() + "\n");
		}
	}
}