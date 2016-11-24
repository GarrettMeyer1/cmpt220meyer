/**
*file:Problem18_1.java
*author: Garrett Meyer
*course: CMPT 220
*assignment: Problem 18.1
*due date: November 17
*version: 1.8
*
*The file "Problem 12.3" is a program that implements the Factorial Method 
*Using Recursion. This program will allow the user to enter an integer and 
*displats its factorial.
*/
import java.math.BigInteger;
import java.util.Scanner;
public class problem18_1 {

	public static void main(String[] args) {

		System.out.print("Enter an Integer: ");
		int n = new Scanner(System.in).nextInt();

		System.out.println("It's Factorial is: " + factorial(new BigInteger(
			n+"")));
	}

	private static BigInteger factorial(BigInteger n) {
		if (n.compareTo(BigInteger.ONE) == 0)
			return BigInteger.ONE;
		else
			return n.multiply(factorial(n.subtract(BigInteger.ONE)));
	}
}