package test.testcase1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.io.IOException;

public class ActionsClass_rightclick {

    public static void main(String[] args) throws InterruptedException, IOException, AWTException {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");

        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();

        ScreenRecording.startRecording();

        driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");

        Actions act = new Actions(driver);

        Thread.sleep(2000);

        WebElement copy = driver.findElement(By.xpath("//*[@class=\"context-menu-one btn btn-neutral\"]"));

        act.contextClick(copy).build().perform();

        Thread.sleep(1000);

        driver.findElement(By.xpath("//*[@class=\"context-menu-item context-menu-icon context-menu-icon-copy\"]")).click();

        String Alert_value = driver.switchTo().alert().getText();
        Thread.sleep(1000);
        System.out.println("Text inside the popup is:- "+Alert_value);

        driver.switchTo().alert().accept();

        Thread.sleep(1000);

        ScreenRecording.stopRecording();

        driver.quit();



    }
}
