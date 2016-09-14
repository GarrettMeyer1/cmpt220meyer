/**
*file:Problem3_11.java
*author: Garrett Meyer
*course: CMPT 220
*assignment: Problem 3.11
*due date: September 14
*version: 1.8
*
*The file "Problem 3.11" is a program that prompts the user 
*to enter the month and year and displays the number of days in the month. 
*/
import java.util.Scanner;
public class problem3_11 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int numberOfDaysInMonth = 0; 
		String nameOfMonth = "Unknown";

		System.out.print("Enter a month number: ");
		int month = input.nextInt();

		System.out.print("Enter a year: ");
		int year = input.nextInt();

		switch (month) {
			case 1: 
				nameOfMonth = "January";
				numberOfDaysInMonth = 31;
				break;
			case 2: 
				nameOfMonth = "February";
                if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
                    numberOfDaysInMonth = 29;
                } else {
                    numberOfDaysInMonth = 28;
                }
				break;
			case 3: 
				nameOfMonth = "March";
				numberOfDaysInMonth = 31;
				break;
			case 4: 
				nameOfMonth = "April";
				numberOfDaysInMonth = 30;
				break;
			case 5: 
				nameOfMonth = "May";
				numberOfDaysInMonth = 31;
				break;
			case 6: 
				nameOfMonth = "June";
				numberOfDaysInMonth = 30;
				break;
			case 7: 
				nameOfMonth = "July";
				numberOfDaysInMonth = 31;
				break;
			case 8: 
				nameOfMonth = "August";
				numberOfDaysInMonth = 31;
				break;
			case 9: 
				nameOfMonth = "September";
				numberOfDaysInMonth = 30;
				break;
			case 10: 
				nameOfMonth = "October";
				numberOfDaysInMonth = 31;
				break;
			case 11: 
				nameOfMonth = "November";
				numberOfDaysInMonth = 30;
				break;
			case 12: 
				nameOfMonth = "December";
				numberOfDaysInMonth = 31;
		}
		System.out.println(nameOfMonth + " " + year + " has " + numberOfDaysInMonth + " days");
	}
}