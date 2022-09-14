

package week2.day1;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.manage().window().maximize();
		
		//Click duplicate Lead
		
		driver.findElement(By.id("username")).sendKeys("DemoCSR");
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
		
		driver.findElement(By.xpath("//input[@name='primaryPhoneCountryCode']")).sendKeys("91");
		driver.findElement(By.xpath("//input[@name='primaryPhoneNumber']")).sendKeys("9043668345");
		
		
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("aarthirajaganapathy@gmail.com");
		
		
		
	    driver.findElement(By.className("smallSubmit")).click();
	   // driver.findElement(By.className("subMenuButton")).click();
	  /*  driver.findElement(By.id("createLeadForm_companyName")).clear();
	    driver.findElement(By.id("createLeadForm_companyName")).sendKeys("HCL");
		driver.findElement(By.id("createLeadForm_firstName")).clear();
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Karthi");
	    driver.findElement(By.className("smallSubmit")).click();
          String title2 = driver.getTitle();
          System.out.println(title2);
          */
	    
          

	}

}
