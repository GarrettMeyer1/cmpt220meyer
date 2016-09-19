/**
*file:Problem2_1.java
*author: Garrett Meyer
*course: CMPT 220
*assignment: Problem2_1
*due date: September 7
*version: 1.8
*
*The file "Problem2_1" is a string that converts Fahrenheit to Celsius
*/
import java.util.Scanner; // Scanner is in the java.util package 
public class problem2_1{
// == you are using tabs!!
	public static void main(String[] args) { 
		Scanner input = new Scanner(System.in);
// Enter Numbers to Convert the Temperature
		System.out.println("Enter a degree in Celsius: ");
 		double celsius = input.nextDouble();
// Average
 		double fahrenheit =(((9.0 / 5.0) * celsius) + 32.0);
 // Display results
 		System.out.println(celsius + " degree Celsius is equal to " + fahrenheit + " in Fahrenheit");
 	} 
}
