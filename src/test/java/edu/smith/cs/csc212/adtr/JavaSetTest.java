package edu.smith.cs.csc212.adtr;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import edu.smith.cs.csc212.adtr.real.JavaSet;

public class JavaSetTest {
	
	/**
	 *  Test that empty set is empty
	 *  The test should have no errors or failures
	 *  if the size method works
	 */
	@Test
	public void testEmpty() {
		SetADT<String> empty = new JavaSet<>();
		assertEquals(empty.size(), 0);
	}
	
	/**
	 *  Test that size method is working
	 *  The test should have no errors or failures
	 *  if the size method works
	 */
	@Test	
	public void testSize() {
		SetADT<String> size_z= new JavaSet();
		SetADT<String> size_n= new JavaSet();
		SetADT<String> size_in =new JavaSet();
		SetADT<String> size_l =new JavaSet();
		size_n.insert("Hello");
		size_in.insert("Hello");
		size_in.insert("World");
			size_l.insert("Hello");
			size_l.insert("World");
			size_l.insert(",");
			size_l.insert("this");
			size_l.insert("is");
			size_l.insert( "not");
			size_l.insert("a");
			size_l.insert("sentence");
			
		// assert equals to false should not crash given
		// the lhs has a false statement
		assertEquals(size_z.size(), 0);
		assertEquals(size_z.size()==10, false);
		assertEquals(size_n.size(), 1);	
		assertEquals(size_n.size()==2, false);
		assertEquals(size_l.size(), 8);
		assertEquals(size_l.size()==2, false);

}			
	/**
	 *  Test that insert method is working
	 *  The test should have no errors or failures
	 *  if the insert method works
	 */
	@Test	
	public void testInsert() {
		SetADT<String> Insert= new JavaSet();
		Insert.insert("Added");
		assertEquals(Insert.size()==1, true);
		assertEquals(Insert.size()==2, false);

	}
	
	/**
	 *  Test that contains method is working
	 *  The test should have no errors or failures
	 *  if the contains method works
	 */
	@Test
	public void testContains() {
		SetADT<String> Contains= new JavaSet();
		Contains.insert("Red");
		Contains.insert("Orange");
		Contains.insert("Yellow");
		Contains.insert("Green");
		Contains.insert("Blue");
		Contains.insert("Indigo");
		Contains.insert("Violet");
		assertEquals(Contains.size()==7,true);
		assertEquals(Contains.size()==10,false);

	}
	
	/**
	 *  Test that remove method is working
	 *  The test should have no errors or failures
	 *  if the remove method works
	 */
	@Test
	public void testRemove() {
		SetADT<String> Remove= new JavaSet();
		Remove.insert("dogs");
		Remove.insert("cats");
		Remove.insert("pigs");
		Remove.insert("horse");
		Remove.remove("horse");
		assertEquals( Remove.size(), 3);
		assertEquals( Remove.size()==2, false);

	}
	
	
}
