// Citation: Starter Code from https://github.com/jjfiv/CSC212ADTR
// With Guidance from TAs
// Lab Partner: Talia

package edu.smith.cs.csc212.adtr;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import edu.smith.cs.csc212.adtr.real.JavaSet;

public class JavaSetTest {

	/**
	 * Test that empty set is empty The test should have no errors or failures if
	 * the size method works
	 */
	@Test
	public void testEmpty() {
		SetADT<String> empty = new JavaSet<>();
		assertEquals(empty.size(), 0);
	}

	/**
	 * Test that size method is working The test should have no errors or failures
	 * if the size method works
	 */
	@Test
	public void testSize() {
		// Create methods of different sizes
		SetADT<String> size_z = new JavaSet();
		SetADT<String> size_n = new JavaSet();
		SetADT<String> size_in = new JavaSet();
		SetADT<String> size_l = new JavaSet();
		size_n.insert("Hello");
		size_in.insert("Hello");
		size_in.insert("World");
		size_l.insert("Hello");
		size_l.insert("World");
		size_l.insert(",");
		size_l.insert("this");
		size_l.insert("is");
		size_l.insert("not");
		size_l.insert("a");
		size_l.insert("sentence");

		// assert equals to false should not crash given
		// the lhs has a false statement
		
		// Test an list of size 0 will return 0
		// from the size method
		assertEquals(size_z.size(), 0);
		assertEquals(size_z.size() == 10, false);
		
		// Test an list of size 1 will return 1
		//from the size method
		assertEquals(size_n.size(), 1);
		assertEquals(size_n.size() == 2, false);
		
		// Test list of size 8 will return 8 
		//from the size method
		assertEquals(size_l.size(), 8);
		assertEquals(size_l.size() == 2, false);

	}

	/**
	 * Test that insert method is working The test should have no errors or failures
	 * if the insert method works
	 */
	@Test
	public void testInsert() {
		// Test that empty set will have size 1
		// after inserting item
		SetADT<String> Insert0 = new JavaSet();
		Insert0.insert("Added");
		assertEquals(Insert0.size() == 1, true);
		assertEquals(Insert0.size() == 2, false);
		
		// Test that single sized set will be size 2
		// after inserting item
		SetADT<String> Insert1 = Insert0;
		Insert1.insert("Added1");
		assertEquals(Insert1.size() == 2, true);
		assertEquals(Insert1.size() == 3, false);
		
		// Test that set of size 2 will be size 3
		// after inserting item
		SetADT<String> Insert = Insert1;
		Insert.insert("Added2");
		assertEquals(Insert.size() == 3, true);
		assertEquals(Insert.size() == 4, false);
	}

	/**
	 * Test that contains method is working The test should have no errors or
	 * failures if the contains method works
	 */
	@Test
	public void testContains() {
		// Test that for a empty set it contains
		// nothing and is the size is 0
		SetADT<String> Contains0 = new JavaSet();		
		assertEquals(Contains0.size() == 0, true);
		assertEquals(Contains0.size() == 1, false);
		
		// Test that for an empty set it contains
		// what we added and is the size is 1
		SetADT<String> Contains1 = new JavaSet();
		Contains1.insert("Colors");
		assertEquals(Contains1.size() == 1, true);
		assertEquals(Contains1.size() == 2, false);
		assertEquals(Contains1.contains("Colors"), true);

		
		// Test for a larger sized list that it contains
		// what we added and is the size we expect
		SetADT<String> Contains = new JavaSet();
		Contains.insert("Red");
		Contains.insert("Orange");
		Contains.insert("Yellow");
		Contains.insert("Green");
		Contains.insert("Blue");
		Contains.insert("Indigo");
		Contains.insert("Violet");
		assertEquals(Contains.contains("Red"), true);
		assertEquals(Contains.size() == 7, true);
		assertEquals(Contains.size() == 10, false);

	}

	/**
	 * Test that remove method is working The test should have no errors or failures
	 * if the remove method works
	 */
	@Test
	public void testRemove() {
		// Test that remove will delete from empty list
		SetADT <String> Remove0= new JavaSet();
		Remove0.remove("Hare");
		assertEquals(Remove0.size()>0, false);
		
		//Test that remove will delete an item from a single sized list
		SetADT<String> Remove1 = new JavaSet();
		Remove1.insert("birds");
		Remove1.remove("birds");
		assertEquals(Remove1.size(), 0);

		// Test that remove will delete an item from a list of a larger size
		SetADT<String> Remove =  new JavaSet();
		Remove.insert("dogs");
		Remove.insert("cats");
		Remove.insert("pigs");
		Remove.insert("horse");		
		// remove horse from the list
		Remove.remove("horse");
		assertEquals(Remove.size(), 3);
		assertEquals(Remove.size() == 2, false);
		// remove cats from the list
		Remove.remove("cats");
		assertEquals(Remove.size(), 2);
		assertEquals(Remove.size() == 1, false);
		
	}

}
