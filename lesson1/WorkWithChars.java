package lesson1;

// en 97-122 ru 1072-1103 dig 48-57

public class WorkWithChars
{
	public static void printChars(int start, int end)
	{
		char c = 0;
		for (int i = start; i <= end; i++)
		{
			if (start >= 65 || end <= 90)
			{
				c = (char) i;
			}
			else if (start >= 1072 || end <= 1103)
			{
				c = (char) i;
			}
			else if (start >= 48 || end <= 57)
			{
				c = (char) i;
			}
			else
			{
				throw new IllegalArgumentException();
			}

		}

	}

	public static void printCharsDesc(int start, int end)
	{
		if (start < 97 || end > 122)
			throw new IllegalArgumentException();

		char c = 0;
		for (int i = start; i >= end; i--)
		{
			c = (char) i;
		}

	}

	public static void printASCII()
	{
		char c = 0;
		for (int i = 0; i < 1103; i++)
		{
			c = (char) i;
		}
		
	}

	public static void main(String[] args)
	{
		WorkWithChars c = new WorkWithChars();
		c.printChars(65, 90);
		System.out.println();
		c.printCharsDesc(122, 97);
		System.out.println();
		c.printChars(1072, 1103);
		System.out.println();
		c.printChars(48, 57);
		System.out.println();
		c.printASCII();
	}
}
