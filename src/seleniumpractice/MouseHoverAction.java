package seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

public class MouseHoverAction extends Controller {

    public static void main(String[] args) throws AWTException, InterruptedException {
        driver.manage().window().maximize();
    driver.get("https://www.google.co.in/");
    driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
        WebElement serachBox = driver.findElement(By.name("q"));
        serachBox.sendKeys("hds");
        Robot r = new Robot();
        r.keyPress(KeyEvent.VK_CONTROL);
        r.keyPress(KeyEvent.VK_A);
        Thread.sleep(2000);
        serachBox.clear();
        driver.close();



    }




}
