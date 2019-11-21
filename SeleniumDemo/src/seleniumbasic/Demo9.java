package seleniumbasic;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo9 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.youtube.com/");
	WebElement search =driver.findElement(By.id("search"));
	Thread.sleep(2000);
	search.sendKeys("ennodu nee erundaal",Keys.ENTER);
	Thread.sleep(2000);
	WebElement select =driver.findElement(By.className("style-scope yt-img-shadow"));
	select.sendKeys(Keys.ENTER);
}
}
