package selenium.selenuinid;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Checkbox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver ();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		//Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
		
		//System.out.print(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
		//driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).click();
		//System.out.print(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
		
		//System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		
		//click check box
		//apply asset for validate output
		
		
		Assert.assertFalse(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());
		
		
		System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());
		driver.findElement(By.name("ctl00$mainContent$chk_friendsandfamily")).click();
		System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());

		//count of check boxes in the screen
		
		System.out.println (driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		
		
		// check disable 
		
		System.out.println(driver.findElement(By.id("Div1")).getDomAttribute("style"));
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
	
		System.out.println(driver.findElement(By.id("Div1")).getDomAttribute("style"));
		
		if (driver.findElement(By.id("Div1")).getDomAttribute("style").contains("0"))
				{
			 System.out.println("its enable");
			 Assert.assertTrue(true);
			 
				}
		else 
		{
			//System.out.println("its disable");
			Assert.assertTrue(true);
		}
		
		
	
		
		
		
	}

}
