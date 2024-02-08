package test.testcase1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;

public class WebtableHandling2 {
    public static void main(String[] args) throws InterruptedException {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(8000);
        driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin123");
        driver.findElement(By.cssSelector("button")).click();
        Thread.sleep(8000);
        driver.findElement(By.xpath("//*[@class=\"oxd-main-menu-item\"]")).click();
        Thread.sleep(8000);
        driver.findElement(By.xpath("//*[@class=\"oxd-icon bi-chevron-left\"]")).click();
        int row_size =  driver.findElements(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div")).size();
        System.out.println("Total number of rows are:- "+row_size);
        int column_size = driver.findElements(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div[1]/div/div")).size();
        System.out.println("Total number of columns are:- "+column_size);

       // Thread.sleep(1000);
        int count=0;

        for (int i=1 ; i<=row_size ; i++)
        {
           String Status =  driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div["+i+"]/div/div[5]")).getText();
           if(Status.equals("Enabled"))
           {
               count++;
           }
        }

        System.out.println("Total no. of enabled employees are:- "+ count);


    }
}
