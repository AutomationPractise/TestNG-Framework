package test;


import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Epic4 {

	@Parameters({ "URL" })
	@Test
	public void Epic4_TC1(String uname)
	{
	
		System.out.println("Epic4_TC1-Parameter URL using xml");
		System.out.println(uname);
		
	}
	
	
	@Test(groups={"Smoke"})
	public void Epic4_TC2()
	{
		
		System.out.println("Epic4_TC2- included in Smoke test group");
	}
	
	@Test
	public void Epic4_TC3()
	{
		
		System.out.println("Epic4_TC3");
	}
}
