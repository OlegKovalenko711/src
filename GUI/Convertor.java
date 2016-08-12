package GUI;

public class Convertor
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
			if (n == 0)
			{
				str = "����";
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
				else if (n >= 40 && n <= 49)
				{
					str = "�����";
				}
				else if (n >= 50 && n <= 69 || n >= 80 && n <= 89)
				{
					str = Convertor.printOnce(i) + "�����";
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

	public static String printHundred(int n)
	{
		String str = null;

		for (int i = 0; i <= arr.length; i++)
		{
			if (i == n / 100)
			{
				if (n >= 100 && n <= 199)
				{
					str = "���";
				}

			}
			else if (n >= 200 && n <= 299)
			{
				str = "������";
			}
			else if (n >= 300 && n <= 499)
			{
				str = Convertor.printOnce(n / 100) + "���";
			}
			else if (n >= 500 && n <= 999)
			{
				str = Convertor.printOnce(n / 100) + "���";
			}
		}

		return str;
	}

	public static String convertNumToString(int n)
	{
		int mod = n / 10 % 10 * 10;
		int modPlus = n % 10 + 10;
		int tenMods = n / 10 % 10 + 9;

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
		else if (n >= 20 && n <= 99)
		{
			if (n % 10 == 0)
			{
				str = printTeense_1(n);
			}
			else if (n % 10 != 0)
			{
				str = printTeense_1(n) + " " + printOnce(n % 10);
			}
		}

		else if (n >= 100 && n <= 999)
		{
			if (mod == 0)
			{
				if (n % 10 != 0)
				{
					str = printHundred(n) + " " + printOnce(n % 10);
				} 
				else
				{
					str = printHundred(n);
				}
			}
			else if (modPlus >= 10 && modPlus <= 19 && mod < 20)
			{
				if (modPlus == 10)
				{
					str = printHundred(n) + " " + printOnce(modPlus);
				}
				else
				{
					str = printHundred(n) + " " + printTeense(modPlus);
				}
			}
			else if (mod != 0)
			{
				if (n % 10 == 0)
				{
					str = printHundred(n) + " " + printTeense_1(mod);

				}
				else
				{
					str = printHundred(n) + " " + printTeense_1(mod) + " " + printOnce(n % 10);
				}
			}
		}

		return str;
	}

	
}
