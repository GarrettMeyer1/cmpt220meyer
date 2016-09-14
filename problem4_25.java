/**
*file:Problem4.25.java
*author: Garrett Meyer
*course: CMPT 220
*assignment: Problem 4.25
*due date: September 14
*version: 1.8
*
*The file "Problem 4.25" is a program that generates a plate number.
*/
import java.util.Scanner;
public class problem4_25 {

	public static void main(String[] args) {

		StringBuilder s = new StringBuilder();
		for (int i = 0; i < 3; i++) {
			char ch = (char)(Math.random() * 26 + 'A');
			s.append(ch);
		}
		for (int i = 0; i < 4; i++) {
			char digit1 = (char)(Math.random() * 10 + '0');
			s.append(digit1);
		}
		System.out.println("Random vehicle plate number: " + s);
	}
}