package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LoginTests {
 //import selenium webDriver
    private WebDriver driver;
 //import chrome driver
 public void setUp()throws InterruptedException{
     System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
     driver = new ChromeDriver();
 //Get Project URL
 driver.get("https://github.com/login");
 //wait to load Project Page
     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 //Maximize Project page
 driver.manage().window().maximize();
 //Get Project Page Title
     System.out.println(driver.getTitle());
 //Locate username field
 driver.findElement(By.id("login_field")).sendKeys("MOUNTAINTESTER");
 //lOCATE PASSWORD FIELD
     driver.findElement(By.id("password")).sendKeys("Mountain12test");
     //locate sign in button and click
     driver.findElement(By.xpath("//*[@id=\"login\"]/form/div[4]/input[9]")).click();
  //wait
  Thread.sleep(10000);
  //close windows
     driver.quit();
 }
// Initiate
    public static void main(String args[]) throws InterruptedException {
     LoginTests tests = new LoginTests();
     tests.setUp();
    }
}
