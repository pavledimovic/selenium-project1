package test.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;



public class NewTest {
	
	WebDriver driver;
	
  @BeforeMethod
  public void BeforeMethod() {
	  System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\PC\\Desktop\\Testiranje\\Selenium\\Chromedriver\\chromedriver.exe");
      driver = new ChromeDriver();
      driver.get("https://www.rijksmuseum.nl/en");
      driver.manage().window().maximize(); 
  }
  @Test
  public void f() throws Throwable {
	  driver.findElement(By.name("gdprChoice")).click();      
      driver.findElement(By.className("mobp-hide")).click();
      Thread.sleep(3000);
      
      WebElement fb = driver.findElement(By.xpath("/html/body/div[5]/section/section[2]/div[2]/p/button"));
      fb.click();
      Thread.sleep(3000);
      
      WebElement logIn = driver.findElement(By.xpath("/html/body/div[5]/section/section[3]/div/section[2]/p/button"));
      logIn.click();
  }
  @AfterMethod
  public void AfterMethod() throws Throwable {
	  Thread.sleep(3000);
      driver.close();   
	  
  }
}
