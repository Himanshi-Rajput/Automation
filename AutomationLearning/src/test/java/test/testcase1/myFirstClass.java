package test.testcase1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.concurrent.TimeUnit;



import java.awt.*;
import java.util.concurrent.TimeUnit;

public class myFirstClass {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C://Users//HimanshiRajput//Desktop//Chromedriver//chromedriver-win32//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        /*driver.get("https://www.makemytrip.com/");
        driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(10 , TimeUnit.SECONDS);
        driver.switchTo().frame("webklipper-publisher-widget-container-notification-frame");

        driver.findElement(By.xpath("//a[@id='webklipper-publisher-widget-container-notification-close-div']")).click();
        driver.switchTo().defaultContent();
        driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[1]/div[1]/ul/li[4]/div")).click();
        driver.findElement(By.name("username")).sendKeys("9617403878");
        driver.findElement(By.xpath("//*[@id=\"SW\"]/div[1]/div[2]/div[2]/div/section/form/div[2]/button/span")).click();

         */
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.name("user-name")).sendKeys("standard_user");
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("secret_sauce");
        driver.findElement(By.name("login-button")).click();
        String expected_title = "Swag Labs";
        String actual_title = driver.getTitle();
        if (actual_title.equals(expected_title))
        {
            System.out.println("Title is same:- "+ actual_title);
        }
        else
        {
            System.out.println("Title is not matching :- " + actual_title);
        }
        driver.quit();
    }
}
