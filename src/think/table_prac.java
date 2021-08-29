package chrome_driver;

import java.awt.Toolkit;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class table_prac 
{
	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","E:\\thinkQ\\chrome_driver\\chromedriver.exe");	
		WebDriver driver=new ChromeDriver();
		driver.get("https://money.rediff.com/index.html");
		
		WebElement tab = driver.findElement(By.xpath("//table[@id='allpage_links']"));
		List<WebElement> allrows = tab.findElements(By.tagName("tr"));
		System.out.println("total row : " + allrows.size());
		
		int i=0;
		for(WebElement ele : allrows)
		{
			List<WebElement> allcol =ele.findElements(By.tagName("td"));
			i++;
			System.out.println("number of cloumn : " + i + "row are: " +allcol.size());
			for(WebElement col2 : allcol)
			{
				System.out.println("|" + col2.getText());
			}
		}
		Toolkit.getDefaultToolkit().beep();
		System.out.println("End Of code");
		driver.close();
	}
}
