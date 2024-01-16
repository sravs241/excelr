package practice;

import java.time.Duration;
import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class makeMyTrip {
	@org.testng.annotations.Test
	public void makeMyTriplocation() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.makemytrip.com/");
		//WebElement iframeElement = driver.findElement(By.id("webklipper-publisher-widget-container-notification-frame")); // Locate the iframe element
		driver.switchTo().frame(driver.findElement(By.id("webklipper-publisher-widget-container-notification-frame"))); // Switch to the iframe using the WebElement
		// Perform operations inside the iframe
		// When you're done, switch back to the main content
		//driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//a[@class='close']")).click();
		driver.findElement(By.xpath("//span[text()='From']")).click();
		driver.findElement(By.xpath("//input[@placeholder='From']")).click();
		List<WebElement> cities= driver.findElements(By.xpath("//div[@role='listbox']/div/ul/li"));
		System.out.println("Number of cities: "+cities.size());
		for(int i=0;i<cities.size();i++) {
			System.out.println(cities.get(i).getText());
		}
		
		for(WebElement city:cities) {
			if(city.getText().contains("Pune")) {
				city.click();
				break;
			
			}
		}
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[@for='toCity']")).click();
		List<WebElement> cities1= driver.findElements(By.xpath("//div[@role='listbox']/div/ul/li"));
		System.out.println("Number of cities: "+cities1.size());
		for(int i=0;i<cities1.size();i++) {
			System.out.println(cities1.get(i).getText());
		}
		
		for(WebElement city:cities1) {
			if(city.getText().contains("Hyderabad")) {
				city.click();
				break;
			
			}
		}
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[@for='departure']")).click();
			
		}

	

}
