/**
*file:Problem7_32.java
*author: Garrett Meyer
*course: CMPT 220
*assignment: Problem 7.32
*due date: October 6
*version: 1.8
*
*The file "Problem 7.32" is a program that partitions a list
*/
import ToolKit.Kit;
import java.util.Scanner;
public class problem7_32 {
	public static void main(String[] agrs) {

		Scanner input = new Scanner(System.in);
		System.out.println("First Number = Size of Array, Second Number = pivot ");
		System.out.print("Enter a List");
		int size = input.nextInt();
		int[] list = new int[size];
		for (int i = 0; i < size; i++) list[i] = input.nextInt();

		partition(list);
	    Kit.displayGrid(list);
	}

	public static int partition(int[] list) {

		int first = 0;
		int low = first + 1;
		int high = list.length - 1;
		int pivot = list[first];

		while (high > low) {
			while (low <= high && list[low] <= pivot) low++;
			while (low <= high && list[high] <= pivot) high--;

			if (high > low) {
				int temp = list[high];
				list[high] = list[low];
				list[low] = temp;
			}
		}

		while (high >= low && list[high] >= pivot) high--;

		if (high > first) {
			int temp = list[high];
			list[high] = list[first];
			list[first] = temp;
			return high;
		}
		else {
			return first;
		}
	}
}