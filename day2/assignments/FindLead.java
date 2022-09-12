package day2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoCSR");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		
		/*String text = driver.findElement(By.tagName("h2")).getText();
		System.out.println(text);
		String title = driver.getTitle();
		System.out.println(title);
		*/
		
		driver.findElement(By.linkText("Leads")).click();
				driver.findElement(By.xpath("//a[contains(text(),'Find Leads')]")).click();

		driver.findElement(By.id("ext-gen248")).sendKeys("Aarthi");
		driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
		driver.findElement(By.xpath("//a[text()='15451']")).click();
		String title1 = driver.getTitle();
		System.out.println(title1);
		driver.findElement(By.className("subMenuButton")).click();
		driver.findElement(By.xpath("//input[@class='inputBox']")).clear();
		driver.findElement(By.xpath("//input[@class='inputBox']")).sendKeys("TCS");
		
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		
		
		
		
		//Thread.sleep(1000);thread error coming 
		
		
		
		driver.close();
		
		
		
		
		
	}

}
