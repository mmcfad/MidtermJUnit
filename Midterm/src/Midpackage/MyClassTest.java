package Midpackage;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyClassTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public final void testReturnTrue() {
	assertTrue("Return True", MyClass.ReturnTrue() );
	}
	
	@Test
	public final void testAddTwoNumbers(){
	assertEquals("Gonna Pass", 12, MyClass.AddTwoNumbers(3, 9));
	assertEquals("Gonna Pass", 6, MyClass.AddTwoNumbers(-3, 9));
	assertEquals("Gonna Pass", 0, MyClass.AddTwoNumbers(4, -4));
	assertEquals("Gonna Fail!!", 10, MyClass.AddTwoNumbers(2, 5));
	}


}
