package week2.remainingAssignments;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.support.ui.Select;


public class CreateAccount {

	public static void main(String[] args) throws InterruptedException {
		//ChromeDriver driver = new ChromeDriver();
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		WebElement uname = driver.findElement(By.name("USERNAME"));
		uname.sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
				
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.partialLinkText("Create Account")).click();
		
		WebElement accountname = driver.findElement(By.id("accountName"));
		accountname.sendKeys("Tamizharasi13");
		
		String accName = driver.findElement(By.id("accountName")).getAttribute("value");
		
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		
		WebElement selectIndustry = driver.findElement(By.name("industryEnumId"));
		Select selectind = new Select(selectIndustry);
		selectind.selectByIndex(2);
		
		WebElement selectOwnership = driver.findElement(By.name("ownershipEnumId"));
		Select selectowner = new Select(selectOwnership);
		selectowner.selectByVisibleText("S-Corporation");
		
		WebElement selectSource = driver.findElement(By.id("dataSourceId"));
		Select selectsource = new Select(selectSource);
		selectsource.selectByValue("LEAD_EMPLOYEE");
		
		WebElement selectMarketingCampaign = driver.findElement(By.id("marketingCampaignId"));
		Select selectmarketcampaign = new Select(selectMarketingCampaign);
		selectmarketcampaign.selectByIndex(6);
		
		WebElement selectState = driver.findElement(By.name("generalStateProvinceGeoId"));
		Select selectstate = new Select(selectState);
		selectstate.selectByValue("TX");
		
		driver.findElement(By.className("smallSubmit")).click(); 
		
		WebElement retrieveText = driver.findElement(By.xpath("//span[contains(text(),'Tami')]"));
		
		
		String retrieveName = retrieveText.getText();
		
		if (retrieveName.contains(accName))
		{
			System.out.println("Account Name is displayed correctly: " + accName);
		}
		else
		{
			System.out.println("Account Name is not displayed correctly");
		}
		Thread.sleep(3000);
		
		driver.close();
	}

}
