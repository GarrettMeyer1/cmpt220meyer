/**
*file:Problem3_8.java
*author: Garrett Meyer
*course: CMPT 220
*assignment: Problem 3.8
*due date: September 14
*version: 1.8
*
*The file "Problem 3.8" is a program that prompts the user to enter three 
*integers and display the integers in non-decreasing order.
*/
import javax.swing.*;
import java.util.Scanner;
public class problem3_8 {

	public static void main(String[] args) {

		int num1;
		int num2;
		int num3;

		Scanner input = new Scanner(System.in);
		System.out.print("Enter three Integers: ");
		num1 = input.nextInt();
		num2 = input.nextInt();
		num3 = input.nextInt();
		input.close();

		if (num1 > num2) {
			num1 ^= num2;
			num2 ^= num1;
			num1 ^= num2;
		}

		if (num2 > num3) {
			num2 ^= num3;
			num3 ^= num2;
			num2 ^= num3;
		}

		if (num1 > num2) {
			num1 ^= num2;
			num2 ^= num1;
			num1 ^= num2;
		}
		System.out.println("Sorted Numbers: " + num1 + " " + num2 + " "
			+ num3);
	}
}