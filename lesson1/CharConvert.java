package lesson1;

public class CharConvert
{
	public static String convertToString(int n)
	{
		String str = Integer.toString(n);
		return str;
	}

	public static String convertToString(double n)
	{
		String str = Double.toString(n);
		return str;
	}

	public static int convertToString(String n)
	{
		int str = Integer.parseInt(n);
		return str;
	}

	public static double convertToDouble(String n)
	{
		double str = Double.parseDouble(n);
		return str;
	}

}
