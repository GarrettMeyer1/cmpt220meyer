/**
*file: Problem2_5.java
*author: Garrett Meyer
*course: CMPT 220
*assignment: Problem2.5
*due date: September 7
*version: 1.8
*
*The file "Problem 2.5" is a program that reads the subtotal and gratuity rate, then compares the two
*/
import java.util.Scanner;
public class problem2_5 {
  // == you are using tabs!!
	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		double	subtotal,
				gratuityRate,
				tip,
				total;

	
		System.out.print("Please enter the subtotal and the gratuity rate: ");
		subtotal = input.nextDouble();
		gratuityRate = input.nextDouble();

		tip = subtotal + (gratuityRate * .01); // == this is wrong!
		total = subtotal + tip;

		System.out.print("The total is $" + total + "The gratuity is $" + tip + "The subtotal is $" + subtotal);
	}
}
