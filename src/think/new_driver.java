package chrome_driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class new_driver 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","E:\\\\thinkQ\\\\chrome_driver\\chromedriver.exe");	
		WebDriver driver=new ChromeDriver();
		driver.get("http://register.rediff.com/register/register.php?FormName=user_details");
		
		WebElement fullname = driver.findElement(By.xpath("//input[starts-with(@name,'name')]"));
		fullname.sendKeys("Savita Yadav");
		
		WebElement login = driver.findElement(By.xpath("//input[starts-with(@name,'login')]"));
		login.sendKeys("Savita1234");
		
		WebElement pass = driver.findElement(By.xpath("//input[starts-with(@name,'passwd')]"));
		pass.sendKeys("savi1234");
		
		WebElement repass = driver.findElement(By.xpath("//input[starts-with(@name,'confirm_passwd')]"));
		repass.sendKeys("savi1234");
		
		WebElement altpass = driver.findElement(By.xpath("//input[starts-with(@name,'altemail')]"));
		altpass.sendKeys("mine1234");
		
		WebElement monum = driver.findElement(By.xpath("//input[starts-with(@name,'mobno')]"));
		monum.sendKeys("0123456789");
		
		WebElement gen = driver.findElement(By.xpath("//input[starts-with(@name,'gender') and @value='f']"));
		gen.sendKeys("Female");
		
	
		System.out.println("E N D");
	}
}
