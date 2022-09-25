package week4.asignment1;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Library {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://html.com/tags/table");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		List<WebElement> library = driver.findElements(By.xpath("//div[@class='render']/table"));
		for (int i = 0; i < library.size(); i++) {
			
			System.out.println(library.get(i).getText());
			
					}
		List<WebElement> rows = driver.findElements(By.xpath("//div[@class='render']/table//tr"));
		System.out.println("The Number of rows are " + " " + rows.size());

		
		List<WebElement> columns = driver.findElements(By.xpath("//div[@class='render']/table//tr/th"));
		System.out.println("The Number of columns are " + " " + columns.size());
		
		/*List<WebElement> text = driver.findElements(By.xpath("(//div[@class='render']/table//tr/td)[9]"));
		for (int j = 0; j < text.size(); j++) {
			
		
		System.out.println("The Printed text is " + " " + text.get(j).getText());
		
		}
*/	
	}

	}


