package demoProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class firsttest

{
	public static String browser = "Chrome";
	 public static WebDriver driver;

	 
	  @BeforeMethod
	    public void BrowsersetUp() 
	    {
	    	if (browser.equals("Chrome"))
	    	{
	    	driver=new ChromeDriver();	
	    	}
	    	
	    	else if(browser.equals("Firefox"))
	    	{
	    		driver=new FirefoxDriver();	
	    	}
	    }
	
	@Test
	public void tc1()
	{
		driver.get("https://www.youtube.com");		
		System.out.println(driver.getTitle());
	}
	
	@Test
	public void tc2()
	{
		driver.get("https://chatgpt.com/c/827733a6-96eb-4035-8b4a-47f7105b21cd");		
		System.out.println(driver.getTitle());
	}

	@AfterMethod
	
	public void tc3()
	{
			driver.quit();
	
	}
}
