package lesson3;

public class Figurki
{

	private int size = 7;

	private void square()
	{
		for (int j = 1; j <= size; j++)
		{
			for (int i = 1; i <= size; i++)
			{
				System.out.print(i + "*" + j + " | ");
			}
			System.out.println();
		}
	}

	private void printFigura_1()
	{
		for (int j = 1; j <= size; j++)
		{
			for (int i = 1; i <= size; i++)
			{
				if (i == j || i == 1 || j == size)
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

	private void printFigura_2()
	{
		for (int j = 1; j <= size; j++)
		{
			for (int i = 1; i <= size; i++)
			{
				if (i + j == size + 1 || j == 1 || i == 1)
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

	private void printFigura_3()
	{
		for (int j = 1; j <= size; j++)
		{
			for (int i = 1; i <= size; i++)
			{
				if (i + j == size + 1 || i == size || j == size)
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

	private void printFigura_4()
	{
		for (int j = 1; j <= size; j++)
		{
			for (int i = 1; i <= size; i++)
			{
				if (i == j || i == size || j == 1)
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

	private void printFigura_5()
	{
		for (int j = 1; j <= size; j++)
		{
			for (int i = 1; i <= size; i++)
			{
				if (i >= size / 2 + 1 && i == j || i <= size / 2 + 1 && i + j == size + 1 || j == size)
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

	private void printFigura_6()
	{
		for (int j = 1; j <= size; j++)
		{
			for (int i = 1; i <= size; i++)
			{
				if (i <= size / 2 + 1 && i == j || i >= size / 2 + 1 && i + j == size + 1 || j == 1)
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

	private void printFigura_7()
	{
		for (int j = 1; j <= size; j++)
		{
			for (int i = 1; i <= size; i++)
			{
				if (i >= size / 2 + 1 && i == j || i >= size / 2 + 1 && i + j == size + 1 || i == size)
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

	private void printFigura_8()
	{
		for (int j = 1; j <= size; j++)
		{
			for (int i = 1; i <= size; i++)
			{
				if (i <= size / 2 + 1 && i == j || i <= size / 2 + 1 && i + j == size + 1 || i == 1)
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

	private void printFigura_9()
	{
		for (int j = 1; j <= size; j++)
		{
			for (int i = 1; i <= size; i++)
			{
				if (i <= size / 2 + 1 && i + j == size + 1 || i == 1 && j >= size / 2 + 1
						|| j == size / 2 + 1 && i <= size / 2 + 1)
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

	private void printFigura_10()
	{
		for (int j = 1; j <= size; j++)
		{
			for (int i = 1; i <= size; i++)
			{
				if (i == j && i >= size / 2 + 1 || i == size / 2 + 1 && j >= size / 2 + 1
						|| j == size && i >= size / 2 + 1)
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

	private void printFigura_11()
	{
		for (int j = 1; j <= size; j++)
		{
			for (int i = 1; i <= size; i++)
			{
				if (i + j == size + 1 && i <= size / 2 + 1 || i == size / 2 + 1 && j >= size / 2 + 1
						|| j == size && i <= size / 2 + 1)
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

	private void printFigura_12()
	{
		for (int j = 1; j <= size; j++)
		{
			for (int i = 1; i <= size; i++)
			{
				if (i + j == size + 1 && i >= size / 2 + 1 || i == 4 && j <= size / 2 + 1
						|| j == 1 && i >= size / 2 + 1)
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

	public static void main(String[] args)
	{
		Figurki f = new Figurki();
		f.square();
		System.out.println();
		f.printFigura_1();
		System.out.println();
		f.printFigura_2();
		System.out.println();
		f.printFigura_3();
		System.out.println();
		f.printFigura_4();
		f.printFigura_5();
		f.printFigura_6();
		f.printFigura_7();
		f.printFigura_8();
		f.printFigura_9();
		f.printFigura_10();
		f.printFigura_11();
		f.printFigura_12();
	}

}
