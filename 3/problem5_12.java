/**
*file:Problem5_12.java
*author: Garrett Meyer
*course: CMPT 220
*assignment: Problem 5.12
*due date: September 22
*version: 1.8
*
*The file "Problem 5.12" is a program that find the smallest integer n 
*such that n2 is greater than 12,000.
*/
import java.util.Scanner;
public class problem5_12 {
	public static void main(String[] args) {

		int n = 0;

		while (Math.pow(n, 2) < 12000) {
			n++;
		}

		System.out.println(n + " is the lowest number, such that n^2 is greater than 12,000");
		System.out.println("Proof: " + (n - 1) + "^2 = " + Math.pow(n - 1,2));
		System.out.println("Proof: " + n + "^2 = " + Math.pow(n, 2));

	} 
}