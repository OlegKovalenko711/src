package lesson5;

public class Calc
{

	public static double calculate(double a, double b, char op)
	{
		double res = 0;
		switch (op)
		{
		case '+':
			res = a + b;
			break;
		case '-':
			res = a - b;
			break;
		case '*':
			res = a * b;
			break;
		case '/':
			res = a / b;
			break;
		case '%':
			res = a % b;
			break;
		case '#':
			res = a * (b / 100);
			break;
		}
			return res;
	
	}

	public static double sqrt(double a)
	{
		double res = Math.sqrt(a);
		return res;
	}

	public static double pow(double a)
	{
		double res = Math.pow(a, a);
		return res;
	}

	public static double sin(double a)
	{
		double rad = Math.toRadians(a);
		double res = Math.sin(rad);
		return res;
	}

	public static double cos(double a)
	{
		double rad = Math.toRadians(a);
		double res = Math.cos(rad);
		return res;
	}

	public static String bin(double res2)
	{
		String res = "";

		for (int i = (int) res2; i > 0; i /= 2)
			if (i % 2 == 0)
			{
				res += "0";
			}
			else
			{
				res += "1";
			}

		return res;
	}

	
}
