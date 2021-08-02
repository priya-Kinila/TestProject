package newpackage;
import org.openqa.selenium.By;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switch_btw_windows {

	public static void main(String []args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PRIYA\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url ="http://demo.guru99.com/selenium/deprecated.html";
		
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.switchTo().frame("classFrame");
		driver.findElement(By.linkText("Tree")).click();
		driver.close();
		
	}
}
