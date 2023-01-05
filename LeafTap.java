package week2.day1;
//Assignment 1 Create lead

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LeafTap {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//click Login
		driver.findElement(By.className("decorativeSubmit")).click();
		//click Crm/sfa
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		//click Lead
		driver.findElement(By.linkText("Leads")).click();
		//Click create lead
		driver.findElement(By.linkText("Create Lead")).click();
		//Enter company name
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		//Enter First name
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Abirami");
		//Enter Last name
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Rajasekaran");
		
		//Drop down for source
		//select by visible text-->source drop down
		WebElement tool = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select drop=new Select(tool);
		drop.selectByVisibleText("Employee");
		
		//Drop down for MarketingCampaign
	    //select by value-->MarketingCampaign drop down
		WebElement tool1 = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select drop1=new Select(tool1);
		drop1.selectByValue("9001");
		
		//drop down for Ownership field
		//select by index-->Ownership field drop down
		WebElement tool2 = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select drop2=new Select(tool2);
		drop2.selectByIndex(5);
		
		//select by visible text-->Country field drop down
		WebElement tool3 = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
		Select drop3=new Select(tool3);
		drop3.selectByVisibleText("India");
		
		//click create lead
	    driver.findElement(By.className("smallSubmit")).click();
	    String title = driver.getTitle();
		System.out.println(title);
	    //To get the text
	    WebElement text = driver.findElement(By.id("viewLead_firstName_sp"));
		String text1 = text.getText();
		System.out.println(text1);
				
		
		
		
		//Close the browser
		//driver.close();
				

	}

}
