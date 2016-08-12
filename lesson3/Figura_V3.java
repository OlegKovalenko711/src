package lesson3;

public class Figura_V3
{
	// «латопольский стр 90
	private final int size = 7;

	// A)
	private void figura_1()
	{
		for (int j = 1; j <= size; j++)
		{
			for (int i = 1; i <= size; i++)
			{
				if (i <= j)
				{
					System.out.print(j - i);
				}
			}
			System.out.println(" ");
		}
	}

	// B)
	private void figura_2()
	{
		for (int j = 1; j <= size; j++)
		{
			for (int i = size; i >= 1; i--)
			{
				if (i + j <= size + 1)
				{
					System.out.print(i + 1);
				}
			}
			System.out.println(" ");
		}
	}

	// C)
	private void figura_3()
	{
		for (int j = 1; j <= size; j++)
		{
			for (int i = 1; i <= size; i++)
			{
				if (i <= j)
				{

					System.out.print(j - i + 3 * 10 + " ");
				}
			}
			System.out.println("  ");
		}
	}

	public static void main(String[] args)
	{
		Figura_V3 f = new Figura_V3();
		f.figura_1();
		System.out.println();
		f.figura_2();
		System.out.println();
		f.figura_3();
	}

}
