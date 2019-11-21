package seleniumbasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo7 {
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.actitime.com/login.do");
	
	//gets title before login
	String title=driver.getTitle();
	System.out.println(title);//actiTIME - Login
	

	
	Thread.sleep(2000);
	
	WebElement name=driver.findElement(By.id("username"));
	name.sendKeys("admin");

	WebElement pass=driver.findElement(By.name("pwd"));
   pass.sendKeys("manager");
   
   Thread.sleep(2000);
   WebElement login=driver.findElement(By.id("loginButton"));
	login.click();
	
	//gets title after login
	Thread.sleep(4000);
	String title2=driver.getTitle();
	System.out.println(title2);     //actiTIME - Enter Time-Track
	
	//Thread.sleep(5000);
	
	driver.close();
	
	
	
	}
}
