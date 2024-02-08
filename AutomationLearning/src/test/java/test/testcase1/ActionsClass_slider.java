package test.testcase1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass_slider {

    public static void main(String[] args) {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");

        WebDriver driver = new ChromeDriver(options);

        driver.manage().window().maximize();

        driver.get("https://jqueryui.com/slider/");

        driver.switchTo().frame(driver.findElement(By.xpath("//*[@class=\"demo-frame\"]")));

        Actions act = new Actions(driver);

        WebElement slid = driver.findElement(By.xpath("//*[@class=\"ui-slider-handle ui-corner-all ui-state-default\"]"));

        act.moveToElement(slid).dragAndDropBy(slid , 300 , 0).build().perform();

        driver.switchTo().defaultContent();

        driver.quit();

    }
}
