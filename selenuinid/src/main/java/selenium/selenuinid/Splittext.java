package selenium.selenuinid;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Splittext {

	public static void main(String[] args) throws InterruptedException {
		//WebDriver driver = new ChromeDriver();

		
		String namelist = "amit, Sanjay, Narendra";
		String[] names = namelist.split(",");
		
		
		
		
		
		
		// 0 - amit
		//1 - sanjay
		// 2 - naredra
		             String studentname  = (names[0]);
		            //String studentname1  = (names[1]);
		            // String studentname2  = (names[2]);
		
		            System.out.print(studentname);
		             //System.out.print(studentname1);
		             //System.out.print(studentname2);
        
	}

}
