package chrome_driver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class google_action
{
	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","E:\\thinkQ\\chrome_driver\\chromedriver.exe");	
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		Actions act = new Actions(driver);
		
		WebElement txtbox = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
		act.moveToElement(txtbox).click().keyDown(Keys.SHIFT).sendKeys("Where is indore").build().perform();
		//act.moveToElement(txtbox).click().keyDown(Keys.LEFT).sendKeys("hello").build().perform();
		
		act.contextClick(txtbox).build().perform();
		Thread.sleep(2000);
		
		
		
		System.out.println("End Of code");
		driver.close();
	}
}


