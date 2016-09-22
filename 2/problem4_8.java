/**
*file:Problem4_8.java
*author: Garrett Meyer
*course: CMPT 220
*assignment: Problem 4.8
*due date: September 14
*version: 1.8
*
*The file "Problem 4.8" is a program that receives an integer between 0 and 127) and displays its character.
*/
import java.util.Scanner;
public class problem4_8 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);	
		System.out.print("Enter an ASCII code: ");
		int number = input.nextInt();
		input.close();

		System.out.println("The character for ASII code " + number +
			"is" + (char) number);
	}
}