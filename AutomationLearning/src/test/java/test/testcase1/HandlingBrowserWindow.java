package test.testcase1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.Set;

public class HandlingBrowserWindow {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://demo.automationtesting.in/Windows.html");
       String First_session =  driver.getWindowHandle();
       driver.findElement(By.xpath("//*[@class=\"analystic\"]")).click();
       driver.findElement(By.linkText("click")).click();
        System.out.println(driver.getTitle());
        Set<String> windows_id = driver.getWindowHandles();


        for (String windows_id2: windows_id)
        {
            String title =  driver.switchTo().window(windows_id2).getTitle();
            System.out.println("The page title of "+windows_id2+ " window id is "+ title);
            if(title.contains("Selenium"))
            {
                driver.close();
            }

        }
        driver.switchTo().window(First_session);

        System.out.println("Window count"+ driver.getWindowHandles().size());


        driver.findElement(By.xpath("//*[@href=\"#Seperate\"]")).click();
        driver.findElement(By.xpath("//*[@onclick=\"newwindow()\"]")).click();

        Set<String> windows_id2 = driver.getWindowHandles();

        for (String windows_id3: windows_id2)
        {
            String title =  driver.switchTo().window(windows_id3).getTitle();
            System.out.println("The page title of "+windows_id3+ " window id is "+ title);
            if(title.contains("Selenium"))
            {
                driver.close();
            }
        }
        driver.switchTo().window(First_session);

        driver.findElement(By.linkText("Open Seperate Multiple Windows")).click();
        driver.findElement(By.xpath("//button[@onclick=\"multiwindow()\"]")).click();

        Set<String> windows_id3 = driver.getWindowHandles();

        for (String windows_id4: windows_id3)
        {
            String title =  driver.switchTo().window(windows_id4).getTitle();
            System.out.println("The page title of "+windows_id4+ " window id is "+ title);
            if(title.contains("Selenium"))
            {
                driver.close();
            }
            else if (title.equals("Index"))
            {
                driver.close();
            }
        }
    }
}
