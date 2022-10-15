package week6.assignment1;


import java.io.IOException;

import org.openqa.selenium.By;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import testcase.ProjectSpecificMethod;


public class CreateLead extends ProjectSpecificMethod{
	@Test(dataProvider ="create" )
	public void runCreateLead(String cname,String fname,String lname,String phnum) {
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cname);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(phnum);
		driver.findElement(By.name("submitButton")).click();
		
}
	@DataProvider(name="create")
	public String[][] getdata() throws IOException  {
		String[][] readData = ReadExcel1.readData();
		return readData;
		
}
}





