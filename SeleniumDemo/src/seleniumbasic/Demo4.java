package seleniumbasic;

import java.awt.RenderingHints.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo4 {
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://mail.google.com/mail/u/0/");
	WebElement email=driver.findElement(By.id("identifierId"));
	email.sendKeys("hitheshsalian90@gmail.com");
	
	WebElement next=driver.findElement(By.id("identifierNext"));
	next.click();
	Thread.sleep(2000);
	WebElement passwrd=driver.findElement(By.name("password"));
      passwrd.sendKeys("hithehhhh",Keys.ENTER);
      
      System.out.println(driver.getCurrentUrl());
      driver.close();
	

	
	
	}
}
