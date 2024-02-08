package test.testcase1;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/");
        driver.manage().window().maximize();
        //driver.manage().window().setSize(new Dimension(1440, 900));
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/div[2]")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[2]/div/ul/li/span")).click();
        driver.findElement(By.id("firstName")).sendKeys("Abhishek");
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[1]/span/div")).click();

        driver.findElement(By.cssSelector("li#item-5")).click();
               //driver.get("https://demoqa.com/links");
       driver.findElement(By.linkText("Home")).click();

    }
}
