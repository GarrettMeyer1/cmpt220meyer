/**
*file:Problem4_15.java
*author: Garrett Meyer
*course: CMPT 220
*assignment: Problem 4.15
*due date: September 14
*version: 1.8
*
*The file "Problem 4.15" is a program that prompts the user to enter a letter and displays its correspond- ing number.
*/
import java.util.Scanner;
public class problem4_15 {

	private static final int INVALID_KEY = -1;

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Enter a letter: ");
		char ch = input.next(). charAt(0);

		int numberPressed = correspondingNumber(ch);

		if (numberPressed != INVALID_KEY) {

			System.out.println("The corresponding number is " +
				numberPressed);
		} else {
			System.out.println(ch + " is an invalid input");
		}
	}

    public static int correspondingNumber(char ch) {

        ch = Character.toUpperCase(ch);

        if (ch >= 'A' && ch <= 'O') {
            int number = 2; 
            int n = ch - 'A';
            number += (n / 3);
            return number;
        }

		if (ch >= 'P' && ch <= 'S') return 7;
		if (ch >= 'T' && ch <= 'V') return 8;
		if (ch >= 'W' && ch <= 'Z') return 9;

		return INVALID_KEY;
		}
	}

