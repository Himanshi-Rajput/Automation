package test.testcase1;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DDTProject2 {
    public static void main(String[] args) throws IOException {
        FileInputStream file = new FileInputStream("C://Users//HimanshiRajput//Desktop//Automationjava//Project1.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(file);
        XSSFSheet sheet = workbook.getSheetAt(1);

        int rowcount = sheet.getLastRowNum();

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");

        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india-sbi/fixed-deposit-calculator-SBI-BSB001.html");

        for (int i=1; i<=rowcount; i++)
        {
            XSSFRow rowpointer = sheet.getRow(i);
             int Principle = (int) rowpointer.getCell(0).getNumericCellValue();
             driver.findElement(By.name("principal")).sendKeys(String.valueOf(Principle));

             int ROI = (int) rowpointer.getCell(1).getNumericCellValue();
             driver.findElement(By.id("interest")).sendKeys(String.valueOf(ROI));

             int  Period = (int) rowpointer.getCell(2).getNumericCellValue();
             driver.findElement(By.id(("tenure"))).sendKeys(String.valueOf(Period));

            Select tenure =  new Select(driver.findElement(By.id("tenurePeriod")));
            tenure.selectByVisibleText("year(s)");

            String Frequency = rowpointer.getCell(3).getStringCellValue();
            Select freq = new Select(driver.findElement(By.id("frequency")));
            freq.selectByVisibleText(Frequency);

            driver.findElement(By.xpath("//img[@src=\"https://images.moneycontrol.com/images/mf_revamp/btn_calcutate.gif\"]")).click();

           Double amount = Double.parseDouble(driver.findElement(By.id("resp_matval")).getText()) ;

           int expected_amount = (int) rowpointer.getCell(4).getNumericCellValue();

           if (amount == expected_amount)
           {
               System.out.println("Calculation is as expected");
           }
           else
           {
               System.out.println("Calculation is not as expected");
           }

           driver.findElement(By.xpath("//img[@src=\"https://images.moneycontrol.com/images/mf_revamp/btn_clear.gif\"]")).click();
        }

        System.out.println("Program worked successfully");

        driver.quit();

        file.close();


    }
}
