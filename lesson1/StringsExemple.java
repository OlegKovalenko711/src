package lesson1;

import java.util.regex.Pattern;
import java.util.StringTokenizer;
import java.util.regex.Matcher;

public class StringsExemple
{
	private static String[] str;
	private static char[] chr;

	// ���� ������, ��������� �� ����, ����������� ��������� � �������
	// ����������. ���������� ����� ������ ��������� �����.

	public static int smallWorld(String text)
	{
		StringTokenizer st = new StringTokenizer(text, ",.:; ");
		int min = st.nextToken().length();
		int tmp = 0;

		while (st.hasMoreTokens())
		{
			tmp = st.nextToken().length();
			if (min > tmp)
			{
				min = tmp;
			}
		}
		return min;
	}

	// ��� ������ ����. �������� ��������� ��� ������� ����, ������� ��������
	// ����� �� ������ "$"

	public static String refactSymbols(String text)
	{
		str = text.split("\\s|\\,|\\.|\\:|\\;");
		String res = "";

		for (int i = 0; i < str.length; i++)
		{
			if (str[i].length() < 3)
			{
				res += str[i] + " ";
			}
			else
			{
				res += str[i].substring(0, str[i].length() - 3) + "$$$ ";
			}
		}
		return res;
	}

	// ������� � ������ ������� ����� ������ ����������, ���� ��� ���
	// �����������.

	public static String createProbel(String text)
	{
		String res = "";
		char[] chrStr = text.toCharArray();

		for (int i = 0; i < chrStr.length; i++)
		{
			if (chrStr[i] == ':' || chrStr[i] == ',' || chrStr[i] == '.' || chrStr[i] == ';')
			{
				res += chrStr[i] + " ";
			}
			else
			{
				res += chrStr[i];
			}
		}

		return res;
	}

	// �������� � ������ ������ ���� ��������� ������� �������������� �������.

	public static String oneSymbol(String text)
	{

		chr = text.toCharArray();
		char c;
		int count = 0;
		String res = "";

		for (int i = 0; i < chr.length; i++)
		{
			c = chr[i];
			for (int j = 0; j < chr.length; j++)
			{
				if (chr[j] == c)
				{
					count++;

					if (count > 1)
					{
						chr[j] = '*';
					}
					else
					{
						res += chr[j];
					}
				}
			}
			count = 0;
		}

		String tmp = "";
		Pattern regexp = Pattern.compile("[a-zA-Z]|");
		Matcher m = regexp.matcher(res);

		while (m.find())
		{
			tmp += m.group();
		}
		return tmp;
	}

	private static Matcher Matcher(Pattern p)
	{
		// TODO Auto-generated method stub
		return null;
	}

	// ������� 2 (�������� � ������ ������ ���� ��������� ������� ��������������
	// �������.)
	public static String oneSymbol_1(String text)
	{
		String res = "";
		char tmp = 0;

		while (!text.isEmpty())
		{
			tmp = text.charAt(0);
			res += tmp;
			text = text.replaceAll(tmp + "", "");
		}
		return res;
	}

	// ���������� ���������� ���� �� ��������� ������������� ������.(����������
	// ���������)
	public static int countOfWord(String text)
	{
		Pattern regexp = Pattern.compile("[a-zA-Z�-��-�]+");
		Matcher m = regexp.matcher(text);
		int res = 0;
		while (m.find())
		{
			res++;
		}
		return res;
	}

	// ������� 2
	public static int countOfWord_2(String text)
	{
		StringTokenizer st = new StringTokenizer(text, ",.:; ");
		int res = 0;
		while (st.hasMoreTokens())
		{
			st.nextToken();
			res++;
		}
		return res;
	}

	// ������� �� ������ �� ����� � �������� ������� � �������� �����.
	public static String deleteString(String text, int position, int len)
	{
		String s = "delete something";
		String res = "";

		for (int i = 0; i < s.length(); i++)
		{
			res = s.substring(0, position) + s.substring(position + len);
		}
		return res;
	}

	// ����������� ������, �.�. ��������� ������� ������ ����� �������, � ������
	// ����������.
	public static String reverseString(String text)
	{
		String res = "";
		for (int i = res.length() - 1; i >= 0; i--)
		{
			res += res.charAt(i);
		}
		return res;
	}

	// � �������� ������ ������� ��������� �����
	public static String deleteLastWord(String text)
	{
		int first = 0;
		int last = 0;
		String res = "";

		Pattern p = Pattern.compile("[A-Za-z�-��-�]+");
		Matcher m = p.matcher(text);

		while (m.find())
		{
			first = text.indexOf(m.group());
			last = m.group().length();
		}

		for (int i = 0; i < text.length(); i++)
		{
			res = text.substring(0, first) + text.substring(first + last);
		}
		return res;
	}

	public static void main(String[] args)
	{

		System.out.println(StringsExemple.smallWorld("Hello, worlds: ddd. trolol"));
		System.out.println(StringsExemple.createProbel("Hello,worlds dd trolol"));
		System.out.println(StringsExemple.countOfWord_2("Hello,worlds dd trolol"));
	}
}