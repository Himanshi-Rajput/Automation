package test.testcase1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getcommand {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demoqa.com/automation-practice-form");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        //String text = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/h5")).getText();
        //String text = driver.findElement(By.id("firstName")).getAttribute("placeholder");
        String text = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[1]/div[2]/input")).getAttribute("placeholder"); //attribute inside name will be varies as per your ask like innerText or textContent or value
        System.out.println(text);
        driver.quit();
    }
}
