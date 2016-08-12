package lesson1;

public class WorkWithDigit
{
	public static int countDigits(int a, int b)
	{

		if (a == 0 || b == 0)
			throw new IllegalArgumentException();

		int res = 0;

		if ((a % 2) == 0)
		{
			res = a *= b;
		}
		else
		{
			res = a += b;
		}
		return res;
	}

	public static int findPoint(int x, int y)
	{
		if (x == 0 || y == 0)
			throw new IllegalArgumentException();

		int res = 0;
		if ((x > 0) && (y > 0))
		{
			res = 1;
		}
		else if ((x < 0) && (y > 0))
		{
			res = 2;
		}

		else if ((x < 0) && (y < 0))
		{
			res = 3;
		}

		else if ((x > 0) && (y < 0))
		{
			res = 4;
		}

		return res;
	}

	public static int findSum(int a, int b, int c)
	{
		if (a <= 0 && b <= 0 && c <= 0)
			throw new IllegalArgumentException();

		int result = 0;
		if (a > 0 && b > 0 && c > 0)
		{
			result = a + b + c;
		}
		else if (a > 0 && b > 0)
		{
			result = a + b;
		}
		else if (a > 0 && c > 0)
		{
			result = a + c;
		}
		else if (b > 0 && c > 0)
		{
			result = b + c;
		}
		return result;
	}

	public static int countVirajenie(int a, int b, int c)
	{

		if (a == 0 && b == 0 && c == 0)
			throw new IllegalArgumentException();

		int mul = a * b * c;
		int plus = a + b + c;
		int res = 0;

		if (plus > mul)
		{
			res = plus + 3;
		}
		else
		{
			res = mul + 3;
		}
		return res;
	}

	public static char countBal(int rate)
	{
		if (rate < 0 || rate > 100)
			throw new IllegalArgumentException();

		char bal = 0;

		if (rate <= 19)
		{
			bal = 'F';
		}
		else if (rate > 19 && rate < 40)
		{
			bal = 'E';
		}
		else if (rate > 40 && rate < 60)
		{
			bal = 'D';
		}
		else if (rate > 59 && rate < 74)
		{
			bal = 'C';
		}
		else if (rate > 74 && rate < 90)
		{
			bal = 'B';
		}
		else if (rate > 89 && rate < 100)
		{
			bal = 'A';
		}
		return bal;
	}

}
