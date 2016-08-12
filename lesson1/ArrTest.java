package lesson1;

import static org.junit.Assert.*;

import org.junit.Test;

public class ArrTest
{

	// тесты на мин
	@Test(expected = IllegalArgumentException.class)
	public void testMinEmpty()
	{
		int[] arr = {};
		Arr.minElem(arr);
		int[] res = {};
		assertArrayEquals(arr, res);

	}

	@Test(expected = IllegalArgumentException.class)
	public void testMinNull()
	{
		int arr[] = null;
		Arr.minElem(arr);
		int[] res = null;
		assertArrayEquals(arr, res);

	}

	@Test
	public void testMinManyOod()
	{
		int[] arr = { 0, 3, 8, 0, 9, -9, -1 };
		int minElem = Arr.minElem(arr);
		int res = -9;
		assertEquals(res, minElem);

	}

	@Test
	public void testMinManyEvan()
	{
		int[] arr = { 0, 3, -8, 0, -9, -9, -1 };
		int minElem = Arr.minElem(arr);
		int res = -9;
		assertEquals(res, minElem);
	}

	@Test
	public void testMinOne()
	{
		int[] arr = { 0 };
		Arr.minElem(arr);
		int[] res = { 0 };
		assertArrayEquals(arr, res);
	}

	@Test
	public void testMinTwo()
	{
		int[] arr = { 0, 1 };
		int minElem = 0;
		Arr.minElem(arr);
		int res = 0;
		assertEquals(minElem, res);
	}

	// тесты на max
	@Test(expected = IllegalArgumentException.class)
	public void testMaxEmpty()
	{
		int[] arr = {};
		Arr.maxElem(arr);
		int[] res = {};
		assertArrayEquals(arr, res);

	}

	@Test(expected = IllegalArgumentException.class)
	public void testMaxNull()
	{
		int arr[] = null;
		Arr.maxElem(arr);
		int[] res = null;
		assertArrayEquals(arr, res);

	}

	@Test
	public void testMaxManyOod()
	{
		int[] arr = { 0, 3, 8, 0, 9, -9, -1 };
		int maxElem = Arr.maxElem(arr);
		int res = 9;
		assertEquals(res, maxElem);

	}

	@Test
	public void testMaxManyEvan()
	{
		int[] arr = { 0, 3, -8, 0, -9, -9, -1 };
		int maxElem = Arr.maxElem(arr);
		int res = 3;
		assertEquals(res, maxElem);
	}

	@Test
	public void testMaxOne()
	{
		int[] arr = { 0 };
		Arr.maxElem(arr);
		int[] res = { 0 };
		assertArrayEquals(arr, res);
	}

	@Test
	public void testMaxTwo()
	{
		int[] arr = { 0, 1 };
		int maxElem = 0;
		Arr.maxElem(arr);
		int res = 0;
		assertEquals(maxElem, res);
	}

	// тесты на реверс
	@Test(expected = IllegalArgumentException.class)
	public void testReverseEmpty()
	{
		int[] arr = {};
		Arr.reversedMe(arr);
		int[] res = {};
		assertArrayEquals(arr, res);

	}

	@Test(expected = IllegalArgumentException.class)
	public void testReverseNull()
	{
		int arr[] = null;
		Arr.reversedMe(arr);
		int[] res = null;
		assertArrayEquals(arr, res);

	}

	@Test
	public void testReverseManyOod()
	{
		int[] arr = { 0, 3, 8, 0, 9, -9, -1 };
		Arr.reversedMe(arr);
		int[] res = { -1, -9, 9, 0, 8, 3, 0 };
		assertArrayEquals(arr, res);

	}

	@Test
	public void testReverseManyEvan()
	{
		int[] arr = { 0, 3, -8, 0, -9, -9, -1 };
		Arr.reversedMe(arr);
		int[] res = { -1, -9, -9, 0, -8, 3, 0 };
		assertArrayEquals(arr, res);
	}

	@Test
	public void testReverseOne()
	{
		int[] arr = { 0 };
		Arr.reversedMe(arr);
		int[] res = { 0 };
		assertArrayEquals(arr, res);
	}

	@Test
	public void testReverseTwo()
	{
		int[] arr = { 0, 1 };
		Arr.reversedMe(arr);
		int[] res = { 1, 0 };
		assertArrayEquals(arr, res);
	}

	// ---------

	// тесты на мин индекс
	@Test(expected = IllegalArgumentException.class)
	public void testIndexMinEmpty()
	{
		int[] arr = {};
		Arr.indexOfMinElem(arr);
		int[] res = {};
		assertArrayEquals(arr, res);

	}

	@Test(expected = IllegalArgumentException.class)
	public void testIndexMinNull()
	{
		int arr[] = null;
		Arr.indexOfMinElem(arr);
		int[] res = null;
		assertArrayEquals(arr, res);

	}

	@Test
	public void testIndexMinManyOod()
	{
		int[] arr = { 0, 3, 8, 0, 9, -9, -1 };
		int minElem = Arr.indexOfMinElem(arr);
		int res = 6;
		assertEquals(res, minElem);

	}

	@Test
	public void testIndexMinManyEvan()
	{
		int[] arr = { -10, 3, -8, 0, -9, -9, -1 };
		int minElem = Arr.indexOfMinElem(arr);
		int res = 0;
		assertEquals(res, minElem);
	}

	@Test
	public void testIndexMinOne()
	{
		int[] arr = { 0 };
		Arr.indexOfMinElem(arr);
		int[] res = { 0 };
		assertArrayEquals(arr, res);
	}

	@Test
	public void testIndexMinTwo()
	{
		int[] arr = { 0, 1 };
		int minElem = 0;
		Arr.indexOfMinElem(arr);
		int res = 0;
		assertEquals(minElem, res);
	}

	// ---------

	// ---------

	// тесты на max индекс
	@Test(expected = IllegalArgumentException.class)
	public void testIndexMaxEmpty()
	{
		int[] arr = {};
		Arr.indexOfMaxElem(arr);
		int[] res = {};
		assertArrayEquals(arr, res);

	}

	@Test(expected = IllegalArgumentException.class)
	public void testIndexMaxNull()
	{
		int arr[] = null;
		Arr.indexOfMaxElem(arr);
		int[] res = null;
		assertArrayEquals(arr, res);

	}

	@Test
	public void testIndexMaxManyOod()
	{
		int[] arr = { 0, 3, 8, 0, 9, -9, -1 };
		int minElem = Arr.indexOfMaxElem(arr);
		int res = 4;
		assertEquals(res, minElem);

	}

	@Test
	public void testIndexMaxManyEvan()
	{
		int[] arr = { -10, 3, -8, 0, -9, -9, -1 };
		int minElem = Arr.indexOfMaxElem(arr);
		int res = 1;
		assertEquals(res, minElem);
	}

	@Test
	public void testIndexMaxOne()
	{
		int[] arr = { 0 };
		Arr.indexOfMaxElem(arr);
		int[] res = { 0 };
		assertArrayEquals(arr, res);
	}

	@Test
	public void testIndexMaxTwo()
	{
		int[] arr = { 0, 1 };
		int minElem = 0;
		Arr.indexOfMaxElem(arr);
		int res = 0;
		assertEquals(minElem, res);
	}

	// ---------

	@Test(expected = IllegalArgumentException.class)
	public void nIndexTestEmpty()
	{
		int[] arr = {};
		Arr.nIndex(arr);
		int[] res = {};
		assertArrayEquals(arr, res);

	}

	@Test(expected = IllegalArgumentException.class)
	public void nIndexTestNull()
	{
		int arr[] = null;
		Arr.nIndex(arr);
		int[] res = null;
		assertArrayEquals(arr, res);

	}

	@Test
	public void nIndexTestManyOod()
	{
		int[] arr = { 0, 3, 8, 0, 9, -9, -1 };
		int minElem = Arr.nIndex(arr);
		int res = -6;
		assertEquals(res, minElem);

	}

	@Test
	public void nIndexTestManyEvan()
	{
		int[] arr = { -10, 3, -8, 0, -9, -9, -1 };
		int minElem = Arr.nIndex(arr);
		int res = -6;
		assertEquals(res, minElem);
	}

	@Test
	public void nIndexTestOne()
	{
		int[] arr = { 0 };
		Arr.nIndex(arr);
		int[] res = { 0 };
		assertArrayEquals(arr, res);
	}

	@Test
	public void nIndexTestTwo()
	{
		int[] arr = { 0, 1 };
		int minElem = 0;
		Arr.nIndex(arr);
		int res = 0;
		assertEquals(minElem, res);
	}

	// ---------

	// тесты на хард реверс

	@Test(expected = IllegalArgumentException.class)
	public void testHardReverseEmpty()
	{
		int[] arr = {};
		Arr.printHardRevers(arr);
		int[] res = {};
		assertArrayEquals(arr, res);

	}

	@Test(expected = IllegalArgumentException.class)
	public void testHardReverseNull()
	{
		int arr[] = null;
		Arr.printHardRevers(arr);
		int[] res = null;
		assertArrayEquals(arr, res);

	}

	@Test
	public void testHardReverseManyOod()
	{
		int[] arr = { 0, 3, 8, 0, 9, 9, -1, -6 };
		Arr.printHardRevers(arr);
		int[] res = { 9, 9, -1, -6, 0, 3, 8, 0 };
		assertArrayEquals(arr, res);

	}

	@Test
	public void testHardReverseManyEvan()
	{
		int[] arr = { 0, 3, -8, 0, -9, -9, -1, -6 };
		Arr.printHardRevers(arr);
		int[] res = { -9, -9, -1, -6, 0, 3, -8, 0 };
		assertArrayEquals(arr, res);
	}

	@Test
	public void testHardReverseOne()
	{
		int[] arr = { 0 };
		Arr.printHardRevers(arr);
		int[] res = { 0 };
		assertArrayEquals(arr, res);
	}

	@Test
	public void testHardReverseTwo()
	{
		int[] arr = { 1, 0 };
		Arr.printHardRevers(arr);
		int[] res = { 0, 1 };
		assertArrayEquals(arr, res);
	}

	// тесты на пузырьковую сортировку

	@Test(expected = IllegalArgumentException.class)
	public void testBubbleeEmpty()
	{
		int[] arr = {};
		Arr.printSort(arr);
		int[] res = {};
		assertArrayEquals(arr, res);

	}

	@Test(expected = IllegalArgumentException.class)
	public void testBubbleeNull()
	{
		int arr[] = null;
		Arr.printSort(arr);
		int[] res = null;
		assertArrayEquals(arr, res);

	}

	@Test
	public void testBubbleeManyOod()
	{
		int[] arr = { 0, 3, 8, 0, 9, 9, -1, -6 };
		Arr.printSort(arr);
		int[] res = { -6, -1, 0, 0, 3, 8, 9, 9 };
		assertArrayEquals(arr, res);

	}

	@Test
	public void testBubbleeManyEvan()
	{
		int[] arr = { 0, 3, -8, 0, -9, -9, -1, -6 };
		Arr.printSort(arr);
		int[] res = { -9, -9, -8, -6, -1, 0, 0, 3 };
		assertArrayEquals(arr, res);
	}

	@Test
	public void testBubbleeOne()
	{
		int[] arr = { 0 };
		Arr.printSort(arr);
		int[] res = { 0 };
		assertArrayEquals(arr, res);
	}

	@Test
	public void testBubbleeTwo()
	{
		int[] arr = { 1, 0 };
		Arr.printSort(arr);
		int[] res = { 0, 1 };
		assertArrayEquals(arr, res);
	}

}
