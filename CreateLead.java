package week2.remainingAssignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class CreateLead {

	public static void main(String[] args) throws InterruptedException {
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		WebElement uname = driver.findElement(By.name("USERNAME"));
		uname.sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
				
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Create Lead")).click();
		
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Tamil");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Arasi");
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("FreshWorks");
		driver.findElement(By.xpath("//input[@id='createLeadForm_generalProfTitle']")).sendKeys("Ms");
		
		driver.findElement(By.className("smallSubmit")).click();
		String title = driver.getTitle();
		//System.out.println(title);
		if(title.contains("View Lead"))
		{
			System.out.println("User is on the correct page : " + title);
		}
		else
		{
			System.out.println("User is navigated to incorrect page");
		}
		
		Thread.sleep(3000);
		driver.close();
	}

}
