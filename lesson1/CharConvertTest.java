package lesson1;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;


public class CharConvertTest {

	public static CharConvert conv;

	
	@Test
	public void testConvertToStringInt() {
		String actual = CharConvert.convertToString(19);
		String expected = "19";
		assertTrue(actual.equals(expected));
	}

	@Test
	public void testConvertToStringDouble() {
		String actual = CharConvert.convertToString(19.6);
		String expected = "19.6";
		assertTrue(actual.equals(expected));
	}

	@Test
	public void testConvertToStringString() {
		Integer actual = CharConvert.convertToString("19");
		Integer expected = 19;
		assertTrue(actual.equals(expected));
	}

	@Test
	public void testConvertToDouble() {
		Double actual = CharConvert.convertToDouble("19.2");
		double expected = 19.2;
		assertTrue(actual.equals(expected));
	}

}
