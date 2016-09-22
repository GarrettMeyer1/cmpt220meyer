/**
*file:Problem5_13.java
*author: Garrett Meyer
*course: CMPT 220
*assignment: Problem 5.13
*due date: September 22
*version: 1.8
*
*The file "Problem 5.13" is a program that finds the largest integer 
*n such that n3 is less than 12,000.
*/
public class problem5_13 {

	public static void main(String[] args) {

		int n = 0;

		while (Math.pow(n, 3) < 12000) {
			n++;
		}
		n--;
		System.out.println(n + " is the largest integer n, such that n^3 is less than 12,000");
		System.out.println("Proof: " + (n -1 ) + "^3 = " + Math.pow(n - 1, 3));
		System.out.println("Proof: " + n + "^3 = " + Math.pow(n, 3));
		System.out.println("Proof: " + (n + 1) + "^3 = " + Math.pow(n + 1, 3));
	}
}