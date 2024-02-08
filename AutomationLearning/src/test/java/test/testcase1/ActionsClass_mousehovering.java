package test.testcase1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass_mousehovering {
    public static void main(String[] args) throws InterruptedException {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable--notifications");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();

        driver.get("https://www.browserstack.com/");

        WebElement product = driver.findElement(By.id("products-dd-toggle"));
        WebElement Web_testing = driver.findElement(By.id("products-dd-tab-1"));
        WebElement TM = driver.findElement(By.xpath("//*[@href=\"/test-management\"]"));


        Actions act = new Actions(driver);

        act.moveToElement(product).build().perform();
        Thread.sleep(5000);

        act.moveToElement(Web_testing).moveToElement(TM).click(TM).build().perform();
        Thread.sleep(8000);

        product = driver.findElement(By.id("products-dd-toggle"));
        WebElement App_testing = driver.findElement(By.id("products-dd-tab-2"));
        WebElement  App_Live = driver.findElement(By.xpath("//*[@href=\"/app-live\"]"));

        act.moveToElement(product).moveToElement(App_testing).click(App_Live).build().perform();

        System.out.println("I did it.......");

        driver.quit();
    }
}
