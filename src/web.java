import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;
//import org.openqa.selenium.SessionNotCreatedException;

public class web {
	
  @Test
  public static void main(String [] args) {
	  
	  System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	  ChromeOptions chromeOptions = new ChromeOptions();
//	  chromeOptions.addArguments("--headless");
	  chromeOptions.addArguments("--no-sandbox");
	  WebDriver driver = new ChromeDriver(chromeOptions);
	  
	  driver.get("http://3.86.196.123.154:8081");
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.findElement(By.id("About Us")).click();
	  String test = driver.findElement(By.id("PID-ab2-pg")).getText();
	  assertEquals(test,"This is about page. Lorem Ipsum Dipsum is simply dummy text of the printing and typesetting industry. "
	  		              + "Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer "
	  		              + "took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, "
	  		              + "but also the leap into electronic typesetting, remaining essentially unchanged. "
	  		              + "It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, "
	  		                 + "and more recently with desktop publishing "
	  		              + "software like Aldus PageMaker including versions of Lorem Ipsum.");
	  System.out.println("test succeeded");
	  driver.quit();
	  
	  
	  
  }
}
