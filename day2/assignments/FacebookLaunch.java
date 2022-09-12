package day2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookLaunch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		// Create new Button
		driver.findElement(By.xpath("//a[contains(text(),'Create New Account')]")).click();
		
		// First Name and Last Name
		//driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Aarthi");
		driver.findElement(By.name("firstname")).sendKeys("Aarthi");
		
		driver.findElement(By.name("lastname")).sendKeys("Rajaganapathy");
		
		// MobileNumber
		driver.findElement(By.name("reg_email__")).sendKeys("9043668345");
		//Password
		driver.findElement(By.id("password_step_input")).sendKeys("mithran@20");
		
		// BirthDay
		WebElement birthDay = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Select day = new Select(birthDay);
		day.selectByIndex(29);
		
		//Birth MOnth
		WebElement birthMonth = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		
		Select month = new Select(birthMonth);
		
		month.selectByIndex(7);
		
		//BirthYear
		
		WebElement birthYear = driver.findElement(By.xpath("//select[@name='birthday_year']"));
		
		Select year = new Select(birthYear);
		year.selectByVisibleText("1986");
		
		//gender
		
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		
		driver.findElement(By.name("websubmit")).click();
		
		
	}

}
