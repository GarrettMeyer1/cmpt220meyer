/**
*file:Problem 4.26.java
*author: Garrett Meyer
*course: CMPT 220
*assignment: Problem 4.26
*due date: September 14
*version: 1.8
*
*The file "Problem 4.26" is a program that generates a plate number.
*/
import java.util.Scanner;
public class problem4_26 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter an amount in double, for example 16.27: ");
		String amountS = input.nextLine();
		int amount;

		int pos = amountS.indexOf('.');

		if (pos == -1) {
			amount = Integer.parseInt(amountS);
		} else {
			System.out.println("I am here");
			String dollars = amountS.substring(0, pos);
			String cents = amountS.substring(pos + 1);

			System.out.println(dollars);
			System.out.println(cents);
			switch (cents.length()) {
				case 1: cents += "0"; break;
				case 2: cents = cents.substring(0,2); break;
					default: cents += "00";
			}
			amount = Integer.parseInt(dollars + cents);
			System.out.println(Integer.parseInt(dollars + cents));
		}

		int remainingAmount = amount;

// One Dollar(s)
		int numberOfOneDollars = remainingAmount / 100;
		remainingAmount = remainingAmount % 100;
// Quarter(s)
		int numberOfQuarters = remainingAmount / 25;
		remainingAmount = remainingAmount % 25;
// Dime(s)
		int numberOfDimes = remainingAmount / 10;
		remainingAmount = remainingAmount % 10;
// Nickel(s)
		int numberOfNickels = remainingAmount / 5;
		remainingAmount = remainingAmount % 5;
// Penny(s)
		int numberOfPennies = remainingAmount / 1;
		remainingAmount = remainingAmount;

//Results
		System.out.println("Your amount " + amount + "consists of");
		System.out.println("	" + numberOfOneDollars + "dollars");
		System.out.println("	" + numberOfQuarters + "quarters");
		System.out.println("	" + numberOfDimes + "dimes");
		System.out.println("	" + numberOfNickels + "nickels");
		System.out.println("	" + numberOfPennies + "pennies");
	}
}