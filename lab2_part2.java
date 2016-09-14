/**
*file:Lab2_Part2.java
*author: Garrett Meyer
*course: CMPT 220
*assignment: Part 2 of Lab 2
*due date: September 7
*version: 1.8
*
*The file "lab2_part2" reads an integer between 0 and 1000 
*and adds all the digits in the integer
*/
import java.util.Scanner;

public class lab2_part2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

//Grades		
		System.out.println("Enter student's mid term exam");
		int midterm = input.nextInt();
		
		System.out.println("Enter student's final exam");
		int finalexam = input.nextInt();

		System.out.println("Enter student's project grade");
		int project = input.nextInt();

		System.out.println("Enter student's homework and lab grades");
		int hwlab = input.nextInt();

//Total
		int total = midterm + finalexam + project + hwlab;
		int finalgrade = total / 4;

		System.out.println("Your Final Grade is " + finalgrade);
	}
}