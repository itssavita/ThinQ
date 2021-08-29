package chrome_driver;

import java.awt.Toolkit;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class all_elemts 

{
	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","E:\\thinkQ\\chrome_driver\\chromedriver.exe");	
		WebDriver driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		
		
		List<WebElement> all_elements = driver.findElements(By.xpath("//*")); //label
		
		for(WebElement element:all_elements)
			System.out.println(element.getTagName()+" | "+element.getText()+" | "+element.getAttribute("innerHTML"));
		
		Toolkit.getDefaultToolkit().beep();
		System.out.println("End Of code");
	}
}
