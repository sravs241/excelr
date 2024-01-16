package StepDefination;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class MakeMyTripPlanning {
	WebDriver driver;
	
	@Test
	@Given("I want to launch the Url")
	public void i_want_to_launch_the_url() {
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.makemytrip.com/");
	}
    @Test
	@When("selecting the source and destination")
	public void selecting_the_source_and_destination() {
		driver.switchTo().frame(driver.findElement(By.id("webklipper-publisher-widget-container-notification-frame"))); // Switch to the iframe using the WebElement
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
	}

	/*
	 * @When("selecting the date") public void selecting_the_date() {
	 * 
	 * }
	 * 
	 * @When("clicking the search") public void clicking_the_search() { // Write
	 * code here that turns the phrase above into concrete actions throw new
	 * io.cucumber.java.PendingException(); }
	 */

}
