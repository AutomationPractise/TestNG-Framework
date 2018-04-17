package test;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Epic1 {


		// TODO Auto-generated method stub
	@AfterTest
	public void lastexecution()
	{
		System.out.println("Demonstrating @AfterTest Annotation");
		
	}
	@Test
	public void Epic1_TC1()
	{
		System.out.println("Epic1-TestCase1- To Demonstrate Listener works on failure of this method");//automation
		Assert.assertTrue(false);
	}
	@AfterSuite
	
	public void afSyite()
	{
		System.out.println(" Demonstrating AfterSuite Annotation");
	}
	@Test
	public void Epic1_TC2()
	{
		System.out.println("Epic1-TestCase2");
	}



}
