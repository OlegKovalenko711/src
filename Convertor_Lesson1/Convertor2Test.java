package Convertor_Lesson1;

import static org.junit.Assert.*;

import org.junit.Test;

public class Convertor2Test
{

	@Test(expected = IllegalArgumentException.class)
	public void testConvertToIntErr()
	{
		Convertor2.convertToInt(null);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testConvertToIntEmpty()
	{
		Convertor2.convertToInt("");
	}

	@Test
	public void testConvertToInt_0()
	{
		int actual = Convertor2.convertToInt("ноль");
		int expected = 0;
		assertEquals(expected, actual);
	}

	@Test
	public void testConvertToInt_1()
	{
		int actual = Convertor2.convertToInt("один");
		int expected = 1;
		assertEquals(expected, actual);
	}

	@Test
	public void testConvertToInt_5()
	{
		int actual = Convertor2.convertToInt("пять");
		int expected = 5;
		assertEquals(expected, actual);
	}

	@Test
	public void testConvertToInt_10()
	{
		int actual = Convertor2.convertToInt("десять");
		int expected = 10;
		assertEquals(expected, actual);
	}

	@Test
	public void testConvertToInt_11()
	{
		int actual = Convertor2.convertToInt("одинадцать");
		int expected = 11;
		assertEquals(expected, actual);
	}

	@Test
	public void testConvertToInt_15()
	{
		int actual = Convertor2.convertToInt("пятнадцать");
		int expected = 15;
		assertEquals(expected, actual);
	}

	@Test
	public void testConvertToInt_19()
	{
		int actual = Convertor2.convertToInt("девятнадцать");
		int expected = 19;
		assertEquals(expected, actual);
	}

	@Test
	public void testConvertToInt_20()
	{
		int actual = Convertor2.convertToInt("двадцать");
		int expected = 20;
		assertEquals(expected, actual);
	}

	@Test
	public void testConvertToInt_25()
	{
		int actual = Convertor2.convertToInt("двадцать пять");
		int expected = 25;
		assertEquals(expected, actual);
	}

	@Test
	public void testConvertToInt_30()
	{
		int actual = Convertor2.convertToInt("тридцать");
		int expected = 30;
		assertEquals(expected, actual);
	}

	@Test
	public void testConvertToInt_40()
	{
		int actual = Convertor2.convertToInt("сорок");
		int expected = 40;
		assertEquals(expected, actual);
	}

	@Test
	public void testConvertToInt_50()
	{
		int actual = Convertor2.convertToInt("пятьдесят");
		int expected = 50;
		assertEquals(expected, actual);
	}

	@Test
	public void testConvertToInt_56()
	{
		int actual = Convertor2.convertToInt("пятьдесят шесть");
		int expected = 56;
		assertEquals(expected, actual);
	}

	@Test
	public void testConvertToInt_90()
	{
		int actual = Convertor2.convertToInt("девяносто");
		int expected = 90;
		assertEquals(expected, actual);
	}

	@Test
	public void testConvertToInt_71()
	{
		int actual = Convertor2.convertToInt("семдесят один");
		int expected = 71;
		assertEquals(expected, actual);
	}

	@Test
	public void testConvertToInt_95()
	{
		int actual = Convertor2.convertToInt("девяносто пять");
		int expected = 95;
		assertEquals(expected, actual);
	}

	@Test
	public void testConvertToInt_99()
	{
		int actual = Convertor2.convertToInt("девяносто девять");
		int expected = 99;
		assertEquals(expected, actual);
	}

	@Test
	public void testConvertToInt_100()
	{
		int actual = Convertor2.convertToInt("сто");
		int expected = 100;
		assertEquals(expected, actual);
	}

	@Test
	public void testConvertToInt_201()
	{
		int actual = Convertor2.convertToInt("двести один");
		int expected = 201;
		assertEquals(expected, actual);
	}

	@Test
	public void testConvertToInt_410()
	{
		int actual = Convertor2.convertToInt("четыреста десять");
		int expected = 410;
		assertEquals(expected, actual);
	}

	@Test
	public void testConvertToInt_411()
	{
		int actual = Convertor2.convertToInt("четыреста одинадцать");
		int expected = 410;
		assertEquals(expected, actual);
	}

	@Test
	public void testConvertToInt_105()
	{
		int actual = Convertor2.convertToInt("сто пять");
		int expected = 105;
		assertEquals(expected, actual);
	}

	@Test
	public void testConvertToInt_110()
	{
		int actual = Convertor2.convertToInt("сто десять");
		int expected = 110;
		assertEquals(expected, actual);
	}

	@Test
	public void testConvertToInt_115()
	{
		int actual = Convertor2.convertToInt("сто пятнадцать");
		int expected = 115;
		assertEquals(expected, actual);
	}

	@Test
	public void testConvertToInt_119()
	{
		int actual = Convertor2.convertToInt("сто девятнадцать");
		int expected = 119;
		assertEquals(expected, actual);
	}

	@Test
	public void testConvertToInt_120()
	{
		int actual = Convertor2.convertToInt("сто двадцать");
		int expected = 120;
		assertEquals(expected, actual);
	}

	@Test
	public void testConvertToInt_123()
	{
		int actual = Convertor2.convertToInt("сто двадцать три");
		int expected = 123;
		assertEquals(expected, actual);
	}

	@Test
	public void testConvertToInt_140()
	{
		int actual = Convertor2.convertToInt("сто сорок");
		int expected = 140;
		assertEquals(expected, actual);
	}

	@Test
	public void testConvertToInt_150()
	{
		int actual = Convertor2.convertToInt("сто пятьдесят");
		int expected = 150;
		assertEquals(expected, actual);
	}

	@Test
	public void testConvertToInt_155()
	{
		int actual = Convertor2.convertToInt("сто пятьдесят пять");
		int expected = 155;
		assertEquals(expected, actual);
	}

	@Test
	public void testConvertToInt_169()
	{
		int actual = Convertor2.convertToInt("сто шестьдесят девять");
		int expected = 169;
		assertEquals(expected, actual);
	}

	@Test
	public void testConvertToInt_190()
	{
		int actual = Convertor2.convertToInt("сто девяносто");
		int expected = 190;
		assertEquals(expected, actual);
	}

	@Test
	public void testConvertToInt_195()
	{
		int actual = Convertor2.convertToInt("сто девяносто пять");
		int expected = 195;
		assertEquals(expected, actual);
	}

	@Test
	public void testConvertToInt_200()
	{
		int actual = Convertor2.convertToInt("двести");
		int expected = 200;
		assertEquals(expected, actual);
	}

	@Test
	public void testConvertToInt_300()
	{
		int actual = Convertor2.convertToInt("триста");
		int expected = 300;
		assertEquals(expected, actual);
	}

	@Test
	public void testConvertToInt_400()
	{
		int actual = Convertor2.convertToInt("четыреста");
		int expected = 400;
		assertEquals(expected, actual);
	}

	@Test
	public void testConvertToInt_600()
	{
		int actual = Convertor2.convertToInt("шестьсот");
		int expected = 600;
		assertEquals(expected, actual);
	}

	@Test
	public void testConvertToInt_999()
	{
		int actual = Convertor2.convertToInt("девятьсот девяносто девять");
		int expected = 999;
		assertEquals(expected, actual);
	}

}
