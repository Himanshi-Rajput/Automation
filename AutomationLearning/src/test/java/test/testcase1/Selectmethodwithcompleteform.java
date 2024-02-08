package test.testcase1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.htmlunit.HtmlUnitWebElement;
import org.openqa.selenium.support.ui.Select;

public class Selectmethodwithcompleteform {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.findElement(By.id("name")).sendKeys("Himanshi");
        driver.findElement(By.id("email")).sendKeys("himanshirajput05@gmail.com");
        driver.findElement(By.id("phone")).sendKeys("9617403878");
        driver.findElement(By.id("textarea")).sendKeys("Indore");
        if ((driver.findElement(By.id("male")).isSelected()) == false)
        {
            driver.findElement(By.id("male")).click();
        }
        driver.findElement(By.id("sunday")).click();
        driver.findElement(By.id("sunday")).click();
        driver.findElement(By.id("monday")).click();

         WebElement Country = driver.findElement(By.id("country"));

         Select country_dropdown = new Select(Country);

         country_dropdown.selectByVisibleText("India");
         country_dropdown.selectByIndex(1);
         country_dropdown.selectByValue("australia");

        System.out.println("Total number of countries in list are:- "+country_dropdown.getOptions().size());

        WebElement Colors = driver.findElement(By.id("colors"));

        Select colors_options = new Select(Colors);
        colors_options.selectByValue("white");
        System.out.println("Total number of colors in the list are:- "+ colors_options.getOptions().size());

        driver.findElement(By.id("datepicker")).click();

        for (int i=1 ; i<3 ; i++)
        {
            driver.findElement(By.linkText("Prev")).click();
            String title = driver.findElement(By.xpath("//*[@class=\"ui-datepicker-month\"]")).getText();
            System.out.println(title);
            if (title.equals("October"))
            {
                driver.findElement(By.linkText("5")).click();
            }
        }

        driver.findElement(By.linkText("open cart")).click();

        driver.navigate().back();

        driver.findElement(By.linkText("Home")).click();

        System.out.println("Finally landed on the original Page - " + driver.getTitle());

        driver.close();
    }
}
