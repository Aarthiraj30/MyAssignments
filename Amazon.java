package week4.assignment2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//search as oneplus 9 pro 
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus 9 pro");
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		//Get the price of the first product
		String firstPrice = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[4]")).getText();
		System.out.println("The Mobile price" + " " + firstPrice);
		// Print the number of customer ratings for the first displayed product
		String noOfRating = driver.findElement(By.xpath("(//span[@class='a-size-base s-underline-text'])[1]")).getText();
		System.out.println("The Ratings are " + " " + noOfRating);
		
		// Mouse Hover on the stars
		WebElement stars = driver.findElement(By.xpath("(//a[contains(@class,'a-popover-trigger')])[2]/i"));
		Actions builder = new Actions(driver);
		builder.moveToElement(stars).perform();
		//Thread.sleep(3000);
		
		// Get the percentage of ratings for the 5 star.
		//String percentage = driver.findElement(By.xpath("(//span[contains(text(),'4.3 out of 5')])[1]")).getText();
		String percentage = driver.findElement(By.xpath(("(//div[@class='a-fixed-left-grid-col a-col-left'])[3]//table/tbody/tr[1]/td[3]//a"))).getText();
		System.out.println(percentage);
		// Click the first text link of the first image
		driver.findElement(By.xpath("(//span[contains(@class,'a-size-medium')])[4]")).click();
		// Take a screen shot of the product displayed
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> lstWindow1 = new ArrayList<String>(windowHandles);
		driver.switchTo().window(lstWindow1.get(1));
		File source = driver.getScreenshotAs(OutputType.FILE);
		File dest = new File(".d/snaps/screenshot.png");
		FileUtils.copyFile(source, dest);
		
		// Click 'Add to Cart' button
		driver.findElement(By.xpath("//span[text()='Add to Cart']"));

	}

}
