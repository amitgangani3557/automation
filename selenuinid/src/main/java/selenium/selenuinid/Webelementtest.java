package selenium.selenuinid;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Webelementtest {



		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			
			WebDriver driver = new ChromeDriver ();
			driver.get("https://rahulshettyacademy.com/angularpractice/");
			driver.findElement(By.name("name")).sendKeys("Amit gangani");
			driver.findElement(By.name("email")).sendKeys("amit@mailinator.com");
			driver.findElement(By.id("exampleInputPassword1")).sendKeys("123456");
			driver.findElement(By.id("exampleCheck1")).click();
			
			WebElement option = (driver.findElement(By.id("exampleFormControlSelect1")));
			
			Select dropdown = new Select (option);
			dropdown.selectByVisibleText("Female");
			
			driver.findElement(By.id("inlineRadio1")).click();
			driver.findElement(By.name("bday")).sendKeys("11111111");
			driver.findElement(By.cssSelector(".btn")).click();
			
			 System.out.print(driver.findElement(By.cssSelector(".alert.alert-success.alert-dismissible")).getText());
			
			
			
		
		
	}

}
