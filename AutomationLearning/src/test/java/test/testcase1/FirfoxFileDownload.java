package test.testcase1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

import java.util.concurrent.TimeUnit;

public class FirfoxFileDownload {
    public static void main(String[] args) throws InterruptedException {

        //While downloading if we face any window pop-up problem then we need to use below code.

        FirefoxProfile profile = new FirefoxProfile();
        //profile.setPreference("browser.helperApps.neverAsk.saveToDisk" , "text/plain"); //text/plain is a MIME type of text file you need to change MEME type as per requirement link-https://developer.mozilla.org/en-US/docs/Web/HTTP/Basics_of_HTTP/MIME_types/Common_types

        //Another way to write above line
        profile.setPreference("browser.helperApps.neverAsk.saveToDisk", "text/plain,application/pdf");

        profile.setPreference("browser.download.manager.showWhenStarting", false);

        //Download the file at desired location in Firefox

        profile.setPreference("browser.download.dir", "C:\\Users\\HimanshiRajput\\Desktop\\Automationjava\\Downloads");
        profile.setPreference("browser.download.folderList", 2); //Optional line
        profile.setPreference("pdfjs.disabled", true);// This line is only for PDF.

        FirefoxOptions options = new FirefoxOptions();
        options.addArguments("--disable-notifications");
        options.setProfile(profile);

        WebDriver driver = new FirefoxDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://demo.automationtesting.in/FileDownload.html");

        driver.findElement(By.id("textbox")).sendKeys("Hi Himanshi");

        JavascriptExecutor jse = (JavascriptExecutor)driver ;
        jse.executeScript("window.scrollBy(0, 500)");

        driver.findElement(By.id("createTxt")).click();

        driver.findElement(By.id("link-to-download")).click();

        Thread.sleep(3000);

        driver.findElement(By.id("pdfbox")).sendKeys("It's a PDF file.");

        jse.executeScript("window.scrollBy(0,500)");

        driver.findElement(By.id("createPdf")).click();

        driver.findElement(By.id("pdf-link-to-download")).click();

        Thread.sleep(3000);

        System.out.println("RRR");

        driver.quit();



    }
}
