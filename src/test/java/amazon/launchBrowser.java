package amazon;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class launchBrowser {
	public static void main(String[] args) throws InterruptedException
	{
	Scanner sc = new Scanner(System.in);

	System.out.println("Enter brower Name:");
	String browser = sc.nextLine();
	WebDriver driver = null;
	if(browser.equalsIgnoreCase("Firefox"))
	{
	

	driver = new FirefoxDriver();
	}
	else
	if(browser.equalsIgnoreCase("Chrome"))
	{
	
	driver = new ChromeDriver();
	}
	else
	{
	System.out.println("Invalid browser");
	}
	Thread.sleep(2000);
	driver.get("https://www.amazon.in");
	}
}
