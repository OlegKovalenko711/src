package lesson1;

import static org.junit.Assert.*;
import org.junit.Test;

public class TestWWD
{
	// ÚÂÒÚ Á‡‰‡ÌËÂ 1
	@Test(expected = IllegalArgumentException.class)
	public void testCountDigitZero()
	{
		WorkWithDigit.countDigits(0, 0);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testCountDigitFirstZero()
	{
		WorkWithDigit.countDigits(1, 0);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testCountDigitSecondZero()
	{
		WorkWithDigit.countDigits(0, 1);
	}

	@Test
	public void testCountDigitMul()
	{
		int actual = WorkWithDigit.countDigits(4, 2);
		int expected = 8;
		assertEquals(expected, actual);
	}

	@Test
	public void testCountDigitPlus()
	{
		int actual = WorkWithDigit.countDigits(3, 2);
		int expected = 5;
		assertEquals(expected, actual);
	}

	// “ÂÒÚ Á‡‰‡ÌËÂ 2

	@Test(expected = IllegalArgumentException.class)
	public void testFindPointZero()
	{
		WorkWithDigit.findPoint(0, 0);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testFindPointFirstZero()
	{
		WorkWithDigit.findPoint(1, 0);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testFindPointSecondZero()
	{
		WorkWithDigit.findPoint(0, 1);
	}

	@Test
	public void testFindPoint_1()
	{
		int actual = WorkWithDigit.findPoint(1, 1);
		assertEquals(1, actual);
	}

	@Test
	public void testFindPoint_2()
	{
		int actual = WorkWithDigit.findPoint(-1, 1);
		assertEquals(2, actual);
	}

	@Test
	public void testFindPoint_3()
	{
		int actual = WorkWithDigit.findPoint(-1, -1);
		assertEquals(3, actual);
	}

	@Test
	public void testFindPoint_4()
	{
		int actual = WorkWithDigit.findPoint(1, -1);
		assertEquals(4, actual);
	}

	// “ÂÒÚ Á‚‰‚ÌËÂ 3

	@Test(expected = IllegalArgumentException.class)
	public void testFindSumEvan()
	{
		WorkWithDigit.findSum(-1, -2, -3);
	}

	@Test
	public void testFindSumAEvan()
	{
		int actual = WorkWithDigit.findSum(-2, 1, 1);
		assertEquals(2, actual);
	}

	@Test
	public void testFindSumBZero()
	{
		int actual = WorkWithDigit.findSum(1, -1, 1);
		assertEquals(2, actual);
	}

	@Test
	public void testFindSumABEvan()
	{
		int actual = WorkWithDigit.findSum(-1, -2, 1);
		assertEquals(0, actual);
	}

	@Test
	public void testFindSumACEvan()
	{
		int actual = WorkWithDigit.findSum(-1, 2, -3);
		assertEquals(0, actual);
	}

	@Test
	public void testFindSumBCEvan()
	{
		int actual = WorkWithDigit.findSum(1, -2, -3);
		assertEquals(0, actual);
	}

	// “ÂÒÚ Á‡‰‡ÌËÂ 4

	@Test(expected = IllegalArgumentException.class)
	public void test—ountVirajenieNull()
	{
		WorkWithDigit.countVirajenie(0, 0, 0);
	}

	@Test
	public void test—ountVirajenieMul()
	{
		int actual = WorkWithDigit.countVirajenie(2, 2, 2);
		assertEquals(11, actual);
	}

	@Test
	public void test—ountVirajeniePlus()
	{
		int actual = WorkWithDigit.countVirajenie(1, 2, 1);
		assertEquals(7, actual);
	}

	// “ÂÒÚ Á‡‰‡ÌËÂ 5

	@Test(expected = IllegalArgumentException.class)
	public void testCountBalEvan()
	{
		WorkWithDigit.countBal(-20);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testCountBalHundred()
	{
		WorkWithDigit.countBal(120);
	}

	@Test
	public void testCountBal_F_1()
	{
		char actual = WorkWithDigit.countBal(8);
		char expected = 'F';

		assertEquals(expected, actual);
	}

	@Test
	public void testCountBal_F_2()
	{
		char actual = WorkWithDigit.countBal(10);
		char expected = 'F';

		assertEquals(expected, actual);
	}

	@Test
	public void testCountBal_F_3()
	{
		char actual = WorkWithDigit.countBal(15);
		char expected = 'F';

		assertEquals(expected, actual);
	}

	@Test
	public void testCountBal_E_1()
	{
		char actual = WorkWithDigit.countBal(25);
		char expected = 'E';

		assertEquals(expected, actual);
	}

	@Test
	public void testCountBal_E_2()
	{
		char actual = WorkWithDigit.countBal(30);
		char expected = 'E';

		assertEquals(expected, actual);
	}

	@Test
	public void testCountBal_E_3()
	{
		char actual = WorkWithDigit.countBal(39);
		char expected = 'E';

		assertEquals(expected, actual);
	}

	@Test
	public void testCountBal_D_1()
	{
		char actual = WorkWithDigit.countBal(42);
		char expected = 'D';

		assertEquals(expected, actual);
	}

	@Test
	public void testCountBal_D_2()
	{
		char actual = WorkWithDigit.countBal(50);
		char expected = 'D';

		assertEquals(expected, actual);
	}

	@Test
	public void testCountBal_D_3()
	{
		char actual = WorkWithDigit.countBal(55);
		char expected = 'D';

		assertEquals(expected, actual);
	}

	@Test
	public void testCountBal_C_1()
	{
		char actual = WorkWithDigit.countBal(65);
		char expected = 'C';

		assertEquals(expected, actual);
	}

	@Test
	public void testCountBal_C_2()
	{
		char actual = WorkWithDigit.countBal(69);
		char expected = 'C';

		assertEquals(expected, actual);
	}

	@Test
	public void testCountBal_C_3()
	{
		char actual = WorkWithDigit.countBal(72);
		char expected = 'C';

		assertEquals(expected, actual);
	}

	@Test
	public void testCountBal_B_1()
	{
		char actual = WorkWithDigit.countBal(76);
		char expected = 'B';

		assertEquals(expected, actual);
	}

	@Test
	public void testCountBal_B_2()
	{
		char actual = WorkWithDigit.countBal(79);
		char expected = 'B';

		assertEquals(expected, actual);
	}

	@Test
	public void testCountBal_B_3()
	{
		char actual = WorkWithDigit.countBal(85);
		char expected = 'B';

		assertEquals(expected, actual);
	}

	@Test
	public void testCountBal_A_1()
	{
		char actual = WorkWithDigit.countBal(91);
		char expected = 'A';

		assertEquals(expected, actual);
	}

	@Test
	public void testCountBal_A_2()
	{
		char actual = WorkWithDigit.countBal(95);
		char expected = 'A';

		assertEquals(expected, actual);
	}

	@Test
	public void testCountBal_A_3()
	{
		char actual = WorkWithDigit.countBal(98);
		char expected = 'A';

		assertEquals(expected, actual);
	}

}
