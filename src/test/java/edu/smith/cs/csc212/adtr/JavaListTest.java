// Citation: Starter Code from https://github.com/jjfiv/CSC212ADTR
// With Guidance from Lab Instruction & TAs
// Lab Partner: Talia
package edu.smith.cs.csc212.adtr;

import static org.junit.Assert.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import org.junit.Assert;
import org.junit.Test;

import edu.smith.cs.csc212.adtr.errors.BadIndexError;
import edu.smith.cs.csc212.adtr.errors.EmptyListError;
import edu.smith.cs.csc212.adtr.real.JavaList;

public class JavaListTest {

	/**
	 * Make a new empty list.
	 * 
	 * @return an empty list to be tested.
	 */
	private <T> ListADT<T> makeEmptyList() {
		return new JavaList<>();
	}

	/**
	 * Helper method to make a full list.
	 * 
	 * @return [a, b, c, d] - a small, predictable list for many tests.
	 */
	private ListADT<String> makeFullList() {
		ListADT<String> data = makeEmptyList();
		data.addBack("a");
		data.addBack("b");
		data.addBack("c");
		data.addBack("d");
		return data;
	}

	@Test
	public void testEmpty() {
		ListADT<String> data = makeEmptyList();
		Assert.assertEquals(0, data.size());
		Assert.assertEquals(true, data.isEmpty());
	}

	@Test(expected = EmptyListError.class)
	public void testRemoveFrontCrash() {
		ListADT<String> data = makeEmptyList();
		data.removeFront();
	}

	@Test(expected = EmptyListError.class)
	public void testRemoveBackCrash() {
		ListADT<String> data = makeEmptyList();
		data.removeBack();
	}

	@Test(expected = EmptyListError.class)
	public void testRemoveIndexCrash() {
		ListADT<String> data = makeEmptyList();
		data.removeIndex(3);
	}

	@Test
	public void testAddToFrontEmpty() {
		ListADT<String> testAddToFrontEmpty = makeEmptyList();
	}

	// *
	@Test
	public void testAddToFront() {
		ListADT<String> testAddToFront1 = new JavaList();
		ListADT<String> testAddToFront = makeFullList();

		// Test for new list created
		/*
		 * ListADT<String> data = makeEmptyList(); Assert.assertEquals(true,
		 * data.isEmpty()); data.addFront("1"); Assert.assertEquals(1, data.size());
		 * Assert.assertEquals("1", data.getIndex(0)); Assert.assertEquals(false,
		 * data.isEmpty()); data.addFront("0"); Assert.assertEquals(2, data.size());
		 * Assert.assertEquals("0", data.getIndex(0)); Assert.assertEquals("1",
		 * data.getIndex(1)); Assert.assertEquals(false, data.isEmpty());
		 * data.addFront("-1"); Assert.assertEquals(3, data.size());
		 * Assert.assertEquals("-1", data.getIndex(0)); Assert.assertEquals("0",
		 * data.getIndex(1)); Assert.assertEquals("1", data.getIndex(2));
		 * Assert.assertEquals(false, data.isEmpty()); data.addFront("-2");
		 * Assert.assertEquals("-1", data.getIndex(1)); Assert.assertEquals("-2",
		 * data.getIndex(0)); Assert.assertEquals("0", data.getIndex(2));
		 * Assert.assertEquals("1", data.getIndex(3)); Assert.assertEquals(false,
		 * data.isEmpty());
		 */
	}

	/**
	 * Test that AddToBackEmpty adds items to the back of an Empty List
	 */
	@Test
	public void testAddToBackEmpty() {
		ListADT<String> testAddToBackEmptyList0 = makeEmptyList();
		testAddToBackEmptyList0.addBack("Hello");
		assertEquals(testAddToBackEmptyList0.getIndex(0), "Hello");
	}

	/**
	 * Test that AddToBack adds items to back of list for single and larger sized
	 * lists
	 */
	// Lab: test list addToBack.
	@Test
	public void testAddToBack() {
		ListADT<String> testAddToBackList1 = new JavaList();
		testAddToBackList1.addBack("Hello");
		testAddToBackList1.addBack(" World");
		assertEquals(testAddToBackList1.getIndex(1), " World");
		ListADT<String> testAddToBackList = makeFullList();
		testAddToBackList.addBack("e");
		assertEquals(testAddToBackList.getIndex(4), "e");
		// Test for new list created
		/*
		 * ListADT<String> AddBackList0 = new JavaList<>(); // Test if Add to Back works
		 * for an list with 1 item AddBackList0.addBack("10"); int indexAB=
		 * AddBackList0.size()-1; Assert.assertEquals(AddBackList0.getBack(), "10");
		 * Assert.assertEquals(AddBackList0.getBack()!="10", false); ListADT <String>
		 * AddBackList1= AddBackList0; // Test for a list of size 2
		 * AddBackList1.addBack("11"); Assert.assertEquals(AddBackList1.getBack(),
		 * "11"); Assert.assertEquals(AddBackList1.getBack()!="11", false); ListADT
		 * <String> AddBackList2= AddBackList1; // Test for a list of size 10 for (int
		 * i=12; i<=20; i++) { AddBackList1.addBack(""+ i+""); } // Check if the value
		 * at the end is equal to 20 Assert.assertEquals(AddBackList1.getBack(), "20");
		 * Assert.assertEquals(AddBackList1.getBack().equals("20"), true);
		 * Assert.assertEquals(AddBackList1.getBack().equals("20")== true, true);
		 * Assert.assertEquals(AddBackList1.getBack().equals("20")== false, false); //
		 * Check if the value at the end is equal to 19
		 * Assert.assertEquals(AddBackList1.getBack().equals("19"), false);
		 * Assert.assertEquals(AddBackList1.getBack().equals("19")== false,true);
		 * Assert.assertEquals(AddBackList1.getBack().equals("19")== true, false);
		 */

	}

	// test list remove
	/*
	 * Test if removeIndex will fail to remove anything from an empty List
	 */
	@Test(expected = EmptyListError.class)
	public void testRemoveIndexEmpty() {
		ListADT<String> testRemoveIndexEmptyList = makeEmptyList();
		testRemoveIndexEmptyList.removeIndex(0);

	}

	/**
	 * Test if the remove index method works for single and longer lists
	 */
	@Test
	public void testRemoveIndex() {
		// Does Remove work for a list with 1 item?
		// Yes
		ListADT<String> testRemoveIndexList1 = new JavaList();
		testRemoveIndexList1.addIndex(0, "First Item");
		testRemoveIndexList1.removeIndex(0);
		assertEquals(testRemoveIndexList1.size(), 0);
		ListADT<String> testRemoveIndexList = makeFullList();
		assertEquals(testRemoveIndexList.removeIndex(0), "a");

		// Test for new list created
		/*
		 * ListADT<String> RemoveList0= new JavaList();
		 * Assert.assertEquals(RemoveList0.size(), 0); // DOes Remove work for two items
		 * List? ListADT<String> RemoveList1= new JavaList(); RemoveList1.addIndex(0,
		 * "Hi"); Assert.assertEquals(RemoveList1.getIndex(0), "Hi");
		 * Assert.assertEquals(RemoveList1.getIndex(0)=="Hi",true);
		 * Assert.assertEquals(RemoveList1.getIndex(0)=="Hi!", false); // Does Remove
		 * Work for a long List? ListADT<String> RemoveList=new JavaList();
		 * RemoveList.addIndex(0, "I"); RemoveList.addIndex(1, " ");
		 * RemoveList.addIndex(2, "am"); RemoveList.addIndex(3, " ");
		 * RemoveList.addIndex(4, "Happy"); RemoveList.addIndex(5, " ");
		 * RemoveList.addIndex(6, "To"); RemoveList.addIndex(7, " ");
		 * RemoveList.addIndex(8, "See"); RemoveList.addIndex(9, " ");
		 * RemoveList.addIndex(10, "Everyone"); RemoveList.addIndex(11, ".");
		 * RemoveList.addIndex(12, "Last"); int OriginSize= RemoveList.size(); // Create
		 * remove the last item in the list and see if the list size is smaller by 1 int
		 * NewSize; RemoveList.removeIndex(12); NewSize=RemoveList.size();
		 * Assert.assertEquals(OriginSize, NewSize+1); RemoveList.addIndex(0, "Happy");
		 * ack
		 */
	}

	/**
	 * Test if Remove from Back will Crash for Empty List as expected
	 */
	@Test(expected = EmptyListError.class)
	public void testRemoveBackEmpty() {
		ListADT<String> testRemoveBackEmptyList0 = makeEmptyList();
		testRemoveBackEmptyList0.removeBack();
	}

	/**
	 * Test if Remove from Back will work on a single list and/or a longer list
	 */
	@Test
	public void testRemoveBack() {
		// Check if remove back works for empty list
		ListADT<String> RemoveBackListEmpty1 = new JavaList();
		RemoveBackListEmpty1.addBack("e");
		assertEquals(RemoveBackListEmpty1.removeBack(), "e");
		ListADT<String> RemoveBackListEmpty = makeFullList();
		assertEquals(RemoveBackListEmpty.removeBack(), "d");

		/*
		 * // Check if REmove back works with 2 items ListADT<String>
		 * RemoveBackList0=new JavaList(); RemoveBackList0.addBack("0");
		 * RemoveBackList0.addBack("1"); RemoveBackList0.removeBack();
		 * Assert.assertEquals(RemoveBackList0.getBack().equals("0"), true); //Check if
		 * Remove Back works with 3 item ListADT<String> RemoveBackList1=
		 * RemoveBackList0; RemoveBackList1.addBack("2");
		 * Assert.assertEquals(RemoveBackList1.getBack().equals("2"),true); // Check if
		 * Remove Back works with longer lists ListADT<String> RemoveBackList=
		 * RemoveBackList1; for (int i=2; i<=10; i++) { RemoveBackList.addBack(""+i+"");
		 * } Assert.assertEquals(RemoveBackList.getBack().equals("10"),true);
		 */

	}

	/**
	 * Test if Remove Front can be used for an empty List
	 */
	@Test(expected = EmptyListError.class)
	public void testRemoveFrontEmpty() {
		ListADT<String> testRemoveFront0 = new JavaList();
		testRemoveFront0.removeFront();
	}

	/**
	 * Test if Remove Front can be used for a single list and/or longer list
	 */
	@Test
	public void testRemoveFront() {
		ListADT<String> testRemoveFront1 = new JavaList();
		testRemoveFront1.addFront("z");
		assertEquals(testRemoveFront1.removeFront(), "z");
		ListADT<String> testRemoveFront = makeFullList();
		assertEquals(testRemoveFront.removeFront(), "a");

		// The test with a created List
		/*
		 * ListADT<String> RemoveFrontList0=new JavaList();
		 * RemoveFrontList0.addFront("Apple"); RemoveFrontList0.addFront("Baseball");
		 * RemoveFrontList0.removeFront();
		 * Assert.assertEquals(RemoveFrontList0.getFront(), "Apple"); ListADT<String>
		 * RemoveFrontList1=RemoveFrontList0; RemoveFrontList1.addFront("Baseball");
		 * RemoveFrontList1.addFront("BreakPattern");
		 * Assert.assertEquals(RemoveFrontList0.removeFront(), "BreakPattern");
		 * RemoveFrontList0.removeFront();
		 * Assert.assertEquals(RemoveFrontList0.getFront(), "Apple"); ListADT<String>
		 * RemoveFrontList=RemoveFrontList1; ListADT <String> Items= new JavaList<>();
		 * Items.addFront("Baseball"); Items.addFront("Crayon"); Items.addFront("Down");
		 * Items.addFront("Elephant"); Items.addFront("Friday");
		 * Items.addFront("Graph"); for (String h:Items) { RemoveFrontList.addFront(h);
		 * } // Check that Baseball is the last in the list
		 * Assert.assertEquals(RemoveFrontList.removeFront(), "Baseball");
		 * RemoveFrontList1.removeFront();
		 * Assert.assertEquals(RemoveFrontList.getFront(), "Down");
		 */
	}

	/**
	 * Test the add Index List will actually add an item at the given index for an
	 * empty list
	 */
	@Test
	public void testAddIndexEmpty() {
		ListADT<String> addIndexList0 = new JavaList();
		addIndexList0.addIndex(0, "10");
		assertEquals(addIndexList0.getIndex(0), "10");
	}

	//  test addIndex methods.
	/**
	 * Test if add index works to add an item at a given index for single and longer
	 * lists
	 */
	@Test
	public void testAddIndex() {
		ListADT<String> addIndexList1 = new JavaList();
		addIndexList1.addIndex(0, "e");
		assertEquals(addIndexList1.getIndex(0), "e");
		ListADT<String> addIndexList = makeFullList();
		addIndexList.addIndex(4, "E");
		assertEquals(addIndexList.getIndex(4), "E");
	}

	@Test
	public void testGetFront() {
		ListADT<String> data = makeFullList();
		assertEquals("a", data.getFront());
	}

	@Test
	public void testGetBack() {
		ListADT<String> data = makeFullList();
		assertEquals("d", data.getBack());
	}

	@Test(expected = EmptyListError.class)
	public void testGetFrontCrash() {
		ListADT<String> data = makeEmptyList();
		data.getFront();
	}

	@Test(expected = EmptyListError.class)
	public void testGetBackCrash() {
		ListADT<String> data = makeEmptyList();
		data.getBack();
	}

	@Test(expected = BadIndexError.class)
	public void testGetIndexLow() {
		ListADT<String> data = makeFullList();
		data.getIndex(-2);
	}

	@Test(expected = BadIndexError.class)
	public void testGetIndexHigh() {
		ListADT<String> data = makeFullList();
		data.getIndex(data.size());
	}

	@Test(expected = BadIndexError.class)
	public void testGetIndexHighEasy() {
		ListADT<String> data = makeFullList();
		data.getIndex(data.size() * 2);
	}

	@Test(expected = BadIndexError.class)
	public void testAddIndexHighEasy() {
		ListADT<String> data = makeFullList();
		data.addIndex(data.size() * 2, "the");
	}

	@Test(expected = BadIndexError.class)
	public void testAddIndexHigh() {
		ListADT<String> data = makeFullList();
		data.addIndex(data.size() + 1, "the");
	}

	@Test(expected = BadIndexError.class)
	public void testAddIndexLow() {
		ListADT<String> data = makeFullList();
		data.addIndex(-1, "the");
	}

	/**
	 * Test if Set Index works for Empty Lists
	 */
	@Test(expected = EmptyListError.class)
	public void testSetIndexEmpty() {
		ListADT<String> testSetIndexEmptyList0 = new JavaList();
		testSetIndexEmptyList0.setIndex(0, "10");
	}

	/**
	 * Test if Set Index works for Single & Longer Sized Lists
	 */
	// write some tests for setIndex.
	@Test
	public void testSetIndex() {
		ListADT<String> setIndexList1 = makeEmptyList();
		setIndexList1.addIndex(0, "");
		setIndexList1.setIndex(0, "The");
		assertEquals(setIndexList1.getIndex(0), "The");
		ListADT<String> setIndexList = makeFullList();
		setIndexList.setIndex(0, "This");
		assertEquals(setIndexList.getIndex(0), "This");

	}

	@Test
	public void testToJava() {
		assertEquals(makeFullList().toJava(), Arrays.asList("a", "b", "c", "d"));
	}

	@Test
	public void testEquals() {
		assertEquals(makeFullList(), new JavaList<>(Arrays.asList("a", "b", "c", "d")));
	}

	@Test
	public void testEquals2() {
		assertEquals(makeFullList(), makeFullList());
	}
}
