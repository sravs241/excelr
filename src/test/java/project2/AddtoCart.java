package project2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class AddtoCart {
	@Test
	public void addToCart() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://automationexercise.com/");
		driver.findElement(By.xpath("//ul[@class='nav navbar-nav']/li[2]")).click();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		//js.executeScript("arguments[0].setAttribute('attributeName', 'attributeValue');", element);
		Actions actions = new Actions(driver);
		 actions.moveToElement(driver.findElement(By.xpath("//div[@class='col-sm-9 padding-right']/div/div[2]/div"))).perform();
	    driver.findElement(By.xpath("//a[text()='Add to cart']")).click();
	    driver.findElement(By.xpath("//button[text()='Continue Shopping']")).click();
	    Thread.sleep(3000);
	    actions.moveToElement(driver.findElement(By.xpath("//div[@class='col-sm-9 padding-right']/div/div[3]/div"))).perform();
	    driver.findElement(By.xpath("(//a[text()='Add to cart'])[3]")).click();
	    driver.findElement(By.xpath("//u[text()='View Cart']")).click();
	
	
	}
	

}
