/**
*file:Problem11_13.java
*author: Garrett Meyer
*course: CMPT 220
*assignment: Problem 11.13
*due date: November 3
*version: 1.8
*
*The file "Problem 11.13" is a method that removes the duplicate elements from 
*an array list of integers using the following header: 
*public static void removeDuplicate(ArrayList<*Integer*> list)
*/
import java.util.ArrayList;
import java.util.Scanner;
public class problem11_13 {
	public static void main(String[] args) {
		System.out.print("Enter 10 Integers: ");
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList();
		for (int i = 0; i < 10; i++) list.add(input.nextInt());

		System.out.println("Removing Duplicates...");
	    removeDuplicate(list);
	    System.out.println("Displaying List...");
	    System.out.println(list);
	}

	public static void removeDuplicate(ArrayList<Integer> list) {
		ArrayList<Integer> temp = new ArrayList();
		for (int i = 0; i < list.size(); i++) {
			if (!temp.contains(list.get(i))) {
				temp.add(list.get(i));
			}
		}
		list.clear();
		list.addAll(temp);
	}
}