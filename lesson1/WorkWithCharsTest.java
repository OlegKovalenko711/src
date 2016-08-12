package lesson1;

import static org.junit.Assert.*;

import org.junit.Test;

public class WorkWithCharsTest
{

	@Test(expected = IllegalArgumentException.class)
	public void testPrintCharsEn()
	{
		WorkWithChars.printChars(65, 90);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testPrintCharsRu()
	{
		WorkWithChars.printChars(1072, 1103);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testPrintCharsD()
	{
		WorkWithChars.printChars(48, 57);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testPrintCharsDesc()
	{
		WorkWithChars.printCharsDesc(122, 97);
		
	}

}
