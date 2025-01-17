package selenium.selenuinid;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Checkboxtest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver ();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(2000);
	
		Assert.assertFalse(driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).isSelected());
		
	
		driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();
		
		Assert.assertTrue(driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).isSelected());
		
		driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();
		
		System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());
	}
}