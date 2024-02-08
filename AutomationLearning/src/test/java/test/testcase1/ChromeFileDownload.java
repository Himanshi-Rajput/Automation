package test.testcase1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;


import javax.swing.plaf.basic.BasicMenuUI;
import java.io.File;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

public class ChromeFileDownload {
    public static void main(String[] args) throws InterruptedException {

        //Download files on your required location...

        HashMap<String , Object>  ChromePrefs = new HashMap<String, Object>();

        ChromePrefs.put("profile.default_content_settings.popup" , 0);
        ChromePrefs.put("download.prompt_for_download" , false);
        ChromePrefs.put("download.default_directory", "C:\\Users\\HimanshiRajput\\Desktop\\Automationjava\\Downloads");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        options.setExperimentalOption("prefs", ChromePrefs);

        DesiredCapabilities cap  = new DesiredCapabilities();
        cap.setBrowserName("chrome");
        cap.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS , true);
        cap.setCapability(ChromeOptions.CAPABILITY , options);

        WebDriver driver = new ChromeDriver(options);

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(30 , TimeUnit.SECONDS);

        driver.get("https://demo.automationtesting.in/FileDownload.html");

        driver.findElement(By.id("textbox")).sendKeys("Hi Himanshi");

        driver.findElement(By.id("createTxt")).click();

        driver.findElement(By.id("link-to-download")).click();

        Thread.sleep(3000);

        boolean status = isFileExist("C:\\Users\\HimanshiRajput\\Desktop\\Automationjava\\Downloads");

        if(status)
        {
            System.out.println("Text file downloaded successfully.");
        }
        else
        {
            System.out.println("Text file is not downloaded successfully.");
        }

        driver.findElement(By.id("pdfbox")).sendKeys("It's a PDF file.");

        driver.findElement(By.id("createPdf")).click();

        driver.findElement(By.id("pdf-link-to-download")).click();

        Thread.sleep(3000);

        boolean status2 = isFileExist("C:\\Users\\HimanshiRajput\\Desktop\\Automationjava\\Downloads");

        if(status2)
        {
            System.out.println("PDF file downloaded successfully.");
        }
        else
        {
            System.out.println("PDF file is not downloaded successfully.");
        }

        System.out.println("RRR");

        driver.quit();

    }

    static  boolean isFileExist(String location)
    {
        File pass = new File(location);
        if (pass.exists())
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
