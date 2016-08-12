package lesson1;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCicles
{

	// 1
	@Test
	public void testFindSum()
	{
		int actual = Cicles.findSum();
		int expected = 2450;
		assertEquals(expected, actual);
	}

	@Test
	public void testFind—ÚÂ()
	{
		int actual = Cicles.findCount();
		int expected = 50;
		assertEquals(expected, actual);
	}

	// 2
	@Test(expected = IllegalArgumentException.class)
	public void testFindProstoeChislo()
	{
		Cicles.findProstoeChislo(0);

	}

	@Test
	public void testFindProstoeChislo_1()
	{
		int actual = Cicles.findProstoeChislo(4);
		int expected = 1;
		assertEquals(expected, actual);
	}

	@Test
	public void testFindProstoeChislo_2()
	{
		int actual = Cicles.findProstoeChislo(3);
		int expected = 2;
		assertEquals(expected, actual);
	}

	// 3
	@Test(expected = IllegalArgumentException.class)
	public void testKoren()
	{
		Cicles.koren(0);

	}

	public void testKoren_1()
	{
		int actual = Cicles.koren(16);
		int expected = 4;
		assertEquals(expected, actual);
	}

	// 4

	@Test(expected = IllegalArgumentException.class)
	public void test—ountFact()
	{
		Cicles.countFact(-1);

	}

	@Test
	public void testcountFact_1()
	{
		int actual = Cicles.countFact(1);
		int expected = 1;
		assertEquals(expected, actual);
	}

	@Test
	public void testcountFactZero()
	{
		int actual = Cicles.countFact(0);
		int expected = 1;
		assertEquals(expected, actual);
	}

	@Test
	public void testcountFact_2()
	{
		int actual = Cicles.countFact(4);
		int expected = 24;
		assertEquals(expected, actual);
	}

	// 5

	@Test(expected = IllegalArgumentException.class)
	public void testCountDigit()
	{
		Cicles.countDigit(0);
	}
    

}
