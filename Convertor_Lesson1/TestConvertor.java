package Convertor_Lesson1;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestConvertor
{

	@Test(expected = IllegalArgumentException.class)
	public void testOnceNull()
	{
		Convertor.convertNumToString(-1);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testOnceMore()
	{
		Convertor.convertNumToString(1000);
	}

	@Test
	public void testOnce_0()
	{
		String actual = Convertor.convertNumToString(0);
		String expected = "ноль";

		assertEquals(expected, actual);
	}
	
	
	@Test
	public void testOnce_1()
	{
		String actual = Convertor.convertNumToString(1);
		String expected = "один";

		assertEquals(expected, actual);
	}

	@Test
	public void testOnce_3()
	{
		String actual = Convertor.convertNumToString(3);
		String expected = "три";

		assertEquals(expected, actual);
	}

	@Test
	public void testOnce_4()
	{
		String actual = Convertor.convertNumToString(4);
		String expected = "четыре";

		assertEquals(expected, actual);
	}

	@Test
	public void testOnce_5()
	{
		String actual = Convertor.convertNumToString(5);
		String expected = "п€ть";

		assertEquals(expected, actual);
	}

	@Test
	public void testOnce_9()
	{
		String actual = Convertor.convertNumToString(9);
		String expected = "дев€ть";
		assertEquals(expected, actual);
	}

	// дес€тки

	@Test
	public void testTeense_11()
	{
		String actual = Convertor.convertNumToString(11);
		String expected = "одинадцать";
		assertEquals(expected, actual);
	}

	@Test
	public void testTeense_15()
	{
		String actual = Convertor.convertNumToString(15);
		String expected = "п€тнадцать";
		assertEquals(expected, actual);
	}

	@Test
	public void testTeense_20()
	{
		String actual = Convertor.convertNumToString(20);
		String expected = "двадцать";
		assertEquals(expected, actual);
	}

	@Test
	public void testTeense_1_40()
	{
		String actual = Convertor.convertNumToString(40);
		String expected = "сорок";
		assertEquals(expected, actual);
	}

	@Test
	public void testTeense_1_50()
	{
		String actual = Convertor.convertNumToString(60);
		String expected = "шестьдес€т";
		assertEquals(expected, actual);
	}

	@Test
	public void testTeense_1_70()
	{
		String actual = Convertor.convertNumToString(70);
		String expected = "семдес€т";
		assertEquals(expected, actual);
	}

	@Test
	public void testTeense_1_90()
	{
		String actual = Convertor.convertNumToString(90);
		String expected = "дев€носто";
		assertEquals(expected, actual);
	}

	@Test
	public void testTeense_1_22()
	{
		String actual = Convertor.convertNumToString(23);
		String expected = "двадцать три";
		assertEquals(expected, actual);
	}

	@Test
	public void testTeense_1_99()
	{
		String actual = Convertor.convertNumToString(99);
		String expected = "дев€носто дев€ть";
		assertEquals(expected, actual);
	}

	@Test
	public void testTeense_1_87()
	{
		String actual = Convertor.convertNumToString(87);
		String expected = "восемьдес€т семь";
		assertEquals(expected, actual);
	}

	@Test
	public void testTeense_1_56()
	{
		String actual = Convertor.convertNumToString(56);
		String expected = "п€тьдес€т шесть";
		assertEquals(expected, actual);
	}

	@Test
	public void testTeense_1_42()
	{
		String actual = Convertor.convertNumToString(42);
		String expected = "сорок два";
		assertEquals(expected, actual);
	}

	@Test
	public void testTeense_1_31()
	{
		String actual = Convertor.convertNumToString(31);
		String expected = "тридцать один";
		assertEquals(expected, actual);
	}

	@Test
	public void testTeense_1_29()
	{
		String actual = Convertor.convertNumToString(29);
		String expected = "двадцать дев€ть";
		assertEquals(expected, actual);
	}

	// сотни

	@Test
	public void testHundred_100()
	{
		String actual = Convertor.convertNumToString(100);
		String expected = "сто";
		assertEquals(expected, actual);
	}

	@Test
	public void testHundred_200()
	{
		String actual = Convertor.convertNumToString(200);
		String expected = "двести";
		assertEquals(expected, actual);
	}

	@Test
	public void testHundred_1_300()
	{
		String actual = Convertor.convertNumToString(300);
		String expected = "триста";
		assertEquals(expected, actual);
	}

	@Test
	public void testHundred_1_400()
	{
		String actual = Convertor.convertNumToString(400);
		String expected = "четыреста";
		assertEquals(expected, actual);
	}

	@Test
	public void testHundred_1_600()
	{
		String actual = Convertor.convertNumToString(600);
		String expected = "шестьсот";
		assertEquals(expected, actual);
	}

	@Test
	public void testHundred_1_111()
	{
		String actual = Convertor.convertNumToString(111);
		String expected = "сто одинадцать";
		assertEquals(expected, actual);
	}

	@Test
	public void testHundred_1_115()
	{
		String actual = Convertor.convertNumToString(115);
		String expected = "сто п€тнадцать";
		assertEquals(expected, actual);
	}

	@Test
	public void testHundred_1_119()
	{
		String actual = Convertor.convertNumToString(119);
		String expected = "сто дев€тнадцать";
		assertEquals(expected, actual);
	}

	@Test
	public void testHundred_1_650()
	{
		String actual = Convertor.convertNumToString(650);
		String expected = "шестьсот п€тьдес€т";
		assertEquals(expected, actual);
	}

	@Test
	public void testHundred_1_121()
	{
		String actual = Convertor.convertNumToString(121);
		String expected = "сто двадцать один";
		assertEquals(expected, actual);
	}

	@Test
	public void testHundred_1_232()
	{
		String actual = Convertor.convertNumToString(232);
		String expected = "двести тридцать два";
		assertEquals(expected, actual);
	}

	@Test
	public void testHundred_1_343()
	{
		String actual = Convertor.convertNumToString(343);
		String expected = "триста сорок три";
		assertEquals(expected, actual);
	}

	@Test
	public void testHundred_1_657()
	{
		String actual = Convertor.convertNumToString(657);
		String expected = "шестьсот п€тьдес€т семь";
		assertEquals(expected, actual);
	}
	
	
	@Test
	public void testHundred_1_510()
	{
		String actual = Convertor.convertNumToString(510);
		String expected = "п€тьсот дес€ть";
		assertEquals(expected, actual);
	}
	
	@Test
	public void testHundred_1_706()
	{
		String actual = Convertor.convertNumToString(706);
		String expected = "семьсот шесть";
		assertEquals(expected, actual);
	}


	@Test
	public void testHundred_1_999()
	{
		String actual = Convertor.convertNumToString(999);
		String expected = "дев€тьсот дев€носто дев€ть";
		assertEquals(expected, actual);
	}

}
