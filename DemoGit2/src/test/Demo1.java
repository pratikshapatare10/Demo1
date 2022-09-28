package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {
	
	

	public static void main(String[] args) {
		
		 Property_Reader p=new Property_Reader();
		System.out.println("Hello world...");
		
		System.setProperty(p.getChromeKey(),p.getChromePath());
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/text-box");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement curAddr=driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
		curAddr.sendKeys("Abc Pune");
		
	}
}
