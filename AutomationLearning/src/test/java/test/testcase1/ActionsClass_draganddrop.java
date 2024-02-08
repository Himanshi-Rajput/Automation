package test.testcase1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass_draganddrop {

    public static void main(String[] args) {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");

        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();

        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html#google_vignette");

        WebElement source1 = driver.findElement(By.id("box6"));
        WebElement target1 = driver.findElement(By.id("box106"));

        Actions act = new Actions(driver);
        act.clickAndHold(source1).moveToElement(target1).release().build().perform();

        WebElement source2 = driver.findElement(By.id("box7"));
        WebElement target2 = driver.findElement(By.id("box107"));

        act.dragAndDrop(source2,target2).build().perform();

        WebElement source3 = driver.findElement(By.id("box1"));
        WebElement target3 = driver.findElement(By.id("box101"));

        act.clickAndHold(source3).moveToElement(target3).release().build().perform();

        WebElement source4 = driver.findElement(By.id("box2"));
        WebElement target4 = driver.findElement(By.id("box102"));

        act.dragAndDrop(source4,target4).build().perform();

        WebElement source5 = driver.findElement(By.id("box5"));
        WebElement target5 = driver.findElement(By.id("box105"));

        act.clickAndHold(source5).moveToElement(target5).release().build().perform();

        WebElement source6 = driver.findElement(By.id("box3"));
        WebElement target6 = driver.findElement(By.id("box103"));

        act.dragAndDrop(source6, target6).build().perform();

        WebElement source7 = driver.findElement(By.id("box4"));
        WebElement target7 = driver.findElement(By.id("box104"));

        act.clickAndHold(source7).moveToElement(target7).release().build().perform();

        System.out.println("We played Game and we won.........");

        driver.quit();
    }
}
