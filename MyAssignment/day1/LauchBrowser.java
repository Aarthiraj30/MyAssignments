package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LauchBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// call the WDM for browser Driver
				WebDriverManager.chromedriver().setup();
        // launch the browser
				
				ChromeDriver driver = new ChromeDriver();
				
		// load the URL
		
		
				
				driver.get("http://leaftaps.com/opentaps/control/main");
				//driver.get("http://www.flipkart.com");
		
				driver.manage().window().maximize();
				
				driver.findElement(By.id("username")).sendKeys("demosalesmanager");
				driver.findElement(By.id("password")).sendKeys("crmsfa");
				driver.findElement(By.className("decorativeSubmit")).click();
				String text = driver.findElement(By.tagName("h2")).getText();
				System.out.println(text);
				String title = driver.getTitle();
				System.out.println(title);
				driver.findElement(By.linkText("CRM/SFA")).click();
				driver.findElement(By.linkText("Leads")).click();
				driver.findElement(By.linkText("Create Lead")).click();
				driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TeatLeaf");
				
								
				driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Aarthi");
				driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Rajaganapathy");
				
				driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Aarthi Raj");
				driver.findElement(By.name("lastNameLocal")).sendKeys("Bharani");
				driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Mrs");
				driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("M");
				driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("IT Department");
				driver.findElement(By.name("annualRevenue")).sendKeys("1000000");
				driver.findElement(By.name("numberEmployees")).sendKeys("100");
				
				
				driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("aarthirajaganapathy@gmail.com");
				
			    driver.findElement(By.className("smallSubmit")).click();
			    
					
				
				
				
				
				
				
	}

}
