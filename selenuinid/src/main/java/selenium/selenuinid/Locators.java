package selenium.selenuinid;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Locators
{
	
	

	public static void main(String[] args) throws InterruptedException 
   
	
		// TODO Auto-generated method stub

		 { 
		
		
		        WebDriver driver= new ChromeDriver();
		        
		        driver.manage().window().maximize();
		            
		        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		        
		        driver.get("https://rahulshettyacademy.com/locatorspractice/");
		        
		        driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys("rhaul");
		        driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("rhaul");
		        driver.findElement(By.cssSelector("button.signInBtn")).click();
		        String text=driver.findElement(By.cssSelector("p.error")).getText();
		        System.out.println(text);
		        
		        driver.findElement(By.linkText("Forgot your password?")).click();
		        Thread.sleep(1000);
		        driver.findElement(By.xpath("//form/input [1]")).sendKeys("test");
		        driver.findElement(By.cssSelector("form input:nth-child(3)")).sendKeys("test");
		        driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("9874563254");
		        driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		        
		        System.out.println (driver.findElement(By.cssSelector(".infoMsg")).getText());
		        
		        
		 }
}
