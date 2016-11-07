/**
*file:Problem11_10.java
*author: Garrett Meyer
*course: CMPT 220
*assignment: Problem 11.10
*due date: November 3
*version: 1.8
*
*The file "Problem 11.10" is a MyStack class that extends ArrayList.
* and a test program that prompts the user to enter five strings and displays 
*them in reverse order.
*/
import java.util.ArrayList;
import java.util.Scanner;
public class problem11_10 {
	public static void main(String[] args) {

		MyStack stack = new MyStack();
		Scanner input = new Scanner(System.in);
		System.out.print("Enter 5 Strings... ");
		for (int i = 0; i < 5; i++) stack.push(input.next());

		System.out.println("Displaying them in Reverse Order.");
	while (stack.size() > 0) {
		System.out.println(stack.pop());
	    }
    }
}