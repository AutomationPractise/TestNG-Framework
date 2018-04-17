package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Epic2 {

	
	@Test(groups={"Smoke"})
	public void Epic2_TC1()
	{
		System.out.println("Epic2-TestCase1 and Smoke Test as well");
	}
	
	@BeforeTest
	public void prerequiste()
	{
		System.out.println("Demonstrating BeforeTest Annotation in Epic 2");
	}
}
