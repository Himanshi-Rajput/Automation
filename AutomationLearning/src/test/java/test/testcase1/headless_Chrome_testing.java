package test.testcase1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class headless_Chrome_testing {
    public static void main(String[] args) {

      /// I don't have firefox web driver in computer System.setProperty("webdriver.gecko.driver", "C://Users//HimanshiRajput//Desktop//Chromedriver//chromedriver-win32//chromedriver.exe");
        //ChromeOptions options = new ChromeOptions();
        //options.setHeadless(true); - Method is get deprecated.
        //options.addArguments("--headless=new"); // arguments vale will be changes with Chrome version
       // options.addArguments("--headless");
       // WebDriver driver = new ChromeDriver(options);
        FirefoxOptions options = new FirefoxOptions();
        options.addArguments("--headless");
        WebDriver driver = new FirefoxDriver(options);

        driver.get("https://demoqa.com/automation-practice-form");
        String original_title = driver.getTitle();

        System.out.println(" My Page got launched:- " + original_title);
        driver.quit();

    }
}
