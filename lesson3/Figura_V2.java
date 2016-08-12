package lesson3;

public class Figura_V2
{
	private int size = 7;

	private void square()
	{
		for (int j = 1; j <= size; j++)
		{
			for (int i = 1; i <= size; i++)
			{
				if (i <= j)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	private void square_2()
	{
		for (int j = 1; j <= size; j++)
		{
			for (int i = 1; i <= size; i++)
			{
				if (i + j <= size + 1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	private void square_3()
	{
		for (int j = 1; j <= size; j++)
		{
			for (int i = 1; i <= size; i++)
			{
				if (i <= j && i + j >= size + 1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	private void square_4()
	{
		for (int j = 1; j <= size; j++)
		{
			for (int i = 1; i <= size; i++)
			{
				if (i >= j && i + j <= size + 1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	private void square_5()
	{
		for (int j = 1; j <= size; j++)
		{
			for (int i = 1; i <= size; i++)
			{
				if (i >= j && i + j >= size + 1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	private void square_6()
	{
		for (int j = 1; j <= size; j++)
		{
			for (int i = 1; i <= size; i++)
			{
				if (i <= j && i + j <= size + 1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	private void square_7()
	{
		for (int j = 1; j <= size; j++)
		{
			for (int i = 1; i <= size; i++)
			{
				if (i + j >= size + 1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	private void square_8()
	{
		for (int j = 1; j <= size; j++)
		{
			for (int i = 1; i <= size; i++)
			{
				if (i >= j)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	private void square_9()
	{
		for (int j = 1; j <= size; j++)
		{
			for (int i = 1; i <= size; i++)
			{
				if (i >= j && i + j <= size + 1 || i <= j && i + j >= size + 1 || i == size || i == 1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	private void square_10()
	{
		for (int j = 1; j <= size; j++)
		{
			for (int i = 1; i <= size; i++)
			{
				if (i >= j && i + j <= size + 1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	private void square_11()
	{
		for (int j = 1; j <= size; j++)
		{
			for (int i = 1; i <= size; i++)
			{
				if (i <= j )
				{
					System.out.print(i);
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args)
	{
		Figura_V2 f = new Figura_V2();
		f.square();
		System.out.println();
		f.square_2();
		System.out.println();
		f.square_3();
		System.out.println();
		f.square_4();
		System.out.println();
		f.square_5();
		System.out.println();
		f.square_6();
		System.out.println();
		f.square_7();
		System.out.println();
		f.square_8();
		System.out.println();
		f.square_9();
		System.out.println();
		f.square_10();
		System.out.println();
		f.square_11();
	}
}
