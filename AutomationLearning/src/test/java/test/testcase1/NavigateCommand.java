package test.testcase1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateCommand {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
         driver.get("https://demoqa.com/");
         driver.manage().window().maximize();
        System.out.println(" First page: "+ driver.getTitle());
        driver.navigate().to("https://www.facebook.com/" + driver.getTitle());
        System.out.println("Second Page: "+ driver.getTitle());
        driver.navigate().back();
        System.out.println("Third Page: "+ driver.getTitle());
        driver.navigate().forward();
        System.out.println("Fourth page: "+ driver.getTitle());
        driver.navigate().refresh();
        System.out.println("Done.");
        driver.close();


    }
}
