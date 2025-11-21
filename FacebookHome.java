package week2.remainingAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookHome {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://en-gb.facebook.com/");
	driver.manage().window().maximize();
	
	driver.findElement(By.partialLinkText("Create new account")).click();
	//first name
	driver.findElement(By.name("firstname")).sendKeys("Tamizharasi");
	//sur name
	driver.findElement(By.name("lastname")).sendKeys("Vasudevan");
	//email/mobile
	driver.findElement(By.name("reg_email__")).sendKeys("tamil@gmail.com");
	//enter pwd
	driver.findElement(By.name("reg_passwd__")).sendKeys("12345");
	
	//date of birth
	WebElement selectDate = driver.findElement(By.id("day"));
	Select selectdate = new Select(selectDate);
	selectdate.selectByVisibleText("13");
	
	//month
	WebElement selectMonth = driver.findElement(By.id("month"));
	Select selectmonth = new Select(selectMonth);
	selectmonth.selectByIndex(0);
	
	//year
	WebElement selectYear = driver.findElement(By.id("year"));
	Select selectyear = new Select(selectYear);
	selectyear.selectByVisibleText("2000");
	
	//radio button
	driver.findElement(By.xpath("//input[@id='sex']")).click();
	
	Thread.sleep(3000);
	
	driver.close();
}
}
