package test.testcase1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalCommand {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/automation-practice-form");
        driver.manage().window().maximize();
        WebElement email_field = driver.findElement(By.id("userEmail"));

        if (email_field.isDisplayed() && email_field.isEnabled())
            email_field.sendKeys("himanshirajput05@gmail.com");

       WebElement Female =  driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[3]/div[2]/div[2]/label"));
       WebElement male = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[3]/div[2]/div[1]/label"));

       if (Female.isSelected() == Female.isSelected())
           Female.click();
        driver.quit();
       }

}
