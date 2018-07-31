package seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class FirefoxSetting extends Controller {

    public static void main(String[] args) {
        FirefoxProfile profile = new FirefoxProfile();
        String key = "browser.helperapp. neverAsk. saveToDisk";
        String value = "application/zip";
        profile.setPreference(key,value);
        FirefoxOptions options = new FirefoxOptions();
        options.setProfile(profile);
        WebDriver driver = new FirefoxDriver(options);
        driver.get("");
        driver.findElement(By.xpath("//ul//li/a[text()='Download']")).click();
        driver.findElement(By.xpath("//td[text()='Java']/ . . /td/a[text()='Download']")).click();
        driver.close();

    }
}
