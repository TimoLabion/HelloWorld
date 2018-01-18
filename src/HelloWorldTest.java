
import static org.junit.Assert.*;

import org.junit.Test;

import de.code.HelloWorld;

public class HelloWorldTest {

	@Test
	public void testGetText() {
		
		assertEquals("Hello World",HelloWorld.getText());
	}
	
	@Test
	public void testAddition() {
		HelloWorld hw = new  HelloWorld();
		assertEquals(6, HelloWorld.addition(3, 3));
	}

}
