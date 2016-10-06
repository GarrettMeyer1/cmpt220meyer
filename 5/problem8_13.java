/**
*file:Problem8_13.java
*author: Garrett Meyer
*course: CMPT 220
*assignment: Problem 8.13
*due date: October 6
*version: 1.8
*
*The file "Problem 7.18" is a program that has a Multi-Dimensional Arrays
*/
import util.Scanner;
public class problem8_13{
	public static void main(String[] args) {
	//Create an Integer Array of Size 10
	int[][] p = new int[20][10];

	//p[2][4]    //Third Row, Fifth Column
	for (int row = 0; row<20; row++ ) {
		for (int col = 0; col<10; col++) {
			p[row][col] = (int) (Math.random()*100);
			System.out.print(p[row][col] + " ");
		}
		System.out.println();
		}

    int rr=0;
    int rc=0; //Result Row and Column
    int maxVal = 0;

	for (int row = 0; row<20; row++ ) {
		for (int col = 0; col<10; col++) {
			if (p[row][col] >= maxVal) {
				rr = row;
				rc = col;
				maxVal = p[row][col];
				}
			}
		}
	}
System.out.println("Max Value is: " + maxVal);
System.out.println("Position in row: " + (rr-1) + "col;""  + (rc -1));

}