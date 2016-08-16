package lesson6;

import java.util.Arrays;

import com.sun.nio.sctp.IllegalReceiveException;

public class AList
{
	private int arr[] = {};

	public void clear()
	{
		arr = new int[0];
	}

	public void init(int[] tmp)
	{
		if (tmp == null || tmp.length == 0)
			throw new IllegalArgumentException();

		clear();
		arr = new int[tmp.length];
		for (int i = 0; i < arr.length; i++)
		{
			arr[i] = tmp[i];
		}
	}

	public int size()
	{
		return arr.length;
	}

	public int[] toArray()
	{
		if (arr == null || arr.length == 0)
			throw new IllegalArgumentException();

		int[] tmp = new int[arr.length];

		for (int i = 0; i < arr.length; i++)
		{
			tmp[i] = arr[i];
		}

		return tmp;
	}

	public int addStart(int val)
	{
		if (arr == null || arr.length == 0)
			throw new IllegalArgumentException();

		int[] tmp = new int[arr.length + 1];

		for (int i = 0; i < arr.length; i++)
		{
			tmp[i + 1] = arr[i];

		}
		tmp[tmp.length - tmp.length] = val;
		arr = tmp;

		return val;
	}

	public int addEnd(int val)
	{

		if (arr == null || arr.length == 0)
			throw new IllegalArgumentException();

		int[] tmp = new int[arr.length + 1];

		for (int i = 0; i < arr.length; i++)
		{
			tmp[i] = arr[i];

		}
		tmp[tmp.length - 1] = val;
		arr = tmp;

		return val;
	}

	public int addPos(int pos, int val)
	{
		if (arr == null || arr.length == 0)
			throw new IllegalArgumentException();

		int[] tmp = new int[arr.length + 1];

		for (int i = 0; i < pos + 1; i++)
		{
			tmp[i] = arr[i];
		}
		tmp[pos] = val;
		for (int i = pos; i < arr.length; i++)
		{
			tmp[i + 1] = arr[i];
		}
		arr = tmp;

		return val;
	}

	public void delStart()
	{
		if (arr == null || arr.length == 0)
			throw new IllegalArgumentException();

		int[] tmp = new int[arr.length - 1];

		for (int i = 1; i < arr.length; i++)
		{
			tmp[i - 1] = arr[i];

		}
		arr = tmp;

	}

	public void delEnd()
	{
		if (arr == null || arr.length == 0)
			throw new IllegalArgumentException();

		int[] tmp = new int[arr.length - 1];

		for (int i = 0; i < arr.length - 1; i++)
		{
			tmp[i] = arr[i];
		}
		arr = tmp;
	}

	public void delPos(int pos)
	{
		if (arr == null || arr.length == 0)
			throw new IllegalArgumentException();

		int[] tmp = new int[arr.length - 1];

		for (int i = 0; i < pos; i++)
		{
			tmp[i] = arr[i];

		}

		for (int i = pos + 1; i < arr.length; i++)
		{
			tmp[i - 1] = arr[i];
		}
		arr = tmp;
	}

	public int min()
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

	public int max()
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

	public int MinInd()
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

	public int maxInd()
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

	public void set(int pos, int val)
	{
		if (arr == null || arr.length == 0)
			throw new IllegalArgumentException();

		int[] tmp = new int[arr.length];

		for (int i = 0; i < arr.length; i++)
		{
			if (i != pos)
			{
				tmp[i] = arr[i];
			}
			else
			{
				tmp[i] = val;
			}
		}
		arr = tmp;
	}

	public int get(int get)
	{
		if (arr == null || arr.length == 0)
			throw new IllegalArgumentException();

		int res = 0;
		for (int i = 0; i < arr.length; i++)
		{
			if (i == get)
			{
				res = arr[i];
			}
		}
		return res;
	}

	public void reverse()
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

	public void halfReverse()
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

	public void sort()
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

	@Override
	public String toString()
	{
		return "AList " + Arrays.toString(arr);
	}
}
