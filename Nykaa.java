package week4.assignment2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Nykaa {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.nykaa.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		 //Mouseover on Brands and Search L'Oreal Paris
		 WebElement brands = driver.findElement(By.xpath("//a[text()='brands']"));
		 Actions builder = new Actions(driver);
		 builder.moveToElement(brands).perform();
		 driver.findElement(By.id("brandSearchBox")).sendKeys("L'Oreal paris");
		 		 
		 // Click L'Oreal Paris
		 driver.findElement(By.linkText("L'Oreal Paris")).click();
		 // Check the title contains L'Oreal Paris(Hint-GetTitle)
		 System.out.println(driver.getTitle());
		 
		 // Click Category and click Hair->Click haircare->Shampoo
		 driver.findElement(By.xpath("//span[text()='Hair Care']")).click();
		 
		// Click sort By and select customer top rated
		 WebElement click = driver.findElement(By.xpath("//button[@class=' css-n0ptfk']"));
		 driver.executeScript("arguments[0].click();", click);
		 driver.findElement(By.xpath("//span[text()='customer top rated']")).click();
		 
		 // Click->Concern->Color Protection
		 	driver.findElement(By.xpath("//span[text()='Concern']")).click();
		 	driver.findElement(By.xpath("//span[text()='Color Protection']")).click();
		 	
		 
		 //check whether the Filter is applied with Shampoo
		 	String filter = driver.findElement(By.xpath("//span[@class='name']")).getText();
		 	System.out.println(filter);
		 	
		 // Click on L'Oreal Paris Colour Protect Shampoo
		 	driver.findElement(By.xpath("(//div[@class='css-xrzmfa'])[1]")).click();
		 	
		 // GO to the new window and select size as 175ml
		 	String parent = driver.getWindowHandle();
		 	Set<String> windowHandles = driver.getWindowHandles();
		 	System.out.println("How many windows are open" + " " + windowHandles.size());
		 	List<String> lstWindow = new ArrayList<String>(windowHandles);
		 	driver.switchTo().window(lstWindow.get(1));
		 	WebElement click1 = driver.findElement(By.xpath("//select[@class='css-2t5nwu']"));
		 	driver.executeScript("arguments[0].click();", click1);
		 	driver.findElement(By.xpath("//option[text()='175ml']")).click();
		 	
		 // Print the MRP of the product
		 	String mrp = driver.findElement(By.xpath("(//span[@class='css-1jczs19'])[1]")).getText();
		 	System.out.println("The MRP of Shampoo is" + " " + mrp);
		 // Click on ADD to BAG
		 	driver.findElement(By.xpath("//span[text()='Add to Bag']")).click();
		 // Go to Shopping Bag 
		 	driver.findElement(By.xpath("//div[@class='css-0 e1ewpqpu1']")).click();
		 // Print the Grand Total amount
		 	driver.switchTo().frame(0);
		 	WebElement grandTotal = driver.findElement(By.xpath(("(//div[@class='value'])[4]")));
		 	//System.out.println("the grand total amount is"+ " "+ grandTotal.getText());
		 	String total = grandTotal.getText();
		 	System.out.println("the grand total amount is"+ " "+ total);
		 	
		 // Click Proceed
		 	driver.findElement(By.xpath("//span[text()='Proceed']")).click();
		 	
		 // Click on Continue as Guest
		 	driver.findElement(By.xpath("//button[text()='CONTINUE AS GUEST']")).click();
		 	
		 // Check if this grand total is the same in step 14
		 	WebElement grandTotalFinal = driver.findElement(By.xpath("//span[text()='259']"));
		 	//System.out.println("The Final Grand Total is"+ " "+ grandTotalFinal.getText());
		 	String total1 = grandTotalFinal.getText();
		 	System.out.println("The Final Grand Total is"+ " "+ total1);
		 	if(total.equals(total1)) {
		 		System.out.println("Both are Equal");
		 	}
		 	else {
		 		System.out.println("Not Equal ");
		 	}
		 // Close all windows
	}

}
