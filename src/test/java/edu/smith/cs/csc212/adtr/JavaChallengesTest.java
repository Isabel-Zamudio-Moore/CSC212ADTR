// Citation: Starter Code from https://github.com/jjfiv/CSC212ADTR
// With Guidance from TAs
// Lab Partner: Talia

package edu.smith.cs.csc212.adtr;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

import edu.smith.cs.csc212.adtr.real.JavaList;
import edu.smith.cs.csc212.adtr.real.JavaSet;

public class JavaChallengesTest {

	/**
	 * Test that the intersection method functions as has been expected for empty
	 * lists
	 */
	@Test
	public void testIntersectionEmpty() {
		SetADT<String> leftListIntersection0 = new JavaSet();
		SetADT<String> rightListIntersection0 = new JavaSet();

	}

	/**
	 * Test that the intersection method works to join sets for single and larger
	 * lists
	 */
	@Test
	public void testIntersection() {
		SetADT leftListIntersection1 = new JavaSet();
		SetADT rightListIntersection1 = new JavaSet();

		SetADT<String> leftListIntersection = new JavaSet();
		SetADT<String> rightListIntersection = new JavaSet();

	}

	/**
	 * Test that the union method functions as has been expected for empty lists
	 */
	@Test
	public void UnionEmpty() {
		SetADT<String> leftListUnion0 = new JavaSet();
		SetADT<String> rightListUnion0 = new JavaSet();

	}

	/**
	 * Test that the union method works to join sets for single and larger lists
	 */
	@Test
	public void testUnion() {
		SetADT<String> leftListUnion1 = new JavaSet();
		SetADT<String> rightListUnion1 = new JavaSet();

		SetADT<String> leftListUnion = new JavaSet();
		SetADT<String> rightListUnion = new JavaSet();

	}

	/**
	 * Test that the word count method functions as has been expected for empty
	 * lists
	 */
	@Test
	public void testWordCountEmpty() {
		ListADT<String> leftListIntersection0 = new JavaList();
		ListADT<String> rightListIntersection0 = new JavaList();

	}

	/**
	 * Test that the word count method works for a list for single and larger lists
	 */
	@Test
	public void testWordCount() {
		ListADT<String> ListWordCount1 = new JavaList();
		ListWordCount1.addFront("This");
		MapADT ListWordCountMap1 = Challenges.wordCount(ListWordCount1);
		assertEquals(ListWordCountMap1.get("This"), 1);
		// Create a longer list and see if word count will return the
		// value (Word Count) expected for each word
		ListADT<String> ListWordCount = new JavaList();
		ListWordCount.addBack("This");
		ListWordCount.addBack("Morning");
		ListWordCount.addBack("Was");
		MapADT ListWordCountMap = Challenges.wordCount(ListWordCount);
		assertEquals(ListWordCountMap.get("This"), 1);
		assertEquals(ListWordCountMap.get("Morning"), 2);
		assertEquals(ListWordCountMap.get("Was"), 3);

	}

}
