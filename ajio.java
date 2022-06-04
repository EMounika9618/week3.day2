package week3.Day2;

import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import io.github.bonigarcia.wdm.WebDriverManager;


public class ajio 
{
	public static void main(String[] args) throws InterruptedException 
	{

	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	//1. Launch ajio.com/
	driver.get("https://www.ajio.com/");
	Thread.sleep(3000);
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath("//div/input[contains(@class,'react-autosuggest__input')]")).sendKeys("Bags",Keys.ENTER);
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[@class='facet-linkhead']//label)[2]")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("(//label[contains(@class,'facet-linkname facet-linkname-l1l3nestedcategory')])[2]")).click();
	Thread.sleep(5000);
	String count = driver.findElement(By.xpath("//div[@class=\"length\"]")).getText();
	System.out.println("Total Count of the Bag is "+ count);
	List<WebElement> brands = driver.findElements(By.className("brand"));
	System.out.println(brands.size());
	for(int i=0; i<brands.size(); i++) {
		System.out.println(brands.get(i).getText());
	}
	System.out.println("Bag Name Lists ");
	List<WebElement> bgname = driver.findElements(By.className("nameCls"));
	System.out.println(bgname.size());
	for(int i=0; i<bgname.size(); i++) {
		System.out.println(bgname.get(i).getText());
		
	}
	
	

}

}
