/**
*file:Problem3_15.java
*author: Garrett Meyer
*course: CMPT 220
*assignment: Problem 3.15
*due date: September 14
*version: 1.8
*
*The file "Problem 3.15" is the Lottery Game
*/
import java.util.Scanner;

public class problem3_15 {
	public static void main(String [] args) {
//Generate lottery numbers
		int lottery = (int) (Math.random() * 1000);

//Prompt the user to enter a guess
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your lottery pick (three digits): ");
		int guess = input.nextInt();

// Lottery Digits
		int lotteryDigit1 = lottery / 100;
		int lotteryDigit2 = lottery % 100 / 10;
		int lotteryDigit3 = lottery % 10;

// Get digits from Guess
		int guessDigit1 = guess / 100;
		int guessDigit2 = guess % 100 / 10;
		int guessDigit3 = guess % 10; 

		System.out.println("The lottery number is " + lottery);

//Check the Guess
		if (guess == lottery) {
			System.out.println("Exact match: You Win $10,000");
		} else if (((guessDigit2 == lotteryDigit1)
			&& (guessDigit1 == lotteryDigit2) 
			&& (guessDigit3 == lotteryDigit3)) ||
			((guessDigit1 == lotteryDigit1) && (guessDigit3 ==
				lotteryDigit2) && (guessDigit2 == lotteryDigit3)) ||
			((guessDigit3 == lotteryDigit1) && (guessDigit1 ==
				lotteryDigit2) && (guessDigit2 == lotteryDigit3)) ||
			((guessDigit2 == lotteryDigit1) && (guessDigit3 ==
				lotteryDigit2) && (guessDigit1 == lotteryDigit3)) ||
			((guessDigit3 == lotteryDigit1) && (guessDigit2 ==
				lotteryDigit2) && (guessDigit1 == lotteryDigit3))) {
			System.out.println("Match all digits: You Win $3,000");
		} else if ((guessDigit1 == lotteryDigit1) || (guessDigit1 == 
			lotteryDigit2) || (guessDigit1 == lotteryDigit3) || 
			(guessDigit2 == lotteryDigit1) || (guessDigit2 ==
				lotteryDigit2) || (guessDigit2 == lotteryDigit3) || 
			(guessDigit3 == lotteryDigit1) || (guessDigit3 ==
				lotteryDigit2) || (guessDigit3 == lotteryDigit3)){
			System.out.println("Match one digit: You Win $1000");
		} else {
			System.out.println("Sorry, No Match");
		}
	}
}