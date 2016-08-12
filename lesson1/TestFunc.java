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
		String expected = "����";

		assertEquals(expected, actual);
	}

	@Test
	public void testOnceThree()
	{
		String actual = Func.convertNumToString(3);
		String expected = "���";

		assertEquals(expected, actual);
	}

	@Test
	public void testOnceFour()
	{
		String actual = Func.convertNumToString(4);
		String expected = "������";

		assertEquals(expected, actual);
	}

	@Test
	public void testOnceFive()
	{
		String actual = Func.convertNumToString(5);
		String expected = "����";

		assertEquals(expected, actual);
	}

	@Test
	public void testOnceNine()
	{
		String actual = Func.convertNumToString(9);
		String expected = "������";
		assertEquals(expected, actual);
	}

	// �������

	@Test
	public void testTeenseEleven()
	{
		String actual = Func.convertNumToString(11);
		String expected = "����������";
		assertEquals(expected, actual);
	}
	@Test
	public void testTeense_15()
	{
		String actual = Func.convertNumToString(15);
		String expected = "����������";
		assertEquals(expected, actual);
	}
	@Test
	public void testTeense_20()
	{
		String actual = Func.convertNumToString(20);
		String expected = "��������";
		assertEquals(expected, actual);
	}
	@Test
	public void testTeense_1_40()
	{
		String actual = Func.convertNumToString(40);
		String expected = "�����";
		assertEquals(expected, actual);
	}
	@Test
	public void testTeense_1_50()
	{
		String actual = Func.convertNumToString(60);
		String expected = "����������";
		assertEquals(expected, actual);
	}
	@Test
	public void testTeense_1_70()
	{
		String actual = Func.convertNumToString(70);
		String expected = "��������";
		assertEquals(expected, actual);
	}
	@Test
	public void testTeense_1_90()
	{
		String actual = Func.convertNumToString(90);
		String expected = "���������";
		assertEquals(expected, actual);
	}
	
	@Test
	public void testTeense_1_22()
	{
		String actual = Func.convertNumToString(23);
		String expected = "�������� ���";
		assertEquals(expected, actual);
	}

}
