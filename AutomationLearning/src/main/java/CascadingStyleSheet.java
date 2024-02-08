package test.testcase1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CascadingStyleSheet {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //driver.get("https://demoqa.com/links");
        //CSS- TAG with ID --- working for me
        //driver.findElement(By.cssSelector("a#simpleLink")).click();

        // CSS - TAG with Class - but it is not taking in my case.
       // driver.get("https://demoqa.com/automation-practice-form");
        //driver.findElement(By.cssSelector("input.mr-sm-2 form-control")).sendKeys("HimanshiRajput@gmail.com");

        //CSS - TAG with Attribute -- working for me
        //driver.get("https://demoqa.com/automation-practice-form");
        //driver.findElement(By.cssSelector("input[class=\"mr-sm-2 form-control\"]")).sendKeys("HimanshiRajput@gmail.com");

        //CSS- TAG. Class & Attribute - not working for me

        //CSS - Inner Text -- not working for me and don't know where to use

        driver.get("https://demoqa.com/automation-practice-form");
        System.out.println(driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[3]/div[1]")).getText());


    }

}
