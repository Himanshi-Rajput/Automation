package test.testcase1;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.awt.*;
import java.util.List;

public class Registrationform_assignment {

    public static void main(String[] args) throws InterruptedException, AWTException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        WebDriver driver = new ChromeDriver(options);
         driver.manage().window().maximize();
         driver.get("https://demo.automationtesting.in/");
         driver.findElement(By.linkText("Skip Sign In")).click();
         driver.findElement(By.xpath("//*[@placeholder=\"First Name\"]")).sendKeys("Himanshi");
         driver.findElement(By.xpath("//*[@placeholder=\"Last Name\"]")).sendKeys("Rajput");
         driver.findElement(By.xpath("//*[@ng-model=\"Adress\"]")).sendKeys("M.P.");
         driver.findElement(By.xpath("//*[@type=\"email\"]")).sendKeys("himanshirajput05@gmail.com");
         driver.findElement(By.xpath("//*[@type=\"tel\"]")).sendKeys("9617403878");
         if((driver.findElement(By.xpath("//*[@value=\"Male\"]")).isSelected())== false)

             driver.findElement(By.xpath("//*[@value=\"Male\"]")).click();

         driver.findElement(By.id("checkbox1")).click();
        driver.findElement(By.id("checkbox2")).click();
        driver.findElement(By.id("checkbox3")).click();

           JavascriptExecutor jse =  (JavascriptExecutor)driver;
          jse.executeScript("window.scrollBy(0,200)");

         WebElement skills = driver.findElement(By.xpath("//*[@ng-model=\"Skill\"]"));
         Select skills_options = new Select(skills);

         skills_options.selectByVisibleText("Java");

         int Total_number_of_skills = skills_options.getOptions().size();

        System.out.println("Total number of skills:-");

         for(int i = 1 ; i< Total_number_of_skills ; i++)
         {
             System.out.println(skills_options.getOptions().get(i).getText());
         }

         driver.findElement(By.xpath("//*[@role=\"combobox\"]")).click();
         driver.findElement(By.xpath("//*[@type=\"search\"]")).sendKeys("India");
        driver.findElement(By.xpath("//*[@type=\"search\"]")).sendKeys(Keys.ARROW_DOWN);
        driver.findElement(By.xpath("//*[@type=\"search\"]")).sendKeys(Keys.ENTER);

       driver.findElement(By.id("msdd")).click();

        List<WebElement> Language_options = driver.findElements(By.xpath("//*[@style=\"list-style:none;max-height: 230px;overflow: scroll;\"]/li"));

        int total = Language_options.size();
        System.out.println("The total no. of languages are:- " +  total );

        jse.executeScript("window.scrollBy(0,200)");

        for (int i = 0 ; i<41; i++)
        {
            String lan = Language_options.get(i).getText();
            System.out.println(lan);
            if(lan.contains("English"))
            {
                Language_options.get(i).click();
            }
            else if (lan.contains("Hindi"))
            {
                Language_options.get(i).click();
            }
        }

        Actions actions = new Actions(driver);
        Robot robot = new Robot();
        robot.mouseMove(50,50);
        actions.click().build().perform();

        jse.executeScript("window.scrollBy(0,200)");

        WebElement year = driver.findElement(By.xpath("//*[@placeholder=\"Year\"]"));
        Select years_option = new Select(year);
        years_option.selectByVisibleText("1999");



        WebElement day = driver.findElement(By.xpath("//*[@placeholder=\"Day\"]"));
        Select days_option = new Select(day);
        days_option.selectByIndex(5);


        WebElement month = driver.findElement(By.xpath("//*[@placeholder=\"Month\"]"));
        Select month_option = new Select(month);
        month_option.selectByIndex(10);

        driver.findElement(By.xpath("//*[@type=\"password\"]")).sendKeys("Himanshi@05");
        driver.findElement(By.xpath("//*[@id=\"secondpassword\"]")).sendKeys("Himanshi@05");

        driver.findElement(By.xpath("//*[@value=\"Refresh\"]")).click();
    }

}
