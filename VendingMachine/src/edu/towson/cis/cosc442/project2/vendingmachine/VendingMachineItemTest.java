/**
 * 
 */
package edu.towson.cis.cosc442.project2.vendingmachine;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author edwinmwaniki
 *
 */
public class VendingMachineItemTest {
	VendingMachineItem v1;
	VendingMachineItem v2;

	@Before
	public void setUp() throws Exception {
		 v1 = new VendingMachineItem("Cookies",5.00);
		 v2 = new VendingMachineItem("Chips",20.00);
		
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		v1 = null;
		v2 = null;
	}

	/**
	 * Test method for {@link edu.towson.cis.cosc442.project2.vendingmachine.VendingMachineItem#VendingMachineItem(java.lang.String, double)}.
	 */
	@Test
	public void testVendingMachineItem() {
		assertEquals("Cookies",v1.getName());
	}

	/**
	 * Test method for {@link edu.towson.cis.cosc442.project2.vendingmachine.VendingMachineItem#getName()}.
	 */
	@Test
	public void testGetName() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link edu.towson.cis.cosc442.project2.vendingmachine.VendingMachineItem#getPrice()}.
	 */
	@Test
	public void testGetPrice() {
		fail("Not yet implemented");
	}

}
