package test.testcase1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortedDropDownValidation {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,500)");


        WebElement dropdown_pointer = driver.findElement(By.tagName("select"));
        Select access_dropdown = new Select(dropdown_pointer);
        List<WebElement> eachoptions_webelement = access_dropdown.getOptions();

        List original_eachelement = new ArrayList<>();
        List temporary_eachelement = new ArrayList<>();

        for ( WebElement e: eachoptions_webelement)
        {
            original_eachelement.add(e.getText());
            temporary_eachelement.add(e.getText());
        }

        //temporary_eachelement = original_eachelement;

        System.out.println(original_eachelement);
        System.out.println(temporary_eachelement);

        Collections.sort(temporary_eachelement);

        System.out.println(original_eachelement);
        System.out.println(temporary_eachelement);

        if( original_eachelement == temporary_eachelement)
        {
            System.out.println("list is sorted");
        }
        else
        {
            System.out.println("List is not sorted");
        }
    }
}
