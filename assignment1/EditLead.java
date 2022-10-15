package week6.assignment1;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class EditLead extends ProjectSpecificMethod {
@Test(dataProvider = "edit")
	public void runEditLead(String phNo, String cName) throws InterruptedException {
		
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(phNo);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys(cName);
		driver.findElement(By.name("submitButton")).click();
		driver.close();
}
@DataProvider(name="edit")
public String[][] getdata(){
	String[][] data = new String[2][2];
	data [0][0] = "91";
	data [0][1] = "TestLeaf";
	data [1][0] = "98";
	data [1][1] = "HCL";
	return data;


}
}





