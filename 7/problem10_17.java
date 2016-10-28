/**
*file:Problem10_17.java
*author: Garrett Meyer
*course: CMPT 220
*assignment: Problem 10.17
*due date: October 27
*version: 1.8
*
*The file "Problem 10.17" is a program that finds the first ten square numbers 
* that are greater then "Long.Max_Value"
*/
import java.math.BigDecimal;
public class problem10_17 {
	public static void main(String[] args) {

		BigDecimal longMaxValue = new BigDecimal(Long.Max_Value);
		long start = (long) Math.sqrt(Long.Max_Value);
		BigDecimal n = new BigDecimal(start);
		int count = 0;

		while (count < 10) {

			BigDecimal squared = n.multiply(n);
			if (squared.compareTo(longMaxValue) > 0) {
				count++;
				System.out.println(count+": " + n + " squared = " + squared);
			}
			n = n.add(BigDecimal.One);
		}
	}
}