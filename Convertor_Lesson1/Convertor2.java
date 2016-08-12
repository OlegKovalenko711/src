package Convertor_Lesson1;

public class Convertor2
{
	public static String[] arr = { "", "один", "два", "три", "четыре", "пять", "шесть", "семь", "восемь", "девять", };
	public static String[] arrTen = { "десять", "одинадцать", "двенадцать", "тринадцать", "четырнадцать", "пятнадцать",
			"шестнадцать", "семнадцать", "восемнадцать", "девятнадцать" };

	public static String[] arrTen_1 = { "", "", "двадцать", "тридцать", "сорок", "пятьдесят", "шестьдесят", "семдесят",
			"восемдесят", "девяносто" };

	public static String[] arrHundred = { "", "сто", "двести", "триста", "четыреста", "пятьсот", "шестьсот", "семьсот",
			"восемьсот", "девятьсот" };

	public static int printOnce(String s)
	{
		int n = 0;

		for (int i = 0; i < arr.length; i++)
		{
			if (s.equals(arr[i]))
			{
				n = i;
			}
			else if (s.equals(arr[i]))
			{
				n = i;
			}
		}
		return n;
	}

	public static int printTen(String s)
	{
		int n = 0;
		for (int i = 0; i < arrTen.length; i++)
		{
			if (s.equals(arrTen[i]))
			{
				n = i + 10;
			}
		}
		return n;
	}

	public static int printTen_2(String s)
	{
		int n = 0;
		for (int i = 0; i < arrTen_1.length; i++)
		{
			if (s.equals(arrTen_1[i]))
			{
				n = i * 10;
			}
		}
		return n;
	}

	public static int printHundred(String s)
	{
		int n = 0;
		for (int i = 0; i < arrHundred.length; i++)
		{
			if (s.equals(arrHundred[i]))
			{
				n = i * 100;
			}
		}
		return n;
	}

	public static int convertToInt(String s)
	{
		if (s == null || s.equals(""))
			throw new IllegalArgumentException();
		int n = 0;

		String[] str = s.split(" ");

		if (s.equals(str[0]))
		{
			n = printOnce(s);
		}
		if (s.equals(str[0]) && printOnce(s) == 0)
		{
			n = printTen(s);
		}
		if (printOnce(s) == 0 && printTen(s) == 0)
		{
			if (str[0].equals(s))
			{
				n = printTen_2(str[0]);
			}
			else if (str[1].equals(s.substring(s.indexOf(' ') + 1)))
			{
				n = printTen_2(str[0]) + printOnce(str[1]);
			}

		}
		if (printTen_2(s) == 0 && printOnce(s) == 0 && printTen(s) == 0)
		{
			if (str[0].equals(s))
			{
				n = printHundred(str[0]);
			}
			else if (str[1].equals(s.substring(s.indexOf(' '))))
			{
				n = printHundred(str[0]) + printTen_2(str[1]);
			}

		}
		return n;
	}

	public static void main(String[] args)
	{
		System.out.println(Convertor2.convertToInt("сто"));
		// System.out.println(Convertor2.printHundred("сто"));

	}
}
