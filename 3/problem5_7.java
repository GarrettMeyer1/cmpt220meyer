/**
*file:Problem5_7.java
*author: Garrett Meyer
*course: CMPT 220
*assignment: Problem 5.7
*due date: September 22
*version: 1.8
*
*The file "Problem 5.7" is a program that computes future tuition
*/
public class problem5_7 {
	public static void main(String[] args) {
		double tuition = 10000;
		int year = 0;

		int i;
		for (i = 0; i < 4; i++) {
			tuition = tuition * 1.05;
			year++;
			System.out.println("Year " + year + " is " + tuition);
		}

		System.out.println(year + " years");
	}
}