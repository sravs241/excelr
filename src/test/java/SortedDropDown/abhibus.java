package SortedDropDown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class abhibus {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://bing.com");
	driver.findElement(By.id("sb_form_q")).sendKeys("Selenium");
	List<WebElement> list=driver.findElements(By.xpath("//li[@class='sa_sg as_extra_pad']"));
	
	System.out.println("size of auto suggestions: "+list.size());
	
		for(WebElement options:list) {
		System.out.println(options.getText());
		
	}
		for(WebElement option:list) {
			
		if(option.getText().contains("selenium download")) {
			option.click();
			break;
		}
			
		}
	
}
}
