package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Epic3 {
@BeforeClass
public void beforeclas()
{
	System.out.println("Demonstrating @BeforeClass - before executing any methods in the class Epic3");
}
@Parameters({ "URL","APIKey/usrname" })
	@Test
	public void Epic3_TC1(String urlname,String key)
	{
		
		System.out.println("Epic3-TestCase1- Passing parameters using xml");
		System.out.println(urlname);
		System.out.println(key);
		
	}
	@BeforeMethod
	public void beforeevery()
	{
		System.out.println("Demonstrating @BeforeMethod - I will execute before every test method in Epic 3 class");
	}
	
	@AfterMethod
	public void afterevery()
	{
		System.out.println(" Demonstrating @AfterMethod - I will execute after every test method in Epic 3 class");
	}
	@AfterClass
	public void afteclas()
	{
		System.out.println("Demonstrating @AfterClass - After executing all methods in the class Epic3");
	}
		
	@Test(groups={"Smoke"})
	public void Epic3_TC2()
	{

		System.out.println("Epic3-TestCase2- Also included in Smoke test group");
	}
	@BeforeSuite
	public void Bfsuite()
	{
		System.out.println("Demonstrating @BeforeSuite- Epic3 class");
	}
	@Test(enabled=true)
	public void Epic3_TC3()
	{
		
		System.out.println("Epic3-Test Case3- Demonstarting Enabled=true/false helper attribute");
	}
	@Test(dataProvider="getData")
	public void Epic3_TC4(String username,String password)
	{
	
		System.out.println("Epic3_Test Case4-Demonstrating Data Provider Helper attribute");
		System.out.println(username);
		System.out.println(password);
		
	}
	
	@Test(dependsOnMethods={"Epic3_TC3","Epic3_TC2"})
	public void AEpic3_TC5()
	{
		
		System.out.println("Epic3-TestCase5- Demonstrating dependsonMethods Helper Attribute-depending on TC2 and TC3");
	}
	@DataProvider
	public Object[][] getData()
	{
		//1st combiantion - username password - good credit history= row
		//2nd - username password  - no crdit history
		// 3rd - fraudelent credit history
		Object[][] data= new Object[3][2];
		//1st set 
		data[0][0]="firstsetusername";
		data[0][1]="firstpassword";
		//couloumns in the row are nothing but values for that particualar combination(row)
		
		//2nd set
		data[1][0]= "secondsetusername";
		data[1][1]= "secondpassword";
		
		//3rd set
		data[2][0]="thirdsetusername";
		data[2][1]="thirdpassword";
		return data;
		
		
		
	
		
		
		
		
	}
	
}
