/**
*file:Problem6_20.java
*author: Garrett Meyer
*course: CMPT 220
*assignment: Problem 6.20
*due date: September 28
*version: 1.8
*
*The file "Problem 6.20" is a method that counts the number of letters 
*in a string
*/
import java.util.Scanner;

public class problem6_20 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Enter a String: ");
		String s = input.nextLine();

		System.out.println("The nunber of letters inside the string is: "
		+ countLetters(s));
	}

	public static int countLetters(String s) {

		int letterCount = 0;
		for (int i = 0; i < s.length(); i++) {
			if (isLetter(s.charAt(i))) letterCount++;
		}
		return letterCount;
	}

	public static boolean isLetter(char ch) {
		ch = Character.toUpperCase(ch);
		return (ch >= 'A' && ch <= 'Z');
	}
}