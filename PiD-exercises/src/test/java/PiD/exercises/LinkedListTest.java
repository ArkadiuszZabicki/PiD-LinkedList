package PiD.exercises;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;


public class LinkedListTest {
	
	@Test
	
	public void testGetOnEmptyList() {
		LinkedList list = new LinkedList();
		boolean success = false;
		try {
			list.get(0);
			fail("Should have thrown exception");
		} catch (IndexOutOfBoundsException e) {
			success = true;
		}
		
		assertEquals(true, success);
	}
	
	@Test
	
	public void testGetOnListWithNode() {
		LinkedList list = new LinkedList();
		list.add(2);
		list.add(8);
		list.add(1);
		
		assertEquals(2, list.get(0));
		assertEquals(1, list.get(2));
		assertEquals(8, list.get(1));
	}

}
