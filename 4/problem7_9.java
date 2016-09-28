/**
*file:Problem7_9.java
*author: Garrett Meyer
*course: CMPT 220
*assignment: Problem 7.9
*due date: September 28
*version: 1.8
*
*The file "Problem 7.9" is a a method that finds the smallest element 
*in an array of double values using the following header:
*public static double min(double[] array)
*/
import java.util.Scanner;

public class problem7_9 {

	static final int SIZE = 10;

	public static void main(String[] args) {

		double[] n = new double[SIZE];
		Scanner input = new Scanner(System.in);

		System.out.print("Enter " + SIZE + " numbers: ");
		for (int i = 0; i < n.length; i++) n[i] = input.nextDouble();

		System.out.println("The minimum number is: " + min(n));
	}

	public static double min(double[] array) {

		double min = array[0];
		for (int i = 0; i < array.length; i++) {

			if (min > array[i]) min = array[i];
		}

		return min;
	}
}