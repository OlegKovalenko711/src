package lesson1;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;



public class TestStringsExemple {

	private static StringsExemple s;

	
	@Test
	public void testSmallWorld() {
		int expected = s.smallWorld("f 56"); 
		int actual = 1;
		assertEquals(expected, actual);
	    assertTrue(expected > 0);
	}

	@Test
	public void testRefactSymbols() {
		String expected = s.refactSymbols("d"); 
        assertTrue(expected.length() > 1);
     }

	@Test
	public void testCountOfWord() {
		int expected = s.countOfWord("this,text has an example of symbol");
		int actual = 7;
		assertEquals(expected, actual);
	    assertTrue(expected > 0);
	}
}
