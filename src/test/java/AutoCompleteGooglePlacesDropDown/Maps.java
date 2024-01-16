package AutoCompleteGooglePlacesDropDown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Maps {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//span[text()='Admin']")).click();
		Thread.sleep(3000);
		WebElement role= driver.findElement(By.xpath("(//div[text()='-- Select --'])[2]"));
		
		role.click();
		
		String text;
		do {
			role.sendKeys(Keys.ARROW_DOWN);
			text=role.getAttribute("role");
			if(text.equals("Enabled")) {
				role.sendKeys(Keys.ENTER);
				break;
				
			}
			Thread.sleep(3000);
		}while(!text.isEmpty());
		
	}
}
		
		
		
		/*
		 * driver.get("https://twoplugs.com/");
		 * driver.findElement(By.xpath("//a[text()='Live Posting']")).click();
		 * WebElement searchBox= driver.findElement(By.id("autocomplete"));
		 * searchBox.clear(); searchBox.sendKeys("Toronto"); String text; do {
		 * searchBox.sendKeys(Keys.ARROW_DOWN); text=searchBox.getAttribute("value");
		 * if(text.equals("Toronto, OH, USA")) { searchBox.sendKeys(Keys.ENTER); break;
		 * } Thread.sleep(3000); }while(!text.isEmpty());
		 */
		
	


