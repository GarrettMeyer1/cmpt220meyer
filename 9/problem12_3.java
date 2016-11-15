/**
*file:Problem11_10.java
*author: Garrett Meyer
*course: CMPT 220
*assignment: Problem 12.3
*due date: November 10
*version: 1.8
*
*The file "Problem 12.3" is a program that meets the fol- lowing requirements:
*Creates an array with 100 randomly chosen integers. Prompts the user to 
*enter the index of the array, then displays the corresponding element value. 
*If the specified index is out of bounds, display the message Out of Bounds.
*/
import java.util.Scanner;
public class problem12_3 {

	public static void main(String[] args) {
		int[] array = new int[100];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 100);
		}
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an index: ");
		try {
			int index = input.nextInt();
			System.out.println("array[" + index + "] = " + array[index]);
		} catch (IndexOutOfBoundsException ex) {
			System.out.println("Index " + ex.getLocalizedMessage() + " is out of bounds");
		} catch (Exception ex) {
			System.out.println("Invalid Input");
		}
	}
}