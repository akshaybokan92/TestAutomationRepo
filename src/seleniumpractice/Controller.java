package seleniumpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Controller {

    static{
        System.setProperty("webdriver.gecko.driver","./Driver/geckodriver.exe");
      //  System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
    }
    //static WebDriver driver = new ChromeDriver();

   static WebDriver driver = new FirefoxDriver();
}
