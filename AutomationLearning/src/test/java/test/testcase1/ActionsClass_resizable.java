package test.testcase1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass_resizable {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://jqueryui.com/resizable/");

        driver.switchTo().frame(0);

        WebElement resize = driver.findElement(By.xpath("//*[@class=\"ui-resizable-handle ui-resizable-se ui-icon ui-icon-gripsmall-diagonal-se\"]"));

        Actions act = new Actions(driver);
        //The x offset is the horizontal movement and the y offset is the vertical movement.
        act.moveToElement(resize).dragAndDropBy(resize , 0, 100).build().perform();

        Thread.sleep(5000);

        driver.switchTo().defaultContent();

        System.out.println("Done....");

       driver.quit();

    }
}
