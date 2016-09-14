/**
*file:Problem4_1.java
*author: Garrett Meyer
*course: CMPT 220
*assignment: Problem 4.1
*due date: September 14
*version: 1.8
*
*The file "Problem 4.1" is a the area of a pentagon
*/
import java.util.Scanner;

public class problem4_1 {
	public static void main(String[] args) {

		
        Scanner input = new Scanner(System.in);
		System.out.print("Enter a length from the center to a vertex: ");
		double radius = input.nextDouble();
		input.close();

//Calculating the Area 
		double s = 2 * radius * Math.sin(Math.PI / 5);
		double area = (5 * s * s) / (4 * Math.tan(Math.PI/5));

		System.out.printf("The are of the pentagon is %.2f", area);
	}
}