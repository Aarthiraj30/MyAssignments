package week4.asignment1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StockMarket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.chittorgarh.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		// Click on Stock Market
		driver.findElement(By.xpath("(//a[@class='ch-bar-item ch-button'])[3]")).click();
		driver.findElement(By.xpath("//a[text()='NSE Bulk Deals']")).click();
		List<String> lst = new ArrayList<String>();
		List<WebElement> securityName = driver.findElements(By.xpath("//table[contains(@class,'table-bordered')]//tr/td[3]"));
		for (WebElement webElement : securityName) {
			String sNames = webElement.getText();
			System.out.println(sNames);
			
			for (WebElement webElement2 : securityName) {
				lst.add(sNames);
				
			}	
		}
			
			Set<String> dupSNames = new HashSet<String>(lst);
			
			if(dupSNames.size()==lst.size()) {
				System.out.println("There is No Duplicate");
			}
			else {
				System.out.println("Duplicate is Present");
			}
			
			
			
			
		}
		

	}


