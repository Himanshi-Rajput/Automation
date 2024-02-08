package test.testcase1;

import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HTMLunitDriver_Testcase {
    public static void main(String[] args) {
        HtmlUnitDriver driver = new HtmlUnitDriver();
        driver.get("https://demoqa.com/automation-practice-form");
        System.out.println("The title of the page is:- " + driver.getTitle());
        System.out.println("The URL of the page is:- " + driver.getCurrentUrl());
    }
}
