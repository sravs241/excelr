package jqueryscript;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class jquerydropdown {
	WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		driver.findElement(By.xpath("//input[@id='justAnInputBox']")).click();
		
		
		
		
		Thread.sleep(3000);
		driver.close();
		
	}
	/*
	public static void selectChoiceValues(WebDriver driver, String... value) {
		List<WebElement> choicelist= driver.findElements(By.xpath("//span[@class='comboTreeItemTitle']"));
		if(!value[0].equalsIgnoreCase("all")) {
			for(WebElement item:choicelist) {
				String text=item.getText();
				for(String val:value)
					{
					if(text.e)}
					}
		}
		*/
		
}
