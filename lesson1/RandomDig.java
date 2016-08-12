package lesson1;

import java.util.Random;

public class RandomDig
{
	private Random rand = new Random();

	private void printOneDigit()
	{
		System.out.println(rand.nextInt());
	}

	private void printTenDigit()
	{
		for (int i = 1; i <= 10; i++)
			System.out.print(rand.nextInt() + " ");
	}

	private void printTenDigit2()
	{
		for (int i = 1; i <= 10; i++)
			System.out.print(rand.nextInt(10) + " ");
	}

	private void printTwDigit()
	{
		int m = 0;
		for (int i = 1; i <= 10; i++)
		{
			m = rand.nextInt(50);
			if (m >= 20 || m <= 50)
			{
				System.out.print(m + " ");
			}
		}
	}

	private void printTenDig3()
	{
		int m = 0;
		for (int i = 1; i <= 20; i++)
		{
			m = rand.nextInt(20);
			if (m > 10)
			{
				m = (rand.nextInt(10) - 10);
			}
			System.out.print(m + " ");
		}
	}

	private void printRandom()
	{
		int countOfDigit = (rand.nextInt(12) + 3);
		for (int i = 1; i < countOfDigit; i++)
		{
			System.out.print((rand.nextInt(45) - 10) + " ");
		}
	}

	public static void main(String[] args)
	{
		RandomDig r = new RandomDig();
		r.printOneDigit();
		r.printTenDigit();
		System.out.println();
		r.printTenDigit2();
		System.out.println();
		r.printTwDigit();
		System.out.println();
		r.printTenDig3();
		System.out.println();
		r.printRandom();
	}
}
