package com.dress;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DressBuyClass {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\D E L L\\SeleniumWorkSpace\\Base_Class\\Driver\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS); 
		driver.findElement(By.xpath("(//input[@name='email'])[1]")).sendKeys("rajraj123@gmail.com");
		driver.findElement(By.xpath("//input[@name='passwd']")).sendKeys("1234567");
		driver.findElement(By.xpath("(//button[@type='submit'])[3]")).click();
		driver.findElement(By.xpath("//a[text()='Women']")).click();
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1000);");
		
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(By.linkText("Faded Short Sleeve T-shirts"))).build().perform();
		act.click(driver.findElement(By.xpath("(//a[@title='Add to cart'])[1]"))).build().perform();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@title='Proceed to checkout']")).click();
		
		js.executeScript("window.scrollBy(0,1000);");
		
		driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]")).click();
		driver.findElement(By.xpath("//textarea[@name='message']")).sendKeys("This Website is usefull for girls. It have more then dress collection.its very attrative");
		driver.findElement(By.xpath("//button[@name='processAddress']")).click();
		driver.findElement(By.name("cgv")).click();
		driver.findElement(By.name("processCarrier")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[text()='(order processing will be longer)'])[1]")).click();
		driver.findElement(By.xpath("//button[@class='button btn btn-default button-medium']")).click();
	
		
		
	
	
		
		
		
		
		
		
		
		
		
		
	}

}
