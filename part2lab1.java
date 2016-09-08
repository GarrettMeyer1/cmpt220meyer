/**
*file:Problem 2.6.java
*author: Garrett Meyer
*course: CMPT 220
*assignment: Part 2 of Lab 1
*due date: September 7
*version: 1.8
*
*The file "part2lab1" reads an integer between 0 and 1000 
*and adds all the digits in the integer
*/
import java.util.Scanner;

public class part2lab1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter student's mid term exam");
		int midterm = input.nextInt();
		System.out.println("Enter student's final exam");
		int finalexam = input.nextInt();
		System.out.println("Enter student's project grade");
		int project = input.nextInt();
		System.out.println("Enter student's homework and lab grades");
		int hwlab = input.nextInt();

		int total= midterm + finalexam + project + hwlab;
		int finalgrade = total / 4;

		System.out.println("Your final grade is " + finalgrade);
	}
}