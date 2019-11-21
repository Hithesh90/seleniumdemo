package seleniumbasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3 {
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	
	
	WebElement email=driver.findElement(By.id("email"));
	email.sendKeys("rock");
	
	WebElement pass=driver.findElement(By.id("pass"));
	pass.sendKeys("star");
	
	
	WebElement click=driver.findElement(By.id("loginbutton"));
	click.click();
	
	}
}
