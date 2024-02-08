package test.testcase1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Facebook_title_assignment {

    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
       String actual_title = driver.getTitle();
       String expected_title = "Facebook – log in or sign up";
       if (expected_title.equals(actual_title))
       {
           System.out.println("Title is matching:- " + actual_title);
       }
       else
       {
           System.out.println("Tile is not matching:-" + actual_title);
       }

       driver.close();

    }
}
