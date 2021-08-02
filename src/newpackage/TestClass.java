package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {
	
	 public static void main(String[] args) {  
	        
		    // declaration and instantiation of objects/variables  
		    System.setProperty("webdriver.chrome.driver", "C:\\Users\\PRIYA\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");  
		    WebDriver driver=new ChromeDriver();  
		      
		// Launch website  
		    driver.navigate().to("http://www.google.com/");  
		    driver.manage().window().maximize();
		          
		    // Click on the search text box and send value  
		    driver.findElement(By.name("q")).sendKeys("javatpoint tutorials");  
		          
		    // Click on the search button  
		    driver.findElement(By.name("btnK")).click();  
		    
		    driver.close();
		     
		      
		    }  

}
