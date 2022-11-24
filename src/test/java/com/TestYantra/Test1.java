package com.TestYantra;

import org.testng.annotations.Test;

public class Test1 {

	@Test(groups="Intregration")
	public void jenkin()
	{
		System.out.println("I am jenkins");
	}
	@Test(groups= "Smoke")
	public void java()
	{
		System.out.println("I am java");
	}
	@Test(groups="Smoke")
	public void manual()
	{
		System.out.println(" I am manual tester");
	}
}
