package test.testcase1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;

public class Calendarfunctionality {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disabled-notifications");
        WebDriver driver= new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/automation-practice-form");
        driver.findElement(By.xpath("//input[@id=\"dateOfBirthInput\"]")).click();

        for (int i=12 ; i>1 ; i--)
        {
            driver.findElement(By.xpath("//button[@aria-label=\"Previous Month\"]")).click();
           String date =  driver.findElement(By.xpath("//div[@class=\"react-datepicker__current-month react-datepicker__current-month--hasYearDropdown react-datepicker__current-month--hasMonthDropdown\"]")).getText();
            System.out.println(date);
        }
        Select calpoint = new Select(driver.findElement(By.className("react-datepicker__year-select")));
        calpoint.selectByVisibleText("2021");
        Select monthpoint = new Select(driver.findElement(By.className("react-datepicker__month-select")));
        monthpoint.selectByVisibleText("December");
        driver.findElement(By.xpath("//div[@class=\"react-datepicker__day react-datepicker__day--007\"]")).click();
        driver.quit();


    }
}
