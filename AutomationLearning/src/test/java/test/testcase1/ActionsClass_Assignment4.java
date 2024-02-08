package test.testcase1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class ActionsClass_Assignment4 {
    public static void main(String[] args) throws IOException, InterruptedException {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");

        WebDriver driver = new ChromeDriver(options);

        driver.manage().window().maximize();



        Thread.sleep(2000);

        driver.manage().timeouts().implicitlyWait(20 , TimeUnit.SECONDS);

        driver.get("https://strml.github.io/react-resizable/examples/1.html");

        WebElement Box1 = driver.findElement(By.xpath("//*[@data-reactid=\".0.0.1\"]"));
        WebElement Box2 = driver.findElement(By.xpath("//*[@data-reactid=\".0.1.1\"]"));
        WebElement Box3 = driver.findElement(By.xpath("//*[@data-reactid=\".0.2.1\"]"));
        WebElement Box4 = driver.findElement(By.xpath("//*[@data-reactid=\".0.3.1\"]"));
        WebElement hover = driver.findElement(By.xpath("//*[@class=\"box box3\"]"));

        Actions act = new Actions(driver);

        JavascriptExecutor jse = (JavascriptExecutor)driver;

        jse.executeScript("window.scrollBy(0 , 300)");

        act.dragAndDropBy(Box1, 300 , 300).build().perform();

        Thread.sleep(2000);


        jse.executeScript("window.scrollBy(0 , 500)");

        act.dragAndDropBy(Box2, 25 , 25).build().perform();
        Thread.sleep(2000);

        jse.executeScript("window.scrollBy(0 , 500)");

        act.dragAndDropBy(Box3 , -50 , -50).build().perform();
        Thread.sleep(2000);


        jse.executeScript("window.scrollBy(0 , 1000)");

        act.moveToElement(hover).dragAndDropBy(Box4 , 100 , 20).build().perform();

        System.out.println("The END.....");

        Thread.sleep(2000);


        driver.quit();




    }
}
