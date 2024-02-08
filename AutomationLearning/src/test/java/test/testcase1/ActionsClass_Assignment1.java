package test.testcase1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class ActionsClass_Assignment1 {

    public static void main(String[] args) throws InterruptedException {
        ChromeOptions options = new ChromeOptions();

        options.addArguments("--disable-notifications");

        WebDriver driver = new ChromeDriver(options);

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(30 , TimeUnit.SECONDS);

        driver.get("https://www.flipkart.com/");

        driver.findElement(By.className("_30XB9F")).click();

        WebElement fashion = driver.findElement(By.xpath("//*[@class=\"_27h2j1\"]"));

        Actions act = new Actions(driver);

        act.moveToElement(fashion).build().perform();

        WebElement WE = driver.findElement(By.linkText("Women Ethnic"));

        act.moveToElement(WE).build().perform();

        WebElement Saree = driver.findElement(By.linkText("Women Sarees"));

        act.moveToElement(Saree).click(Saree).build().perform();

        Thread.sleep(3000);

        System.out.println("I did it....");
        driver.quit();





    }
}
