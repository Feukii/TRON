package model;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;



public class GestionTest extends TestCase {

	Gestion ges = new Gestion();

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link org.model.BoolTime#getWinner()}.
	 */
	@Test
	public void testGetWinner() {
		//fail("Not yet implemented");
		ges.setWinner("Manoel");
		assertEquals(ges.getWinner(), "Manoel");
	}

	/**
	 * Test method for {@link org.model.BoolTime#setWinner(java.lang.String)}.
	 */
	@Test
	public void testSetWinner() {
		//fail("Not yet implemented");
		ges.setWinner("jeu");
		String expectedStr = ges.getWinner();
		assertEquals(expectedStr, "jeu");
	}

	/**
	 * Test method for {@link org.model.BoolTime#isValeur()}.
	 */
	@Test
	public void testIsValeur() {
		//fail("Not yet implemented");
		ges.setValeur(true);
		assertEquals(ges.isValeur(), true);
	}

	/**
	 * Test method for {@link org.model.BoolTime#setValeur(boolean)}.
	 */
	@Test
	public void testSetValeur() {
		//fail("Not yet implemented");
		ges.setValeur(true);
		boolean expectedGes = ges.isValeur();
		assertEquals(expectedGes, true);
	}

	/**
	 * Test method for {@link org.model.BoolTime#getTime()}.
	 */
	@Test
	public void testGetTime() {
		//fail("Not yet implemented");
		ges.setTime(3);
		assertEquals(ges.getTime(), 3);
	}

	/**
	 * Test method for {@link org.model.BoolTime#setTime(int)}.
	 */
	@Test
	public void testSetTime() {
		//fail("Not yet implemented");
		ges.setTime(3);
		int expectedTime = ges.getTime();
		assertEquals(expectedTime, 3);
	}

}

