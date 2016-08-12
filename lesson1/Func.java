package lesson1;

public class Func
{
	public static String[] arr = { "", "один", "два", "три", "четыр", "пят", "шест", "сем", "восем", "девят",
			"десять" };

	private static String printOnce(int n)
	{

		String str = null;
		for (int i = 0; i <= arr.length; i++)
		{
			if (i == n)
			{
				if (n <= 10)
				{
					if (n >= 5 && n <= 9)
					{
						str = arr[i] + "ь";
					}
					else if (n == 4)
					{
						str = arr[i] + "е";
					}
					else
					{
						str = arr[i];
					}
				}
			}
		}
		return str;
	}

	public static String printTeense(int n)
	{
		String str = null;

		for (int i = 0; i <= arr.length; i++)
		{
			if (n >= 10 && n < 20)
			{
				if (n == 11)
				{
					str = arr[i / 10] + "адцать";
				}
				else if (i == (n - 10))
				{
					str = arr[i] + "надцать";
				}
			}
		}
		return str;
	}

	public static String printTeense_1(int n)
	{
		String str = null;

		for (int i = 0; i <= arr.length; i++)
		{
			if (i == n / 10)
			{
				if (n >= 20 && n <= 39)
				{
					str = arr[i] + "дцать";
				}
				else if (n == 40)
				{
					str = "сорок";
				}
				else if (n >= 50 && n <= 69 || n >= 80 && n <= 89)
				{
					str = Func.printOnce(i) + "десят";
				}
				else if (n >= 70 && n <= 79)
				{
					str = arr[i] + "десят";
				}
				else if (n >= 90 && n <= 99)
				{
					str = "девяносто";
				}
			}
		}
		return str;
	}

	public static String convertNumToString(int n)
	{
		if (n > 999 || n < 0)
			throw new IllegalArgumentException();
		String str = null;

		if (n <= 10)
		{
			str = printOnce(n);
		}
		else if (n >= 10 && n < 20)
		{
			str = printTeense(n);
		}
		else if (n >= 20 && n < 99 && n % 10 == 0)
		{
			str = printTeense_1(n);
		}
		else if (n % 10 != 0)
		{
			str = printTeense_1(n) + " " + printOnce(n % 10);
		}

		return str;
	}

	public static void main(String[] args)
	{
		System.out.println(Func.convertNumToString(99));
	}

}
