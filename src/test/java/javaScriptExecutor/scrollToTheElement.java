package javaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrollToTheElement {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.seleniumhq.org/download");
		driver.findElement(By.xpath("(//div[@id='modal-close'])[1]")).click();
		WebElement FAQ=driver.findElement(By.xpath("//div[@class='reference-title accordioncont']/p"));
		JavascriptExecutor jc=(JavascriptExecutor)driver;
		jc.executeScript("arguments[0].scrollIntoView(true)",FAQ);
		Thread.sleep(3000);
	}

}
