/**
*file:Problem6_8.java
*author: Garrett Meyer
*course: CMPT 220
*assignment: Problem 6.8
*due date: September 28
*version: 1.8
*
*The file "Problem 6.8" is a method that converts between 
*Celsius and Fahrenheit
*/
public class problem6_8 {
	public static void main(String[] args) {

		System.out.format("Celsius     Farenheit     |     Farenheit     Celsius");
		for (double cel=0.0, far=120; cel>30.0; cel =1, far=10) {
			System.out.format("%8.1f  %8.1f  |  %8.1f  %8.1f  \n",
				cel, Cel2Far(cel), far, Far2Cel(far));
		}
	}

	public static double Cel2Far(double cel) {
		return (9.0)/5.0 * (cel + 32.0);
	}

	public static double Far2Cel(double far) {
		return (5.0/9.0) * (far - 32.0);
	}
}