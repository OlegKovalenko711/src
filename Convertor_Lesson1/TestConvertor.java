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
		String expected = "����";

		assertEquals(expected, actual);
	}
	
	
	@Test
	public void testOnce_1()
	{
		String actual = Convertor.convertNumToString(1);
		String expected = "����";

		assertEquals(expected, actual);
	}

	@Test
	public void testOnce_3()
	{
		String actual = Convertor.convertNumToString(3);
		String expected = "���";

		assertEquals(expected, actual);
	}

	@Test
	public void testOnce_4()
	{
		String actual = Convertor.convertNumToString(4);
		String expected = "������";

		assertEquals(expected, actual);
	}

	@Test
	public void testOnce_5()
	{
		String actual = Convertor.convertNumToString(5);
		String expected = "����";

		assertEquals(expected, actual);
	}

	@Test
	public void testOnce_9()
	{
		String actual = Convertor.convertNumToString(9);
		String expected = "������";
		assertEquals(expected, actual);
	}

	// �������

	@Test
	public void testTeense_11()
	{
		String actual = Convertor.convertNumToString(11);
		String expected = "����������";
		assertEquals(expected, actual);
	}

	@Test
	public void testTeense_15()
	{
		String actual = Convertor.convertNumToString(15);
		String expected = "����������";
		assertEquals(expected, actual);
	}

	@Test
	public void testTeense_20()
	{
		String actual = Convertor.convertNumToString(20);
		String expected = "��������";
		assertEquals(expected, actual);
	}

	@Test
	public void testTeense_1_40()
	{
		String actual = Convertor.convertNumToString(40);
		String expected = "�����";
		assertEquals(expected, actual);
	}

	@Test
	public void testTeense_1_50()
	{
		String actual = Convertor.convertNumToString(60);
		String expected = "����������";
		assertEquals(expected, actual);
	}

	@Test
	public void testTeense_1_70()
	{
		String actual = Convertor.convertNumToString(70);
		String expected = "��������";
		assertEquals(expected, actual);
	}

	@Test
	public void testTeense_1_90()
	{
		String actual = Convertor.convertNumToString(90);
		String expected = "���������";
		assertEquals(expected, actual);
	}

	@Test
	public void testTeense_1_22()
	{
		String actual = Convertor.convertNumToString(23);
		String expected = "�������� ���";
		assertEquals(expected, actual);
	}

	@Test
	public void testTeense_1_99()
	{
		String actual = Convertor.convertNumToString(99);
		String expected = "��������� ������";
		assertEquals(expected, actual);
	}

	@Test
	public void testTeense_1_87()
	{
		String actual = Convertor.convertNumToString(87);
		String expected = "����������� ����";
		assertEquals(expected, actual);
	}

	@Test
	public void testTeense_1_56()
	{
		String actual = Convertor.convertNumToString(56);
		String expected = "��������� �����";
		assertEquals(expected, actual);
	}

	@Test
	public void testTeense_1_42()
	{
		String actual = Convertor.convertNumToString(42);
		String expected = "����� ���";
		assertEquals(expected, actual);
	}

	@Test
	public void testTeense_1_31()
	{
		String actual = Convertor.convertNumToString(31);
		String expected = "�������� ����";
		assertEquals(expected, actual);
	}

	@Test
	public void testTeense_1_29()
	{
		String actual = Convertor.convertNumToString(29);
		String expected = "�������� ������";
		assertEquals(expected, actual);
	}

	// �����

	@Test
	public void testHundred_100()
	{
		String actual = Convertor.convertNumToString(100);
		String expected = "���";
		assertEquals(expected, actual);
	}

	@Test
	public void testHundred_200()
	{
		String actual = Convertor.convertNumToString(200);
		String expected = "������";
		assertEquals(expected, actual);
	}

	@Test
	public void testHundred_1_300()
	{
		String actual = Convertor.convertNumToString(300);
		String expected = "������";
		assertEquals(expected, actual);
	}

	@Test
	public void testHundred_1_400()
	{
		String actual = Convertor.convertNumToString(400);
		String expected = "���������";
		assertEquals(expected, actual);
	}

	@Test
	public void testHundred_1_600()
	{
		String actual = Convertor.convertNumToString(600);
		String expected = "��������";
		assertEquals(expected, actual);
	}

	@Test
	public void testHundred_1_111()
	{
		String actual = Convertor.convertNumToString(111);
		String expected = "��� ����������";
		assertEquals(expected, actual);
	}

	@Test
	public void testHundred_1_115()
	{
		String actual = Convertor.convertNumToString(115);
		String expected = "��� ����������";
		assertEquals(expected, actual);
	}

	@Test
	public void testHundred_1_119()
	{
		String actual = Convertor.convertNumToString(119);
		String expected = "��� ������������";
		assertEquals(expected, actual);
	}

	@Test
	public void testHundred_1_650()
	{
		String actual = Convertor.convertNumToString(650);
		String expected = "�������� ���������";
		assertEquals(expected, actual);
	}

	@Test
	public void testHundred_1_121()
	{
		String actual = Convertor.convertNumToString(121);
		String expected = "��� �������� ����";
		assertEquals(expected, actual);
	}

	@Test
	public void testHundred_1_232()
	{
		String actual = Convertor.convertNumToString(232);
		String expected = "������ �������� ���";
		assertEquals(expected, actual);
	}

	@Test
	public void testHundred_1_343()
	{
		String actual = Convertor.convertNumToString(343);
		String expected = "������ ����� ���";
		assertEquals(expected, actual);
	}

	@Test
	public void testHundred_1_657()
	{
		String actual = Convertor.convertNumToString(657);
		String expected = "�������� ��������� ����";
		assertEquals(expected, actual);
	}
	
	
	@Test
	public void testHundred_1_510()
	{
		String actual = Convertor.convertNumToString(510);
		String expected = "������� ������";
		assertEquals(expected, actual);
	}
	
	@Test
	public void testHundred_1_706()
	{
		String actual = Convertor.convertNumToString(706);
		String expected = "������� �����";
		assertEquals(expected, actual);
	}


	@Test
	public void testHundred_1_999()
	{
		String actual = Convertor.convertNumToString(999);
		String expected = "��������� ��������� ������";
		assertEquals(expected, actual);
	}

}
