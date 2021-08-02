package newpackage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locating_GUI_Elements {
	
	public static void main(String [] args )
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PRIYA\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe ");
		
		WebDriver driver = new ChromeDriver();
		String url = "https://en-gb.facebook.com/";
		
		String tagName = "";
		String className ="";
		
		
		
		driver.get(url);
		tagName= driver.findElement(By.id("email")).getTagName();
		className= driver.findElement(By.className("_8eso")).getText().toString();
		
		System.out.println("The Tage Name: " +tagName + " \n Class Name :" +className);
		
		

		driver.close();
		
		System.exit(0);
	}

}
