package javaScriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDownAndUp {
	public static void main(String args[]) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.seleniumhq.org/download");
		JavascriptExecutor jc=(JavascriptExecutor)driver;
		//jc.executeScript("window.scrollBy(0,500)");
		//Thread.sleep(3000);
		//jc.executeScript("window.scrollBy(0,-500)");
		for(int i=0;i<10;i++) {
			jc.executeScript("window.scrollBy(0,500)");	
			Thread.sleep(1000);
			}
		for(int i=10;i>0;i--) {
			jc.executeScript("window.scrollBy(0,-500)");
			Thread.sleep(1000);
		}
		
	}

}
