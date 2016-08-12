package lesson2;

public class EmtySquare
{

	public static void main(String[] args)
	{
		for (int j = 1; j <= 7; j++)
		{
			for (int i = 1; i <= 7; i++)
			{
				if (i > 1 && j > 1 && j < 7 && i < 7)
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print("*");
				}

			}
			System.out.println();
		}

	}

}
