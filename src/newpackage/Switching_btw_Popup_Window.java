package newpackage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Switching_btw_Popup_Window {
	
	public static void main(String [] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PRIYA\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		String url ="http://jsbin.com/usidix/1";
		String alretMessage="";
		
		driver.get(url);
		
		driver.findElement(By.cssSelector("input[type=\"button\"]")).click();
		
		alretMessage= driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		
		System.out.println("this is the alert Message: "+alretMessage);
		driver.quit();
		
		
	}

}
