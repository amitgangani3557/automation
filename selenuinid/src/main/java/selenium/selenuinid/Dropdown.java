package selenium.selenuinid;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver ();
		/* driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		//handle select dropdown static dropdown
		
		
		WebElement dd =  driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		
		Select dropdown = new Select(dd);
		dropdown.selectByVisibleText("AED");
		System.out.print(dropdown.getFirstSelectedOption().getText());
		
		
		  driver.findElement(By.id("divpaxinfo")).click();
		  Thread.sleep(2000);
		  
	       int i=1;
		  while (i<4)
		  {
		  
		  driver.findElement(By.id("hrefIncAdt")).click();
		 
	       i++;
		  }
		  
		for(int i=1;i<4;i++) 
		{
			  
			driver.findElement(By.id("hrefIncAdt")).click();
		  }
		
		driver.findElement(By.id("btnclosepaxoption")).click();
		
*/
		
		
		
		
		
		
		
		
		// dynamic dropdown handle
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//a[@value= 'ATQ'] ")).click();
		
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='AIP']")).click();
		
		Thread.sleep(2000);
		//driver.findElement(By.xpath("(//a[@value= 'AMD'])[2] ")).click();
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='BHO']")).click();
		
		
		
		//calender date pick
		
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-active")).click();
		
		
		//check disable value by attribute
		
		//System.out.print(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());
		
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		
		//System.out.print(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());
		
		driver.findElement(By.id("Div1")).getDomAttribute("style").contains("display: block; opacity: 0.5;");
		
		
		
		
		
		
		
		
	}

}
