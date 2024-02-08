package test.testcase1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebTableHandling1 {

    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");

        WebDriver driver = new ChromeDriver(options);
        driver.get("https://cosmocode.io/automation-practice-webtable/");
        driver.manage().window().maximize();
       int row_size =  driver.findElements(By.xpath("/html/body/div[2]/div/div[1]/main/article/div/div/table/tbody/tr")).size();


       int column_size = driver.findElements(By.xpath("/html/body/div[2]/div/div/main/article/div/div/table/tbody/tr[1]/td")).size();

       for (int i = 1 ; i<= row_size ; i++)
       {
           for (int j= 1; j<=column_size ; j++)
           {
               String value = driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/main/article/div/div/table/tbody/tr["+i+"]/td["+j+"]")).getText();
               System.out.print("  "+ value);
           }
           System.out.println();

       }
       driver.quit();

    }
}
