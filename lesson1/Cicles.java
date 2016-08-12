package lesson1;

public class Cicles
{
	public static int findSum()
	{

		int sum = 0;
		for (int i = 0; i < 100; i++)
		{
			if (i % 2 == 0)
			{
				sum += i;

			}

		}
		return sum;
	}

	public static int findCount()
	{
		int count = 0;

		for (int i = 0; i < 100; i++)
		{
			if (i % 2 == 0)
			{

				count++;
			}

		}
		return count;
	}

	public static int findProstoeChislo(int a)
	{
		if (a == 0)
			throw new IllegalArgumentException();

		int res = 0;
		if (a % 2 == 0)
		{
			res = 1;
		}
		else
		{
			res = 2;
		}
		return res;
	}

	public static int koren(int x)
	{
		if (x == 0)
			throw new IllegalArgumentException();

		int num = 1;
		int rez = 0;
		while (x > 0)
		{
			x -= num;
			num += 2;
			rez += (x < 0) ? 0 : 1;
		}
		return rez;
	}

	public static int countFact(int n)
	{
		if (n < 0)
			throw new IllegalArgumentException();

		int sum = 1;
		for (int i = 1; i <= n; i++)
		{
			sum *= i;
		}
		return sum;
	}

	public static int countDigit(int x)
	{
		if (x == 0)
			throw new IllegalArgumentException();

		int n = 0;
		while (x / 10 > 0)
		{
			n += x % 10;
			x /= 10;
			if (x < 10)
			{
				n += x;
			}
		}
		return n;
	}

	public int printMirror(int x)
	{
		int n = 0;
		while (x / 10 > 0)
		{
			n = n * 10 + x % 10;
			x /= 10;
			if (x < 10)
			{
				n = n * 10 + x;
			}

		}
		return n;
	}

}
