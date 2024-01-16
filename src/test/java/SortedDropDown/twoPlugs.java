package SortedDropDown;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class twoPlugs {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://twoplugs.com/");
	driver.findElement(By.xpath("//a[text()='Live Posting']")).click(); 
	WebElement drpElement=driver.findElement(By.name("category_id"));
	Select drpSelect=new Select(drpElement);
	List<WebElement> options=drpSelect .getOptions();
	ArrayList originallists=new ArrayList();
	ArrayList templist=new ArrayList();
	
	for(WebElement option:options)
	{
		originallists.add(option.getText());
		templist.add(option.getText());
	}
	System.out.println("Original list: "+originallists);
	System.out.println("Temporary list: "+templist);
	Collections.sort(templist);
	
	System.out.println("Original list: "+originallists);
	System.out.println("Temporary list After sorting: "+templist);
	
	if(originallists.equals(templist))
	{
		System.out.println("DropDown Sorted");
	}
	System.out.println("DropDown Unsorted");
	driver.close();
}
}
