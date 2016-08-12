package lesson1;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;


public class TestConvert {

	public static Convert conv;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		conv = new Convert();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		conv = null;
	}

	@Test
	public void testConvertToStringInt() {
		String actual = conv.convertToString(19);
		String expected = "19";
		assertTrue(actual.equals(expected));
	}

	@Test
	public void testConvertToStringDouble() {
		String actual = conv.convertToString(19.6);
		String expected = "19.6";
		assertTrue(actual.equals(expected));
	}

	@Test
	public void testConvertToStringString() {
		Integer actual = conv.convertToString("19");
		Integer expected = 19;
		assertTrue(actual.equals(expected));
	}

	@Test
	public void testConvertToDouble() {
		Double actual = conv.convertToDouble("19.2");
		double expected = 19.2;
		assertTrue(actual.equals(expected));
	}

}
