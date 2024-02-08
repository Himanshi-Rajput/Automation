package test.testcase1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class ActionsClass_Assignment3 {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");

        WebDriver driver = new ChromeDriver(options);

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(10 , TimeUnit.SECONDS);

        driver.get("https://demo.automationtesting.in/Slider.html");

        WebElement slider = driver.findElement(By.xpath("//*[@class=\"ui-slider-handle ui-state-default ui-corner-all\"]"));

        Actions act = new Actions(driver);

        act.dragAndDropBy(slider , 500 , 0).build().perform();

        System.out.println("End Game.");

        driver.quit();
    }
}
