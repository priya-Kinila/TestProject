package newpackage;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Facebook_Login {
	
	public static void main(String [] args)
	{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications"); //to disable the pop-ups
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PRIYA\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe ");
		
		WebDriver driver = new ChromeDriver(options);
	    
		WebDriverWait wait = new WebDriverWait(driver,5); 
		try
		{
		String url= "https://en-gb.facebook.com/";
		String Emai_address = "peyakinila@gmail.com";
		String Password = "4779priya1993";
		
		
		
		
		driver.get(url);
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys(Emai_address);
		driver.findElement(By.id("pass")).sendKeys(Password);
		driver.findElement(By.name("login")).click();
		
		try
		{
		// Explicit wait
		 wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div[aria-label='Account']")));	
		
		
		WebElement navigate = driver.findElement(By.cssSelector("div[aria-label='Account']"));
		
	    navigate.click();
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='b20td4e0 muag1w35']/div[4]/div")));
		
		driver.findElement(By.xpath("//div[@class='aov4n071']/div/a")).click();
		
		//Log Out Explicit Wait
		
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div[aria-label='Account']")));	
		
		navigate.click();
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='b20td4e0 muag1w35']/div[4]/div")));
		
		WebElement logout =driver.findElement(By.xpath("//div[@class='b20td4e0 muag1w35']/div[4]/div"));
		
		
		if(logout.isEnabled() && logout.isDisplayed())
		{
			logout.click();
		
		 System.out.println("Logged out succesfully..!!");
		 
		}
		
		else
		{
			System.out.println("Couldnot logout");
			
		}
		
		}
		catch(NoSuchElementException ex)
		{
			System.out.println(ex.toString());
		}
		}
		catch(TimeoutException toe)
		{
			System.out.println(toe.toString());
		}
		driver.close();
		System.exit(0);
		
	}

}
