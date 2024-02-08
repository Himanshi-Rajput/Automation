package test.testcase1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebTableAssignment1 {
    public static void main(String[] args) throws InterruptedException {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");

        WebDriver driver = new ChromeDriver(options);

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();

        Thread.sleep(8000);

        driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin123");
        driver.findElement(By.xpath("//*[@type=\"submit\"]")).click();

        Thread.sleep(5000);

        driver.findElement(By.xpath("//*[@href=\"/web/index.php/pim/viewPimModule\"]")).click();

        Thread.sleep(5000);

        driver.findElement(By.xpath("//*[@class=\"oxd-icon bi-chevron-left\"]")).click();

        Thread.sleep(8000);

        int rows_count2 =0;

        do
        {
            int rows_count = driver.findElements(By.xpath("/html/body/div/div/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div")).size();

            int column_count = driver.findElements(By.xpath("/html/body/div/div/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div[1]/div/div")).size();


            System.out.println("Total number of rows are:- "+ rows_count);
            System.out.println("Total number of columns are:- "+column_count);

            for (int i=1; i<=rows_count ; i++)
            {
                for (int j = 1 ; j<= column_count ; j++)
                {
                    String value = driver.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div["+i+"]/div/div["+j+"]")).getText();
                    System.out.print(value);
                }
                System.out.println();
            }

            if (rows_count>50)
            {
                driver.findElement(By.className("oxd-pagination-page-item oxd-pagination-page-item--previous-next")).click();
                rows_count2 = driver.findElements(By.xpath("/html/body/div/div/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div")).size();
            }

        }
        while(rows_count2!=0);

        System.out.println("Code worked successfully");

        driver.quit();

    }
}
