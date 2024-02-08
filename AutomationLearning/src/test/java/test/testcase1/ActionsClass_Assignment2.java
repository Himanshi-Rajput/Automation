package test.testcase1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class ActionsClass_Assignment2 {
    public static void main(String[] args) throws InterruptedException {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");

        WebDriver driver = new ChromeDriver(options);

        driver.manage().window().maximize();

        driver.get("http://dhtmlgoodies.com/scripts/drag-drop-nodes/drag-drop-nodes.html");

        driver.manage().timeouts().implicitlyWait(30 , TimeUnit.SECONDS);

        //implicit wait in Selenium, a feature that tells the web driver to wait for
        //a certain amount of time before throwing an exception.

       // WebElement A = driver.findElement(By.id("node1"));

        List<WebElement> pointer = new ArrayList<>();

        Actions act = new Actions(driver);


        for(int i=1 ;i<= 21 ; i++)
        {
            WebElement start =  driver.findElement(By.id("node"+i));
            pointer.add(start);
        }

        List<WebElement> pointer2 = new ArrayList<WebElement>();

        for(int i=0 ;i< 21 ; i++)
        {

            if(i<4)
            {
                WebElement start =  driver.findElement(By.id("box1"));
                //System.out.println(start);
                pointer2.add(start);
                act.clickAndHold(pointer.get(i)).pause(1000).moveToElement(pointer2.get(i)).release().build().perform();
                Thread.sleep(1000);
            }
            else if (i<8 && i>3)
            {
                WebElement start =  driver.findElement(By.id("box2"));
                pointer2.add(start);
                act.clickAndHold(pointer.get(i)).pause(1000).moveToElement(pointer2.get(i)).release().build().perform();
                Thread.sleep(1000);
            }
            else if (i<12 && i>7)
            {
                WebElement start =  driver.findElement(By.id("box3"));
                pointer2.add(start);
                act.clickAndHold(pointer.get(i)).pause(1000).moveToElement(pointer2.get(i)).release().build().perform();
                Thread.sleep(1000);
            }
            else if (i<15 && i>11)
            {
                WebElement start =  driver.findElement(By.id("box4"));
                pointer2.add(start);
                act.clickAndHold(pointer.get(i)).pause(1000).moveToElement(pointer2.get(i)).release().build().perform();
                Thread.sleep(1000);
            }
            else
            {
                WebElement start =  driver.findElement(By.id("box5"));
                pointer2.add(start);
                act.clickAndHold(pointer.get(i)).pause(1000).moveToElement(pointer2.get(i)).release().build().perform();
                Thread.sleep(1000);
            }


        }
//        act.clickAndHold(pointer.get(0)).moveToElement(pointer2.get(0)).release().build().perform();
//
//        for(int i=0 ; i<21 ; i++)
//        {
//            System.out.println(pointer.get(i)+ " & " + pointer2.get(i));
//        }
//
//        WebElement A = driver.findElement(By.id("node1"));
//        WebElement classA =  driver.findElement(By.xpath("//*[@id=\"box1\"]"));
//        Thread.sleep(3000);
//        act.clickAndHold(A).moveToElement(classA).release().build().perform();
//        act.dragAndDrop(A, classA).build().perform();
//        Thread.sleep(5000);

        System.out.println("This is the last second line of code.");

        driver.quit();

            }
}
