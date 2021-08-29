package chrome_driver;

import java.awt.Toolkit;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class find_element 
{
	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","E:\\thinkQ\\chrome_driver\\chromedriver.exe");	
		WebDriver driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		System.out.println("list of link of the page");
		List<WebElement> all_links= driver.findElements(By.tagName("a"));
		
		for(WebElement element:all_links)
			System.out.println(element.getText());
		
		
		
		
		System.out.println("list of img");
		List<WebElement> imge= driver.findElements(By.tagName("img"));
		int j = imge.size();
		System.out.println("total img:"+j);
		for(WebElement element2:all_links)
			System.out.println(element2.getText()+" - "+element2.getAttribute("innerHTML"));
		
		Toolkit.getDefaultToolkit().beep();
		System.out.println("End Of code");
	}
}

