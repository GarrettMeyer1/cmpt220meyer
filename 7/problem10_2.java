/**
*file:Problem10_2.java
*author: Garrett Meyer
*course: CMPT 220
*assignment: Problem 10.2
*due date: October 27
*version: 1.8
*
*The file "Problem 10.2" is a BMI Class  
*/
public class problem10_2 {
	public static void main(String[] args) {
		BMI p = new BMI("Garrett", 19, 205, 6, 4);
		System.out.printf("Name: %s Age: %d Weight: %.2f Feet: %.2f Inches: %.2f\n", 
			p.getName(), p.getAge(), p.getWeight(), p.getFeet(), p.getInches());
	}
}