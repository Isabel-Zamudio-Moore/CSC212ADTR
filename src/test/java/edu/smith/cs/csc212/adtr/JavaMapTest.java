// Citation: Starter Code from https://github.com/jjfiv/CSC212ADTR
// With Guidance from TAs
// Lab Partner: Talia

package edu.smith.cs.csc212.adtr;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import edu.smith.cs.csc212.adtr.real.JavaMap;

public class JavaMapTest {

	/**
	 * Allow us to test that an integer is equal with another integer
	 */
	// you might want this.
	void assertIntEq(int x, int y) {
		assertEquals(x, y);
	}

	/**
	 * Test that empty map is empty The test should have no errors or failures if
	 * the empty map is empty
	 */
	@Test
	public void testEmpty() {
		MapADT<String, String> empty = new JavaMap<>();
		assertEquals(empty.size(), 0);
		// Assert.assert
	}

	/**
	 * Test that put method is working The test should have no errors or failures if
	 * the put method is putting items into map
	 */
	@Test
	public void testPut() {
		MapADT<String, Integer> Put = new JavaMap<>();
		Put.put("YourScore", 10);
		Put.put("T's Score", 14);
		Put.put("L's Score", 19);
		assertEquals(Put.size() == 3, true);
		assertEquals(Put.size() == 1, false);

	}

	/**
	 * Test that get method is working The test should have no errors or failures if
	 * the get method is telling us the corresponding value to the key we want
	 */

	@Test
	public void testGet() {
		MapADT<String, Integer> Get = new JavaMap<>();
		Get.put("Your Score", 12);
		Get.put("T's Score", 14);
		Get.put("L's Score", 18);
		assertEquals((int) Get.get("T's Score"), (int) 14);
		assertEquals(Get.get("T's Score") == 20, false);
		assertEquals(Get.get("L's Score") == 18, true);
		assertEquals(Get.get("L's Score") == 17, false);
		assertEquals(Get.get("Your Score") == 12, true);
		assertEquals(Get.get("Your Score") == 20, false);

	}

	/**
	 * Test that size method is working The test should have no errors or failures
	 * if the size is what we expect it to be
	 */
	@Test
	public void testSize() {
		MapADT<String, Integer> Size = new JavaMap<>();
		Size.put("Your Score", 15);
		Size.put("T's Score", 16);
		Size.put("L's Score", 17);
		assertEquals(Size.size() == 3, true);
		assertEquals(Size.size() == 6, false);

	}

	/**
	 * Test that remove method is working The test should have no errors or failures
	 * if the remove method is removing the item we ask to remove
	 */
	@Test
	public void testRemove() {
		MapADT<String, Integer> Remove = new JavaMap<>();
		Remove.put("Your Score", 30);
		Remove.put("T's Score", 20);
		Remove.put("L's Score", 20);
		assertEquals((int) Remove.remove("Your Score"), 30);
		// assertEquals(Remove.size()==7, false);

	}
}
