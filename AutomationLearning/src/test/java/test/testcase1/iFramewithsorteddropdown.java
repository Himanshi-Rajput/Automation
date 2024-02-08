package test.testcase1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class iFramewithsorteddropdown {
    public static void main(String[] args) {


        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");

        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0, 1000)");

        //driver.switchTo().frame("frame-one796456169");//Using iFrame ID
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@frameborder=\"0\"]"))); // triggering iframe using xpath

        WebElement jobs = driver.findElement(By.id("RESULT_RadioButton-3"));
        Select job_options = new Select(jobs);

        List<WebElement> each_Job_options = new ArrayList<>();

        List  original_job_options = new ArrayList<>();
        List  expected_job_options = new ArrayList<>();

        each_Job_options = job_options.getOptions();

        System.out.println("The real List");

        for (WebElement value :  each_Job_options)
        {
            String job_name = value.getText();
            original_job_options.add(job_name);
            expected_job_options.add(job_name);

        }

        System.out.println(original_job_options);

        Collections.sort(expected_job_options);

        System.out.println("The expected list");

        System.out.println(expected_job_options);

        if(original_job_options == expected_job_options)
        {
            System.out.println("Options in list are sorted.");
        }
        else
        {
            System.out.println("Options in list are not sorted.");
        }









    }


}
