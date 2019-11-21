package seleniumbasic;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo5 {
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	
	WebElement search=driver.findElement(By.name("q"));
	search.sendKeys("marvel",Keys.ENTER);
	Thread.sleep(3000);
	
	WebElement clear= driver.findElement(By.name("q"));
	clear.clear();
	
	Thread.sleep(3000);
	
	//WebElement search2=driver.findElement(By.name("q"));
	clear.sendKeys("wonderwoman",Keys.ENTER);
	Thread.sleep(2000);
	driver.navigate().back();
	driver.close();
	
	
	
	
	
	//Thread.sleep(2000);
	search.click();
	

}
}