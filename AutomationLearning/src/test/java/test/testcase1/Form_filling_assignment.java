package test.testcase1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Form_filling_assignment {
    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/automation-practice-form");
        driver.findElement(By.id("firstName")).sendKeys("Himanshi");
        driver.findElement(By.id("lastName")).sendKeys("Rajput");
        driver.findElement(By.id("userEmail")).sendKeys("himanshi.rajput05@gmail.com");
        driver.findElement(By.id("userNumber")).sendKeys("9617403878");
        driver.quit();
    }
}
