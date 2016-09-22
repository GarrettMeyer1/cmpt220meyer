/**
*file:Problem6_3.java
*author: Garrett Meyer
*course: CMPT 220
*assignment: Problem 6.3
*due date: September 22
*version: 1.8
*
*The file "Problem 6.3" is a program that writes the methods with the following headers:
*Return the reversal of an integer, i.e., reverse(456) returns 654
*public static int reverse(int number)
*Return true if number is a palindrome
*public static boolean isPalindrome(int number)
*Use the reverse method to implement isPalindrome. 
*A number is a palin- drome if its reversal is the same as itself. 
*Write a test program that prompts the user to enter an integer and 
*reports whether the integer is a palindrome.
*/
import java.util.Scanner;
public class problem6_3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a integer: ");
        int num = input.nextInt();

        if (isPalindrome(num)) {
            System.out.println(num + " is a palindrome. ");
        } else {
            System.out.println(num + " is not a palindrome.");
        }
    }

    public static int reverse(int number) {

        int reverse = 0;
        while (number != 0) {

            reverse *= 10; 
            reverse += number & 10;
            number /= 10;
        }

        return reverse;
    }

    public static boolean isPalindrome(int number) {

        return (number == reverse(number));
    }
}