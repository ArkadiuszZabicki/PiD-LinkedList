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

}
