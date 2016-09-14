/**
*file:Problem4_5.java
*author: Garrett Meyer
*course: CMPT 220
*assignment: Problem 4.5
*due date: September 14
*version: 1.8
*
*The file "Problem 4.5" is a program that asks users
*for information to calculate the area of a regular polygon.
*/
import java.util.Scanner;
public class problem4_5 {

	public static void main(String[] args){

		Scanner input = new Scanner(System.in);		
		System.out.print("Enter the number of sides");
		double numOfSides = input.nextDouble();
		System.out.print("Enter the side: " );
		double length = input.nextDouble();
		input.close();

		double area = (numOfSides * length * length) / (4.0 * Math.tan(Math.PI / numOfSides));
		System.out.print("The area of the polygon is " + area);
	}
}