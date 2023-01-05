package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownLeafGround {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//Lord the Url
		driver.get("https://www.leafground.com/select.xhtml;jsessionid=node09hyg1tigvp9617sf3zunaz76k27448.node0");
		//find the element
		WebElement tool=driver.findElement(By.className("ui-selectonemenu"));
		//To Handle drop down
	    Select drop=new Select(tool);
	    //Select by Index
	    drop.selectByIndex(1);
	    tool.click();
	    //Select By value
	    drop.selectByValue("ui-selectonemenu-label");
	    tool.click();
	    drop.selectByVisibleText("Playwright");
	    
	}

}
