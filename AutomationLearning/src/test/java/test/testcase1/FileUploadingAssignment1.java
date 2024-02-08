package test.testcase1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Key;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import java.util.concurrent.TimeUnit;

public class FileUploadingAssignment1 {
    public static void main(String[] args) throws InterruptedException, FindFailed {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        WebDriver driver = new ChromeDriver(options);

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        Thread.sleep(3000);

        driver.findElement(By.name("username")).sendKeys("Admin");

        driver.findElement(By.name("password")).sendKeys("admin123");

        driver.findElement(By.xpath("//*[@type=\"submit\"]")).click();

        Thread.sleep(3000);

        driver.findElement(By.xpath("//*[@href=\"/web/index.php/pim/viewPimModule\"]")).click();

        Thread.sleep(3000);

        driver.findElement(By.xpath("//*[@class=\"oxd-topbar-body-nav-tab\"]")).click();

        Thread.sleep(3000);

        driver.findElement(By.xpath("//button[@class=\"oxd-icon-button oxd-icon-button--solid-main employee-image-action\"]")).click();

        Thread.sleep(3000);

        Screen s = new Screen();

        Pattern input_box = new Pattern("C:\\Users\\HimanshiRajput\\Desktop\\Automationjava\\File upload\\UploadBox.png");

        Pattern open_button = new Pattern("C:\\Users\\HimanshiRajput\\Desktop\\Automationjava\\File upload\\OpenButton.png");

        s.wait(input_box , 30);

        s.type("C:\\Users\\HimanshiRajput\\Desktop\\Automationjava\\Apple.jpg");

        // s.click(open_button); not detecting picture.

        s.keyDown(Key.ENTER);

        Thread.sleep(10000);

        String text = driver.findElement(By.xpath("//*[@class=\"oxd-text oxd-text--span oxd-input-field-error-message oxd-input-group__message\"]")).getText();

        if(text.equals("Attachment Size Exceeded"))
        {
            System.out.println("Attached image needs to change");
        }
        else
        {
            System.out.println("Attached picture is correct");
        }

        System.out.println("This is the last line of code.");

        driver.quit();

    }
}
