package lesson1;

public class Convert {
	public String convertToString(int n) {
		String str = Integer.toString(n);
		return str;
	}

	public String convertToString(double n) {
		String str = Double.toString(n);
		return str;
	}

	public int convertToString(String n) {
		int str = Integer.parseInt(n);
		return str;
	}

	public double convertToDouble(String n) {
		double str = Double.parseDouble(n);
		return str;
	}



}
