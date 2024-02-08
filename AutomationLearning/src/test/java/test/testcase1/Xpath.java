package test.testcase1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {
    public static void main(String[] args) {
        //Absolute Xpath
        //Relative Xpath
        //Xpath using AND and OR Operator -- not worked for me
        //Multiple Xpath using square brackets
        //Dynamic Xpath - Contains and starts-with method

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/automation-practice-form");
        WebElement e1 = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[1]/div[2]/input"));
        e1.sendKeys("Admin");
        driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Rajput");
        driver.findElement(By.xpath("//*[@class='custom-control-label'][@for='gender-radio-2']")).click();
        driver.findElement(By.xpath("//*[contains(@placeholder , 'Mobile')]")).sendKeys("9617403878");
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,200)");
        driver.findElement(By.xpath("//label[starts-with(@for , 'hobbies')]")).click();
     }
}
