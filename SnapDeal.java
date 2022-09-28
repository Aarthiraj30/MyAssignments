package week4.assignment2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import dev.failsafe.internal.util.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SnapDeal {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions ch = new ChromeOptions();
		ch.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();		
		// Launch https://www.snapdeal.com/
		driver.get("https://www.snapdeal.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Go to Mens Fashion
		WebElement mFashion = driver.findElement(By.xpath("(//span[contains(text(),'Fashion')])[1]"));
		Actions builder = new Actions(driver);
		builder.moveToElement(mFashion).perform();
		
		// Go to Sports Shoes
		driver.findElement(By.xpath("(//span[text()='Sports Shoes'])[1]")).click();
		
		// Get the count of the sports shoes
		String totalShoes = driver.findElement(By.xpath("//span[@class='category-name category-count']")).getText();
		System.out.println("The Total no of shoes displayed"+ " " + totalShoes);
		// Click Training shoes
		driver.findElement(By.xpath("//div[text()='Training Shoes']")).click();
		// Sort by Low to High
		WebElement click = driver.findElement(By.xpath("//span[@class='sort-label']"));
		driver.executeScript("arguments[0].click();",click);
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//li[contains(@class,'search-li')])[2]")).click();
		
		// Check if the items displayed are sorted correctly
		//String totalItems = driver.findElement(By.className("category-name category-count")).getText();
		//System.out.println("Total no of Items"+ " " + totalItems);
		List<Float> lst = new ArrayList<Float>();
		List<WebElement> pricesList = driver.findElements(By.xpath(("//span[@class='lfloat product-price']")));
		 		 System.out.println("the size is"+pricesList.size());
		 		 
		 		//for (int i = 0; i < pricesList.size(); i+1) {
		 			//System.out.println(pricesList.get(i).getText());
		 			 
		 			 for (int i = 0; i<pricesList.size(); i=i+1) {
		 		       lst.add(Float.parseFloat(pricesList.get(i).getText().replace("Rs.", "")));
		 		       System.out.println(lst);
		 		    }  
		 		    
				//}
		 				
				//for (WebElement p : pricesList) {
					//String text = p.getText();
					//System.out.println(text);
			//	}

			
		

	
}			
	
		
			
		
		//Select the price range (900-1200)
		//Filter with color Navy 
		// verify the all applied filters 
		// Mouse Hover on first resulting Training shoes
		// click QuickView button
		// Print the cost and the discount percentage
		//. Take the snapshot of the shoes.
		//. Close the current window
		//. Close the main window
	}
	

