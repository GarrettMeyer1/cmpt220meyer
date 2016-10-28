/**
*file:Problem10_10.java
*author: Garrett Meyer
*course: CMPT 220
*assignment: Problem 10.10
*due date: October 27
*version: 1.8
*
*The file "Problem 10.10" is a class named Queue for storing integers. 
*Like a stack, a queue holds elements. In a stack, the elements are retrieved 
*in a last-in first-out fashion. In a queue, the elements are retrieved in a 
*first-in first-out fashion.  
*/
public class problem10_10 {

	public static void main(String[] args) {
		Queue queue = new Queue();
		for (int i = 0; i < 20; i++) { //Inserting 20 Numbers into the Queue
			queue.enqueue(i);
		}

		for (int i = 0; i < 20; i++) {
			System.out.printf("%2d ", queue.dequeue());
			if ((i + 5) % 5 == 0) System.out.printf("\n");
		}
	}
}