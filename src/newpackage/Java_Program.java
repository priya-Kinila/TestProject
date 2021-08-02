package newpackage;
import org.openqa.selenium.WebDriver; //contain Webdriver class need to instantiate a new browser
import org.openqa.selenium.chrome.ChromeDriver; //contain chrome diver class need to instantiate a new chrome browser

public class Java_Program {
	
	public static void main(String[]args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PRIYA\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		
		//Driver Object instantiated
		
		WebDriver driver = new ChromeDriver();
		String url ="http://demo.guru99.com/test/newtours/";
		String Expected_Result = "Welcome: Mercury Tour";
		String Actual_Result = "";
		
		driver.get(url);
		Actual_Result = driver.getTitle();
		
		 //Comparison Part
		
		if(Expected_Result.equalsIgnoreCase(Actual_Result))
		{
			System.out.println("Test Pass\n Actual Result : "+Actual_Result +"\n Expected_Result : "+ Expected_Result);
			
		}
		else
		{
			System.out.println("Test Fail \n Actual Result : "+Actual_Result +"\n Expected_Result : "+ Expected_Result);
		}
	
		// close the browser Window
		driver.close();
		
		//whole java program will end
		System.exit(0);
		
				
	}

}
