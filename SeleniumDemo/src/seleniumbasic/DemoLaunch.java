package seleniumbasic;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class DemoLaunch {
public static void main(String[] args) throws InterruptedException{
	System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
   //driver.get("https://www.facebook.com/");
   

/*Thread.sleep(5000);
driver.navigate().back();
Thread.sleep(5000);
driver.navigate().forward();
Thread.sleep(5000);
driver.navigate().refresh();


//driver.close();
driver.navigate().to("https://www.facebook.com/");
*/


driver.get("https://www.google.co.in/");
//String title=driver.getTitle();
//System.out.println(title);
System.out.println(driver.getCurrentUrl());



	driver.get("https://www.naukri.com/");
String parent	=driver.getWindowHandle();//accessing the parent handle,it returns string
System.out.println(parent);
Thread.sleep(2000);
 Set<String> family=driver.getWindowHandles();//accessing the handle of parent and child
 Thread.sleep(2000);
 //family.remove(parent);//parent is removed from family
 
 
 ArrayList <String> al=new ArrayList<>(family);
 System.out.println(al.size());
 
 for(int i=al.size()-1;i>=0;i--)
 {
	 System.out.println(al.get(i));
	 //System.out.println(fam);
	 //Thread.sleep(2000);
	 driver.switchTo().window(al.get(i)).close();
	 
	 
	 
	  
 }

		 

	
	
	
	
	/*driver.quit();
	//String title=driver.getTitle();
	//System.out.println(title);
	System.out.println(driver.getCurrentUrl());*/







}
}
