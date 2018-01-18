import static org.junit.Assert.*;

import org.junit.Test;

public class HelloWorldTest {

	@Test
	public void testGetText() {
		
		assertEquals("Hello World",HelloWorld.getText());
	}

}
