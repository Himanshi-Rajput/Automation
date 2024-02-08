package test.testcase1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AlertWindows {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://demo.automationtesting.in/Alerts.html");
        driver.findElement(By.linkText("Alert with OK")).click();
        driver.findElement(By.xpath("//*[@onclick=\"alertbox()\"]")).click();
        System.out.println("First Alert Box text: "+ driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();
        driver.findElement(By.linkText("Alert with OK & Cancel")).click();
        driver.findElement(By.xpath("//*[@onclick=\"confirmbox()\"]")).click();
        System.out.println("Second Alert Box text : "+ driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();
        String Actual_text1 = "You pressed Ok";
        String expected_text1 = driver.findElement(By.id("demo")).getText();
        if(Actual_text1.equals(expected_text1))
        {
            System.out.println("Test1 is passed." + expected_text1);
        }
        driver.findElement(By.xpath("//*[@onclick=\"confirmbox()\"]")).click();
        System.out.println("Second Alert Box text : "+ driver.switchTo().alert().getText());
        driver.switchTo().alert().dismiss();
        String Actual_text2 = "You Pressed Cancel";
        String expected_text2 = driver.findElement(By.id("demo")).getText();
        if(Actual_text2.equals(expected_text2))
        {
            System.out.println("Test2 is passed." + expected_text2);
        }
        driver.findElement(By.linkText("Alert with Textbox")).click();
        driver.findElement(By.xpath("//*[@class=\"btn btn-info\"]")).click();
        System.out.println("Third Alert Box text : "+ driver.switchTo().alert().getText());
        driver.switchTo().alert().sendKeys("Hi!! Himanshi");
        driver.switchTo().alert().accept();
        String Actual_text3 =  "Hello Hi!! Himanshi How are you today";
        String expected_text3 = driver.findElement(By.id("demo1")).getText();
        if(Actual_text3.equals(expected_text3))
        {
            System.out.println("Test3 is passed." + expected_text3);
        }
        driver.findElement(By.xpath("//*[@class=\"btn btn-info\"]")).click();
        System.out.println("Third Alert Box text : "+ driver.switchTo().alert().getText());
        driver.switchTo().alert().dismiss();
        String expected_text4 = driver.findElement(By.id("demo1")).getText();
        if(expected_text4.isEmpty())
        {
            System.out.println("Test4 is passed." + expected_text4);
        }

        System.out.println();
        System.out.println("All Done. Very Good.");
    }
}
