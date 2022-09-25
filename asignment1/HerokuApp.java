package week4.asignment1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HerokuApp {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://testleaf.herokuapp.com/pages/table.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElements(By.xpath("//table[@cellspacing='0']"));
		
		List<WebElement> rows = driver.findElements(By.xpath("//table[@cellspacing='0']//tr"));
		System.out.println("The row size is " + " " + rows.size());
		
		List<WebElement> columns = driver.findElements(By.xpath("//table[@cellspacing='0']//tr/th"));
		System.out.println("The column size is  "+ " " + columns.size());
		
		List<WebElement> lst = driver.findElements(By.xpath("//table[@cellspacing='0']//tr[3]/td[2]"));
		for (int i = 0; i < lst.size(); i++) {
			System.out.println("The progress value of learn to interact with Elements" + " " +lst.get(i).getText());
			
			
		}
		

	}

}
