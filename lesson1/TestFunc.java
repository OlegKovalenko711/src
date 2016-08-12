package lesson1;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestFunc
{

	@Test(expected = IllegalArgumentException.class)
	public void testOnceNull()
	{
		Func.convertNumToString(-1);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testOnceMore()
	{
		Func.convertNumToString(1000);
	}

	@Test
	public void testOnceOne()
	{
		String actual = Func.convertNumToString(1);
		String expected = "один";

		assertEquals(expected, actual);
	}

	@Test
	public void testOnceThree()
	{
		String actual = Func.convertNumToString(3);
		String expected = "три";

		assertEquals(expected, actual);
	}

	@Test
	public void testOnceFour()
	{
		String actual = Func.convertNumToString(4);
		String expected = "четыре";

		assertEquals(expected, actual);
	}

	@Test
	public void testOnceFive()
	{
		String actual = Func.convertNumToString(5);
		String expected = "п€ть";

		assertEquals(expected, actual);
	}

	@Test
	public void testOnceNine()
	{
		String actual = Func.convertNumToString(9);
		String expected = "дев€ть";
		assertEquals(expected, actual);
	}

	// дес€тки

	@Test
	public void testTeenseEleven()
	{
		String actual = Func.convertNumToString(11);
		String expected = "одинадцать";
		assertEquals(expected, actual);
	}
	@Test
	public void testTeense_15()
	{
		String actual = Func.convertNumToString(15);
		String expected = "п€тнадцать";
		assertEquals(expected, actual);
	}
	@Test
	public void testTeense_20()
	{
		String actual = Func.convertNumToString(20);
		String expected = "двадцать";
		assertEquals(expected, actual);
	}
	@Test
	public void testTeense_1_40()
	{
		String actual = Func.convertNumToString(40);
		String expected = "сорок";
		assertEquals(expected, actual);
	}
	@Test
	public void testTeense_1_50()
	{
		String actual = Func.convertNumToString(60);
		String expected = "шестьдес€т";
		assertEquals(expected, actual);
	}
	@Test
	public void testTeense_1_70()
	{
		String actual = Func.convertNumToString(70);
		String expected = "семдес€т";
		assertEquals(expected, actual);
	}
	@Test
	public void testTeense_1_90()
	{
		String actual = Func.convertNumToString(90);
		String expected = "дев€носто";
		assertEquals(expected, actual);
	}
	
	@Test
	public void testTeense_1_22()
	{
		String actual = Func.convertNumToString(23);
		String expected = "двадцать три";
		assertEquals(expected, actual);
	}

}
