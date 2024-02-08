package test.testcase1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.awt.event.KeyEvent;

public class RobotClass {
    public static void main(String[] args) throws AWTException, InterruptedException {

        //These keys are not working for me..........
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demo.automationtesting.in/FileDownload.html");

        Robot robot = new Robot();

        //robot.keyPress(KeyEvent.VK_DOWN);

        driver.findElement(By.id("textbox")).sendKeys("Hi Man......");

        Thread.sleep(5000);

        robot.keyPress(KeyEvent.VK_TAB);


        Thread.sleep(5000);

        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyPress(KeyEvent.VK_ENTER);

        Thread.sleep(5000);

        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyPress(KeyEvent.VK_TAB);


        Thread.sleep(5000);

        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyPress(KeyEvent.VK_ENTER);


        Thread.sleep(10000);

        System.out.println("Reached here");

        driver.quit();
    }
}
