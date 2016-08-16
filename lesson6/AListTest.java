package lesson6;

import static org.junit.Assert.*;

import org.junit.Test;

public class AListTest
{

	// ======================================
	// clear
	// ======================================
	@Test(expected = IllegalArgumentException.class)
	public void testClear_null()
	{
		AList lst = new AList();
		int[] ini = null;
		lst.init(ini);
		lst.clear();
		assertEquals(0, lst.size());
	}

	@Test(expected = IllegalArgumentException.class)
	public void testClear_0()
	{
		AList lst = new AList();
		int[] ini = {};
		lst.init(ini);
		lst.clear();
		assertEquals(0, lst.size());
	}

	@Test
	public void testClear_1()
	{
		AList lst = new AList();
		int[] ini = { 10 };
		lst.init(ini);
		lst.clear();
		assertEquals(0, lst.size());
	}

	@Test
	public void testClear_2()
	{
		AList lst = new AList();
		int[] ini = { 10, 20 };
		lst.init(ini);
		lst.clear();
		assertEquals(0, lst.size());
	}

	@Test
	public void testClear_many()
	{
		AList lst = new AList();
		int[] ini = { 10, 20, 34, 11, 77, 99, 27 };
		lst.init(ini);
		lst.clear();
		assertEquals(0, lst.size());
	}

	// ==================================================
	// -------- init array
	// ==================================================
	@Test(expected = IllegalArgumentException.class)
	public void testInit()
	{
		AList al = new AList();
		int[] expecteds = null;
		al.init(expecteds);
		int[] actuals = null;
		assertArrayEquals(expecteds, actuals);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testInitEmpty()
	{
		AList al = new AList();
		int[] expecteds = {};
		al.init(expecteds);
		int[] actuals = {};
		assertArrayEquals(expecteds, actuals);
	}

	@Test
	public void testInit_0()
	{
		AList al = new AList();
		int[] expecteds = { 0 };
		al.init(expecteds);
		int[] actuals = { 0 };
		assertArrayEquals(expecteds, actuals);
	}

	@Test
	public void testInit_01()
	{
		AList al = new AList();
		int[] expecteds = { 0, 1 };
		al.init(expecteds);
		int[] actuals = { 0, 1 };
		assertArrayEquals(expecteds, actuals);
	}

	@Test
	public void testInitMany_1()
	{
		AList al = new AList();
		int[] expecteds = { 0, 1, 3, 6, 7, 8, -1, 6, -1 };
		al.init(expecteds);
		int[] actuals = { 0, 1, 3, 6, 7, 8, -1, 6, -1 };
		assertArrayEquals(expecteds, actuals);
	}

	@Test
	public void testInitMany_2()
	{
		AList al = new AList();
		int[] expecteds = { 0, 1, -3, -6, -7, -8, -1, 6, -1 };
		al.init(expecteds);
		int[] actuals = { 0, 1, -3, -6, -7, -8, -1, 6, -1 };
		assertArrayEquals(expecteds, actuals);
	}

	// ===================================================
	// ----------- test on size
	// ===================================================

	@Test
	public void testSize_0()
	{
		AList al = new AList();
		int expecteds = al.size();
		int actuals = 0;
		assertEquals(expecteds, actuals);
	}

	@Test
	public void testSize_1()
	{
		AList al = new AList();
		int[] ar = { 1 };
		al.init(ar);
		int expecteds = al.size();
		int actuals = 1;
		assertEquals(expecteds, actuals);
	}

	@Test
	public void testSize_12()
	{
		AList al = new AList();
		int[] ar = { 1, 2 };
		al.init(ar);
		int expecteds = al.size();
		int actuals = 2;
		assertEquals(expecteds, actuals);
	}

	@Test
	public void testSizeMany_1()
	{
		AList al = new AList();
		int[] ar = { 0, 1, 3, 6, 7, 8, -1, 6, -1 };
		al.init(ar);
		int expecteds = al.size();
		int actuals = 9;
		assertEquals(expecteds, actuals);
	}

	@Test
	public void testSizeMany_2()
	{
		AList al = new AList();
		int[] ar = { 0, 1, -3, -6, -7, -8, -1, 6, -1 };
		al.init(ar);
		int expecteds = al.size();
		int actuals = 9;
		assertEquals(expecteds, actuals);
	}

	// ================================================
	// ----------- test toArray -----------------------
	// ================================================

	@Test(expected = IllegalArgumentException.class)
	public void testToArrayEmpty()
	{
		AList al = new AList();
		int[] tmp = {};
		al.init(tmp);
		int[] expecteds = al.toArray();
		int[] actuals = {};

		assertArrayEquals(expecteds, actuals);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testToArrayNull()
	{
		AList al = new AList();
		int[] tmp = null;
		al.init(tmp);
		int[] expecteds = al.toArray();
		int[] actuals = {};
		assertArrayEquals(expecteds, actuals);
	}

	@Test
	public void testToArray_0()
	{
		AList al = new AList();
		int[] tmp = { 0 };
		al.init(tmp);
		int[] expecteds = al.toArray();
		int[] actuals = { 0 };
		assertArrayEquals(expecteds, actuals);
	}

	@Test
	public void testToArray_01()
	{
		AList al = new AList();
		int[] tmp = { 0, 1 };
		al.init(tmp);
		int[] expecteds = al.toArray();
		int[] actuals = { 0, 1 };
		assertArrayEquals(expecteds, actuals);

	}

	@Test
	public void testToArrayMany_1()
	{
		AList al = new AList();
		int[] tmp = { 0, 1, 3, 6, 7, 8, -1, 6, -1 };
		al.init(tmp);
		int[] expecteds = al.toArray();
		int[] actuals = { 0, 1, 3, 6, 7, 8, -1, 6, -1 };
		assertArrayEquals(expecteds, actuals);
	}

	@Test
	public void testToArrayMany_2()
	{
		AList al = new AList();
		int[] tmp = { 0, 1, 3, -6, -7, -8, -1, 6, -1 };
		al.init(tmp);
		int[] expecteds = al.toArray();
		int[] actuals = { 0, 1, 3, -6, -7, -8, -1, 6, -1 };
		assertArrayEquals(expecteds, actuals);
	}

	// ================================================
	// ----------- test addStart ----------------------
	// ================================================

	@Test(expected = IllegalArgumentException.class)
	public void testaddStartEmpty()
	{
		AList lst = new AList();
		int[] ini = {};
		lst.init(ini);
		lst.addStart(2);
		int[] exp = { 2 };
		int[] act = lst.toArray();
		assertArrayEquals(exp, act);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testaddStartNull()
	{
		AList lst = new AList();
		int[] ini = null;
		lst.init(ini);
		lst.addStart(2);
		int[] exp = { 2 };
		int[] act = lst.toArray();
		assertArrayEquals(exp, act);
	}

	@Test
	public void testaddStart_0()
	{
		AList lst = new AList();
		int[] ini = { 0 };
		lst.init(ini);
		lst.addStart(2);
		int[] exp = { 2, 0 };
		int[] act = lst.toArray();
		assertArrayEquals(exp, act);
	}

	@Test
	public void testaddStart_1()
	{
		AList lst = new AList();
		int[] ini = { 1 };
		lst.init(ini);
		lst.addStart(2);
		int[] exp = { 2, 1 };
		int[] act = lst.toArray();
		assertArrayEquals(exp, act);
	}

	@Test
	public void testaddStartMany_1()
	{
		AList lst = new AList();
		int[] ini = { 10, -211, -2, -333, -21, -30 };
		lst.init(ini);
		lst.addStart(-99);
		int[] exp = { -99, 10, -211, -2, -333, -21, -30 };
		int[] act = lst.toArray();
		assertArrayEquals(exp, act);
	}

	@Test
	public void testaddStartMany_2()
	{
		AList lst = new AList();
		int[] ini = { 10, 211, -2, 333, 21, 30 };
		lst.init(ini);
		lst.addStart(-99);
		int[] exp = { -99, 10, 211, -2, 333, 21, 30 };
		int[] act = lst.toArray();
		assertArrayEquals(exp, act);
	}

	// ===========================================================
	// ------ test addEnd
	// ================================================================

	@Test(expected = IllegalArgumentException.class)
	public void testaddEndEmpty()
	{
		AList lst = new AList();
		int[] ini = {};
		lst.init(ini);
		lst.addEnd(2);
		int[] exp = { 2 };
		int[] act = lst.toArray();
		assertArrayEquals(exp, act);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testaddEndNull()
	{
		AList lst = new AList();
		int[] ini = null;
		lst.init(ini);
		lst.addEnd(2);
		int[] exp = { 2 };
		int[] act = lst.toArray();
		assertArrayEquals(exp, act);
	}

	@Test
	public void testaddEnd_0()
	{
		AList lst = new AList();
		int[] ini = { 0 };
		lst.init(ini);
		lst.addEnd(2);
		int[] exp = { 0, 2 };
		int[] act = lst.toArray();
		assertArrayEquals(exp, act);
	}

	@Test
	public void testaddEnd_1()
	{
		AList lst = new AList();
		int[] ini = { 1 };
		lst.init(ini);
		lst.addEnd(2);
		int[] exp = { 1, 2 };
		int[] act = lst.toArray();
		assertArrayEquals(exp, act);
	}

	@Test
	public void testaddEndMany_1()
	{
		AList lst = new AList();
		int[] ini = { 10, -211, -2, -333, -21, -30 };
		lst.init(ini);
		lst.addEnd(-99);
		int[] exp = { 10, -211, -2, -333, -21, -30, -99 };
		int[] act = lst.toArray();
		assertArrayEquals(exp, act);
	}

	@Test
	public void testaddEndMany_2()
	{
		AList lst = new AList();
		int[] ini = { 10, 211, -2, 333, 21, 30 };
		lst.init(ini);
		lst.addEnd(-99);
		int[] exp = { 10, 211, -2, 333, 21, 30, -99 };
		int[] act = lst.toArray();
		assertArrayEquals(exp, act);
	}

	// =================================================
	// ------------ test AddPos -----------------------
	// ================================================

	@Test(expected = IllegalArgumentException.class)
	public void testaddPosEmpty()
	{
		AList lst = new AList();
		int[] ini = {};
		lst.init(ini);
		lst.addPos(0, 1);
		int[] exp = { 1 };
		int[] act = lst.toArray();
		assertArrayEquals(exp, act);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testaddPosNull()
	{
		AList lst = new AList();
		int[] ini = null;
		lst.init(ini);
		lst.addPos(0, 1);
		int[] exp = { 1 };
		int[] act = lst.toArray();
		assertArrayEquals(exp, act);
	}

	@Test
	public void testaddPos_0()
	{
		AList lst = new AList();
		int[] ini = { 0 };
		lst.init(ini);
		lst.addPos(0, 1);
		int[] exp = { 1, 0 };
		int[] act = lst.toArray();
		assertArrayEquals(exp, act);
	}

	@Test
	public void testaddPos_1()
	{
		AList lst = new AList();
		int[] ini = { 1 };
		lst.init(ini);
		lst.addPos(0, 3);
		int[] exp = { 3, 1 };
		int[] act = lst.toArray();
		assertArrayEquals(exp, act);
	}

	@Test
	public void testaddPosMany_1()
	{
		AList lst = new AList();
		int[] ini = { 10, -211, -2, -333, -21, -30 };
		lst.init(ini);
		lst.addPos(3, 99);
		int[] exp = { 10, -211, -2, 99, -333, -21, -30 };
		int[] act = lst.toArray();
		assertArrayEquals(exp, act);
	}

	@Test
	public void testaddPosMany_2()
	{
		AList lst = new AList();
		int[] ini = { 10, 211, -2, 333, 21, 30 };
		lst.init(ini);
		lst.addPos(2, -99);
		int[] exp = { 10, 211, -99, -2, 333, 21, 30 };
		int[] act = lst.toArray();
		assertArrayEquals(exp, act);
	}

	// =================================================
	// ------------ test DelStart ---------------------
	// ================================================

	@Test(expected = IllegalArgumentException.class)
	public void testdelStartEmpty()
	{
		AList lst = new AList();
		int[] ini = {};
		lst.init(ini);
		lst.delStart();
		int[] exp = {};
		int[] act = lst.toArray();
		assertArrayEquals(exp, act);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testdelStartNull()
	{
		AList lst = new AList();
		int[] ini = null;
		lst.init(ini);
		lst.delStart();
		int[] exp = {};
		int[] act = lst.toArray();
		assertArrayEquals(exp, act);
	}

	@Test
	public void testdelStart_0()
	{
		AList lst = new AList();
		int[] ini = { 1, 0 };
		lst.init(ini);
		lst.delStart();
		int[] exp = { 0 };
		int[] act = lst.toArray();
		assertArrayEquals(exp, act);
	}

	@Test
	public void testdelStart_1()
	{
		AList lst = new AList();
		int[] ini = { 0, 1 };
		lst.init(ini);
		lst.delStart();
		int[] exp = { 1 };
		int[] act = lst.toArray();
		assertArrayEquals(exp, act);
	}

	@Test
	public void testdelStartMany_1()
	{
		AList lst = new AList();
		int[] ini = { 10, -211, -2, -333, -21, -30 };
		lst.init(ini);
		lst.delStart();
		int[] exp = { -211, -2, -333, -21, -30 };
		int[] act = lst.toArray();
		assertArrayEquals(exp, act);
	}

	@Test
	public void testdelStartMany_2()
	{
		AList lst = new AList();
		int[] ini = { 10, 211, -2, 333, 21, 30 };
		lst.init(ini);
		lst.delStart();
		int[] exp = { 211, -2, 333, 21, 30 };
		int[] act = lst.toArray();
		assertArrayEquals(exp, act);
	}

	// =================================================
	// ------------ test DelEnd ---------------------
	// ================================================
	@Test(expected = IllegalArgumentException.class)
	public void testdelEndEmpty()
	{
		AList lst = new AList();
		int[] ini = {};
		lst.init(ini);
		lst.delEnd();
		int[] exp = {};
		int[] act = lst.toArray();
		assertArrayEquals(exp, act);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testdelEndNull()
	{
		AList lst = new AList();
		int[] ini = null;
		lst.init(ini);
		lst.delEnd();
		int[] exp = {};
		int[] act = lst.toArray();
		assertArrayEquals(exp, act);
	}

	@Test
	public void testdelEnd_0()
	{
		AList lst = new AList();
		int[] ini = { 1, 0 };
		lst.init(ini);
		lst.delEnd();
		int[] exp = { 1 };
		int[] act = lst.toArray();
		assertArrayEquals(exp, act);
	}

	@Test
	public void testdelEnd_1()
	{
		AList lst = new AList();
		int[] ini = { 0, 1 };
		lst.init(ini);
		lst.delEnd();
		int[] exp = { 0 };
		int[] act = lst.toArray();
		assertArrayEquals(exp, act);
	}

	@Test
	public void testdelEndMany_1()
	{
		AList lst = new AList();
		int[] ini = { 10, -211, -2, -333, -21, -30 };
		lst.init(ini);
		lst.delEnd();
		int[] exp = { 10, -211, -2, -333, -21 };
		int[] act = lst.toArray();
		assertArrayEquals(exp, act);
	}

	@Test
	public void testdelEndMany_2()
	{
		AList lst = new AList();
		int[] ini = { 10, 211, -2, 333, 21, 30 };
		lst.init(ini);
		lst.delEnd();
		int[] exp = { 10, 211, -2, 333, 21 };
		int[] act = lst.toArray();
		assertArrayEquals(exp, act);
	}

	// =================================================
	// --------------- test DelPos ---------------------
	// =================================================
	@Test
	public void testDelPos()
	{
		fail("Not yet implemented");
	}

	@Test
	public void testMin()
	{
		fail("Not yet implemented");
	}

	@Test
	public void testMax()
	{
		fail("Not yet implemented");
	}

	@Test
	public void testMinInd()
	{
		fail("Not yet implemented");
	}

	@Test
	public void testMaxInd()
	{
		fail("Not yet implemented");
	}

	@Test
	public void testSet()
	{
		fail("Not yet implemented");
	}

	@Test
	public void testGet()
	{
		fail("Not yet implemented");
	}

	@Test
	public void testReverse()
	{
		fail("Not yet implemented");
	}

	@Test
	public void testHalfReverse()
	{
		fail("Not yet implemented");
	}

	@Test
	public void testSort()
	{
		fail("Not yet implemented");
	}
}
