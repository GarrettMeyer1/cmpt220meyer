/**
*file:Problem7_20.java
*author: Garrett Meyer
*course: CMPT 220
*assignment: Problem 7.20
*due date: October 6
*version: 1.8
*
*The file "Problem 7.20" is a program that finds the largest number 
*and swapping it with the last. Write a test program that reads in 
*ten double numbers, invokes the method, and displays the sorted 
*numbers.
*/
import java.util.Scanner;
public class problem7_20 {

	static final int SIZE = 10;
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		double[] numbers = new double[SIZE];

		System.out.print("Enter " + SIZE + " numbers ");
		for (int i = 0; i < numbers.length; i++) numbers[i] = input.nextDouble();

		selectionSort(numbers);
	printArray(numbers, 10);
	}

	public static void selectionSort(double[] numbers) {

		for (int i = numbers.length - 1; i > 1 ; i--) {
			int currentIndex = i;
			double currentHigh = numbers[i];

			for (int k = i - 1; k > 0; k--) {
				if (currentHigh < numbers[k]) {
					currentIndex = k; 
					currentHigh = numbers[k];
				}
			}

			if (currentIndex != i) {
				double temp = numbers[currentIndex];
				numbers[currentIndex] = numbers[i];
				numbers[i] = temp;
			}
		}
	}

	public static void printArray(double[] array, int numberPerLine) {

		for (int i = 0; i < array.length; i++) {

			System.out.printf("%5.2f ", array[i]);
			if ((i + 1) % numberPerLine == 0) System.out.println("");
		}
	}
}