/**
*file:Problem6_2.java
*author: Garrett Meyer
*course: CMPT 220
*assignment: Problem 6.2
*due date: September 22
*version: 1.8
*
*The file "Problem 6.2" is a program that computes the sum of the digits in 
*an integer 
*/
import java.util.Scanner;
public class problem6_2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		long num = input.nextLong();

		System.out.println("The sum of the digits is " + sumDigits(num));
	}

	public static int sumDigits(long n) {
		int sum = 0;

		while (n != 0) {
			sum += n % 10;
			n /= 10;
		}

		return sum;
	}
}