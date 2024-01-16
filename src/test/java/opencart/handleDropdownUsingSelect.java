package opencart;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

public class handleDropdownUsingSelect {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.rediff.com/");
		WebElement createAcc= driver.findElement(By.xpath("//a[text()='Create Account']"));
		System.out.println("Create Account title: "+driver.getTitle());
		createAcc.click();
		//WebElement signin=driver.findElement(By.xpath("//a[text()='Sign in']"));
    	//System.out.println(signin.getAttribute("title"));
		WebElement countrydropdown= driver.findElement(By.id("country"));
		Select country=new Select(countrydropdown);
		
		//country.selectByVisibleText("Argentina");
		//country.selectByIndex(9);//Aruba
		//country.selectByValue("9");
    	List<WebElement> alloptions=country.getOptions();
    	for(WebElement option: alloptions) {
    		if(option.getText().equals("Cuba")) {
    			option.click();
    			break;
    		}
    	}
    	
	}

}
