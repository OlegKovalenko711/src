package lesson1;

public class Func
{
	public static String[] arr = { "", "����", "���", "���", "�����", "���", "����", "���", "�����", "�����",
			"������" };

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
						str = arr[i] + "�";
					}
					else if (n == 4)
					{
						str = arr[i] + "�";
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
					str = arr[i / 10] + "������";
				}
				else if (i == (n - 10))
				{
					str = arr[i] + "�������";
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
					str = arr[i] + "�����";
				}
				else if (n == 40)
				{
					str = "�����";
				}
				else if (n >= 50 && n <= 69 || n >= 80 && n <= 89)
				{
					str = Func.printOnce(i) + "�����";
				}
				else if (n >= 70 && n <= 79)
				{
					str = arr[i] + "�����";
				}
				else if (n >= 90 && n <= 99)
				{
					str = "���������";
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
