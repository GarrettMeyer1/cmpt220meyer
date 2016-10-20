/**
*file: Location.java
* My class for Problem9_13
*/
public class Location {

	public int row;
	public int column;
	public double maxValue;

	public Location(int row, int column, double maxValue) {
		this.row = row;
		this.column = column;
		this.maxValue = maxValue;
	}

	public static Location locateLargest(double[][] a) {

		int row = 0;
		int column = 0;
		double maxValue = a[row][column];

		for (int i = 0; i < a.length; i++) {
			for (int g = 0; g < a[i].length; g++) {
				if (maxValue < a[i][g]) {
					maxValue = a[i][g];
					row = i;
					column = g;
				}
			}
		}

		return new Location(row,column,maxValue);
	}
}