package chrome_driver;

import java.awt.Toolkit;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class div_table 
{
	//div_nseindices
	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","E:\\thinkQ\\chrome_driver\\chromedriver.exe");	
		WebDriver driver=new ChromeDriver();
		driver.get("https://money.rediff.com/index.html");
		//input[id='username']
		
		//WebElement BSCIN = driver.findElement(By.cssSelector("input[id ='div_bseindices']"));
		WebElement BSCIN = driver.findElement(By.id("div_bseindices"));
		List<WebElement> links = BSCIN.findElements(By.tagName("li"));
		for (int i = 0; i < links.size(); i++)
		{
			    System.out.println(links.get(i).getText());
		}
		
		
		//div_secto_tabs
		System.out.println("*************************************************");
		
		WebElement sect = driver.findElement(By.cssSelector(".div_secto_tabs"));
		List<WebElement> links2 = sect.findElements(By.tagName("//a"));
		for (int i = 0; i < links2.size(); i++)
		{
			    System.out.println(links2.get(i).getText());
		}
		
		//WebElement webElement = driver.findElement(By.cssSelector("index-content"));
		//webElement.getText();*/
		
		Toolkit.getDefaultToolkit().beep();
		System.out.println("End Of code");
		driver.close();
	}

}
