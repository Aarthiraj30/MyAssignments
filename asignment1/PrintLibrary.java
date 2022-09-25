package week4.asignment1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PrintLibrary {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://html.com/tags/table");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		
		
		List<WebElement> print = driver.findElements(By.xpath("//div[@class='render']/table//tr[2]/td"));
		
		for (int i = 0; i < print.size(); i++) {
			
			System.out.println(print.get(i).getText());
			
		}
	}

}
