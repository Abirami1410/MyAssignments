package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {
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
		//Enter First name(local)
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Abi");
		//Enter Department
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Information Technology");
		//Enter Description
		driver.findElement(By.id("createLeadForm_description")).sendKeys("one lead is created");
		//Enter Email
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("abikalmity@gmail.com");
		//click on create Lead
		driver.findElement(By.className("smallSubmit")).click();
		//Get title
		String title = driver.getTitle();
		System.out.println(title);
		//Click on Duplicate button
		driver.findElement(By.className("subMenuButton")).click();
		//Clear company name 
		driver.findElement(By.id("createLeadForm_companyName")).clear();
		//Enter New company name
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Amazon");
		//Clear First name
		driver.findElement(By.id("createLeadForm_firstName")).clear();
		//Enter New First name
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Aiswarya");
		//click on create Lead
		driver.findElement(By.className("smallSubmit")).click();
		String title1 = driver.getTitle();
		System.out.println(title1);
	}

}
