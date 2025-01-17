package selenium.selenuinid;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Namelogin {

	public static void main(String[] args) throws InterruptedException {
		String name = getusername();
		WebDriver driver= new ChromeDriver();
        
        driver.manage().window().maximize();
            
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        
        String password1 = getpassword(driver);
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.findElement(By.id("inputUsername")).sendKeys(name);
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(password1);
        driver.findElement(By.cssSelector(".submit ")).click();
        
        Thread.sleep(1000);
        System.out.print(driver.findElement(By.tagName("p")).getText());
         
        
    Assert.assertEquals((driver.findElement(By.tagName("p")).getText()), "You are successfully logged in.");
        
     System.out.println( driver.findElement(By.tagName("h2")).getText());
 
     Assert.assertEquals(( driver.findElement(By.tagName("h2")).getText()), "Hello " + name+",");
     
     Thread.sleep(5000);
     driver.findElement(By.xpath("//*[text()='Log Out']")).click();		
		
	}
	
	
	public static String getpassword (WebDriver driver) throws InterruptedException {
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
        
		driver.findElement(By.linkText("Forgot your password?")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
       
        //get the text 
        //driver.findElement(By.cssSelector("p.error")).getText();
		//Please use temporary password 'rahulshettyacademy' to Login.
        String passwordtext = driver.findElement(By.xpath("//p[@class='infoMsg']")).getText();
        
        Thread.sleep(2000);
        //Please use temporary password 'rahulshettyacademy' to Login.
            String[] passwordarray =   passwordtext.split("'");
              // System.out.println(passwordarray[0]);
              String password = (passwordarray[1]);
              return password;
              
              
        
	}

	
	public static String getusername ()
	{
		
		return "amit";
	}
	
}
