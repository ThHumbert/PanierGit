import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;


public class OrangeTest {

	Orange o1,o2,o3,o4;
	
	@Before
	public void init() {
		o1 = new Orange("France", 0.5);
		o2 = new Orange("France", 1.5);
		o3 = new Orange("Espagne", 0.8);
		o4 = new Orange("France", 0.5);
	}
	
	@Test
	public void testCons() {
		
	}
	
	@Test
	public void testToString() {
		//o1 = new Orange("France", 0.5);
		
		assertEquals("Origine : France prix : 0.5\n", o1.toString());
	}
	
	@Test
	public void testEquals() {
		assertTrue(o1.equals(o4));
		assertFalse(o1.equals(o2));
		assertFalse(o1.equals(o3));
	}
	
}
