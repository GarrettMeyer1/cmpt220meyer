/**
*file:Problem5_1.java
*author: Garrett Meyer
*course: CMPT 220
*assignment: Problem 5.1
*due date: September 22
*version: 1.8
*
*The file "Problem 5.1" is a program that reads an unspecified 
*number of integers, determines how many positive and negative values 
*have been read, and computes the total and average of the input values 
*(not counting zeros). Your program ends with the input 0. Display the 
*average as a floating-point number.
*/
import java.util.Scanner;
public class problem5_1 {

	public static void main(String[] args) {

		int positive = 0;
		int negative = 0;
		int total = 0;
		double average = 0;
		System.out.print("Enter an integer, the input will end if it is a 0: ");
		Scanner input = new Scanner(System.in);

		for (int buffer = -1; buffer != 0; ) {

			buffer = input.nextInt();
			if (buffer > 0) positive++;
			else if (buffer < 0) negative++;
			total += buffer;
		}
		if (positive + negative == 0) {
			System.out.println("No numbers are entered except 0");
			System.exit(0);
		}
		average = total /(double)(positive + negative);
		System.out.println("The number of positives is " + positive);
		System.out.println("The number of negatives is " + negative);
		System.out.println("The total is " + total);
		System.out.println("The average is " + average);
	}
}