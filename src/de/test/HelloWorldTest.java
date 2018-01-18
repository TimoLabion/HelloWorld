package de.test;
import static org.junit.Assert.*;

import org.junit.Test;

import de.code.HelloWorld;

public class HelloWorldTest {

	@Test
	public void testGetText() {
		
		assertEquals("Hello World",HelloWorld.getText());
	}

}
