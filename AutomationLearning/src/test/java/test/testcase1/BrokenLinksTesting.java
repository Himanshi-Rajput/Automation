package test.testcase1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class BrokenLinksTesting {
    public static void main(String[] args) throws IOException, InterruptedException {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(40 , TimeUnit.SECONDS);



        driver.get("https://demoqa.com/broken");

       List<WebElement> links =  driver.findElements(By.tagName("a"));

       int total_no_of_links =  links.size();

        System.out.println("Total number of links are:- "+total_no_of_links);

        for (int i=0 ; i< total_no_of_links ; i++)
        {
            WebElement link = links.get(i);
            String url = link.getAttribute("href");

            System.out.println("LINk "+ i + " are "+url);
        }

        for (int i=0 ; i< total_no_of_links ; i++)
        {
            WebElement link = links.get(i);
            String url = link.getAttribute("href");

//            System.out.println(url);
             if(url!= null)
             {

            URL object = new URL(url);

            //Create an HTTP connection using url object.
            HttpURLConnection httpURLConnect = (HttpURLConnection) object.openConnection();

            Thread.sleep(5000);

            //Establish connection
            httpURLConnect.connect();

            int rescode = httpURLConnect.getResponseCode();

            if( rescode>=400)
            {
                System.out.println(url + " :- Link is broken.");
            }
            else
            {
                System.out.println(url + " :- Link is valid.");
            }

             }

        }



        System.out.println("Reached last second line.");
        driver.quit();



    }
}
