package com.oocl.mnlbc.TestCase;

import junit.framework.TestCase;

public class AppTest2 extends TestCase {

	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	
	public void testAdd(){
		 App app= new App();
		 assertEquals (2, app.add(1,1));
	
	}

}
