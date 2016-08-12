package lesson1;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringsTest
{


	@Test
	public void testSmallWorld()
	{
		int expected = StringsExemple.smallWorld("Hello worlds dd trolol");
		int actual = 2;
		assertEquals(expected, actual);
	}

	@Test
	public void testRefactSymbols()
	{
		String actual = StringsExemple.refactSymbols("replace my symbols please");
		String expected = "repl$$$ my symb$$$ ple$$$ ";
		assertEquals(expected, actual);
	}

	@Test
	public void testCreateProbel()
	{
		String actual = StringsExemple.createProbel("this is some text:kuku,i'm here");
		String expected = "this is some text: kuku, i'm here";
		assertEquals(expected, actual);
	}

	@Test
	public void testOneSymbol()
	{
		String actual = StringsExemple.oneSymbol("this text has an example of symbol");
		String expected = "thisexanmplofyb";
		assertEquals(expected, actual);
	}
	
	@Test
	public void testOneSymbol_1()
	{
		String actual = StringsExemple.oneSymbol("this text has an example of symbol");
		String expected = "thisexanmplofyb";
		assertEquals(expected, actual);
	}

	@Test
	public void testCountOfWord()
	{
		int actual = StringsExemple.countOfWord("this text has an example of symbol");
		int expected = 7;
		assertEquals(expected, actual);

	}

	@Test
	public void testDeleteString()
	{
		String actual = StringsExemple.deleteString("delete from text any symbol", 8, 3);
		String expected = "delete from text  symbol";
		assertEquals(expected, actual);
	}

	@Test
	public void testReverseString()
	{
		String actual = StringsExemple.reverseString("this,text has an example of symbol");
		String expected = "lobmys fo elpmaxe na sah txet,siht";
		assertEquals(expected, actual);
	}

	@Test
	public void testDeleteLastWord()
	{
		String actual = StringsExemple.deleteLastWord("delete last words,please");
		String expected = "delete last words, ";
		assertEquals(expected, actual);
	}

}
