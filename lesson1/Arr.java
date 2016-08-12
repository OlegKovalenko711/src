package lesson1;

public class Arr
{
	public static int minElem(int[] arr)
	{
		if (arr == null || arr.length == 0)
			throw new IllegalArgumentException();

		int res = arr[0];
		for (int i = 0; i < arr.length; i++)
		{
			if (res > arr[i])
			{
				res = arr[i];
			}
		}
		return res;
	}

	public static int maxElem(int[] arr)
	{
		if (arr == null || arr.length == 0)
			throw new IllegalArgumentException();

		int res = arr[0];
		for (int i = 0; i < arr.length; i++)
		{
			if (res < arr[i])
			{
				res = arr[i];
			}
		}
		return res;
	}

	public static int indexOfMinElem(int[] arr)
	{
		if (arr == null || arr.length == 0)
			throw new IllegalArgumentException();

		int res = arr[0];
		int indexOfMin = 0;
		for (int i = 0; i < arr.length; i++)
		{
			if (res > arr[i])
			{
				indexOfMin = i;
			}
		}
		return indexOfMin;
	}

	public static int indexOfMaxElem(int[] arr)
	{
		if (arr == null || arr.length == 0)
			throw new IllegalArgumentException();

		int res = arr[0];
		for (int i = 0; i < arr.length; i++)
		{

			if (res < arr[i])
			{
				res = i;
			}
		}
		return res;
	}

	public static int nIndex(int[] arr)
	{
		if (arr == null || arr.length == 0)
			throw new IllegalArgumentException();

		int res = 0;

		for (int i = 1; i < arr.length; i += 2)
		{
			res += arr[i];
		}

		return res;
	}

	public static void reversedMe(int[] arr)
	{
		if (arr == null || arr.length == 0)
			throw new IllegalArgumentException();

		int len = arr.length - 1;
		int tmp = 0;

		for (int j = 0; j < arr.length; j++)
		{
			for (int i = 0; i < len - j; i++)
			{
				tmp = arr[i];
				arr[i] = arr[i + 1];
				arr[i + 1] = tmp;
			}

		}

	}

	public static void printHardRevers(int[] arr)
	{

		if (arr == null || arr.length == 0)
			throw new IllegalArgumentException();

		int tmp = 0;
		int divArr = arr.length / 2;

		for (int i = 0; i < arr.length; i++)
		{
			for (int j = 0; j < arr.length - 1; j++)
			{
				if (i <= divArr && divArr < arr.length)
				{
					tmp = arr[j];
					arr[j] = arr[divArr];
					arr[divArr] = tmp;
					divArr++;
				}
			}
		}
	}

	public static void printSort(int[] arr)
	{
		if (arr == null || arr.length == 0)
			throw new IllegalArgumentException();

		int tmp = 0;

		for (int j = 0; j < arr.length; j++)
		{
			for (int i = 0; i < arr.length - 1; i++)
			{
				if (arr[i] > arr[i + 1])
				{
					tmp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = tmp;
				}
			}
		}
	}

}
