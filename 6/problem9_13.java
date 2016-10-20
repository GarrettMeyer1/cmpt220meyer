/**
*file:Problem9_13.java
*author: Garrett Meyer
*course: CMPT 220
*assignment: Problem 9.13
*due date: October 20
*version: 1.8
*
*The file "Problem 9.13" is a program that is designed to have a class named 
*Location for locating a maximal value and its location in a two-dimensional 
*array. The class contains public data fields row, column, and maxValue that 
*store the maximal value and its indices in a two-dimensional array with row 
*and column as int types and maxValue as a double type.
*Write the following method that returns the location of the largest element 
*in a two-dimensional array:
*public static Location locateLargest(double[][] a)
*The return value is an instance of Location.
*Write a test program that prompts the user to enter a two-dimensional
*array and displays the location of the largest element in the array.
*/
import java.util.Scanner;
public class problem9_13 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of rows and columns in the array: ");
		int row = input.nextInt();
		int column = input.nextInt();
		double [][] m = new double[row][column];

		System.out.println("Enter the Array: ");
		for (int i = 0; i < m.length; i++){
			for (int g = 0; g <m[i].length; g++) {
				m[i][g] = input.nextDouble();
			}
		}

		Location location = Location.locateLargest(m);

		System.out.println("The location of the largest element is "
			+ location.maxValue + " at (" + location.row + ", " +
			location.column + ")");
	}
}