package test.testcase1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Key;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;


import java.util.concurrent.TimeUnit;

public class FileUploadingusingSikuli {

    public static void main(String[] args) throws InterruptedException, FindFailed {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");

        WebDriver driver = new ChromeDriver(options);

        driver.manage().window().maximize();

        driver.get("https://demo.automationtesting.in/Register.html");

       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

       //Thread.sleep(3000);

        WebElement button = driver.findElement(By.id("imagesrc"));

        Actions act = new Actions(driver);

        act.moveToElement(button).pause(500).click(button).build().perform();

        Thread.sleep(3000);

        Screen s = new Screen();//Import proper class

        String image_file_location = "C:\\Users\\HimanshiRajput\\Desktop\\Automationjava\\File upload\\";

        String upload_file_location = "C:\\Users\\HimanshiRajput\\Desktop\\Automationjava\\";

        Pattern  Open_button= new Pattern(image_file_location+"Open3.png");

        Pattern Input_box = new Pattern(image_file_location+"UploadBox.png");

        Thread.sleep(2000);

        s.wait(Input_box , 50);

        s.type(Input_box,upload_file_location+"Apple.jpg");

        Thread.sleep(2000);
        s.keyDown(Key.ENTER);

//        s.find(Open_button);
//
//        s.click(Open_button);
//
//        s.setAutoWaitTimeout(200);

        //s.click(Open_button);

        System.out.println("WELL DONE.........");

        //driver.quit();
    }
}
