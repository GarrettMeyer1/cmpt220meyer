/**
*file:Problem 2.6.java
*author: Garrett Meyer
*course: CMPT 220
*assignment: Problem 2.6
*due date: September 7
*version: 1.8
*
*The file "Problem 2.6" reads an integer between 0 and 1000 
*and adds all the digits in the integer
*/
import java.util.Scanner;

public class problem2_6 {
  // == you are using tabs!!
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter an integer between 0 and 1000");
		int number = input.nextInt();

		int firstDigit = number % 10;
		int remainingNumber = number / 10;
		int secondDigit = remainingNumber % 10;
			remainingNumber = remainingNumber / 10; // incorrect indentation
		int thirdDigit = remainingNumber % 10;

		int sum = firstDigit + secondDigit + thirdDigit;

		System.out.println("The sum of all digits in " + number + "is" + sum);
	}
}
