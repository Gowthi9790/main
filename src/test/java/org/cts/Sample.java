package org.cts;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Sample {
	@BeforeClass
	public static void beforeClass() {
	// TODO Auto-generated method stub
System.out.println("beforeClass");
}
	@AfterClass
	public static void afterClass() {
		// TODO Auto-generated method stub
		System.out.println("afterClass");
		}
	@Before
	public void beforeMethod() {
		// TODO Auto-generated method stub
		System.out.println("beforeMethod");
	}
	@After
	public void afterMethod() {
		// TODO Auto-generated method stub
		System.out.println("afterMethod");
	}
	@Test
	public void test1() {
		// TODO Auto-generated method stub
		System.out.println("test1");
		
	}
}
