/**
* Problem 10.2 Class
* BMI Class
* Garrett Meyer
*/
public class BMI {
	String name;
	int age;
	double weight; //In Pounds
	double height; //In Inches
	double feet;
	double inches;
	public static final double kilogramsPerPound = 0.45359237;
	public static final double metersPerInch = 0.0254;

	public BMI(String name, int age, double weight, double feet, double inches){
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.feet = feet;
		this.inches = inches;
		this.height = feet * 12 + inches;
	}
	public BMI(String name, int age, double weight, double height) {
		this(name, age, weight, height / 12, height % 12);
	}
	public BMI(String name, double weight, double height) {
		this(name, 20, weight, height);
	}
	public double getBMI() {
		double bmi = weight * kilogramsPerPound /
		     ((height * metersPerInch) * (height * metersPerInch));
		return Math.round(bmi * 100) / 100.0;
	}

	public String getStatus() {
		double bmi = getBMI();
		if (bmi < 18.5)
			return "Underweight";
		else if (bmi < 25)
			return "Normal";
		else if (bmi < 30)
			return "Overweight";
		else
			return "Obese";
	}

	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
    public double getWeight() {
		return weight;
	}
	public double getHeight() {
		return height;
	}
	public double getInches() {
		return inches;
	}
	public void setInches(double inches) {
		this.inches = inches;
	}
	public double getFeet() {
		return feet;
	}
	public void setFeet(double feet) {
		this.feet = feet;
	}
}