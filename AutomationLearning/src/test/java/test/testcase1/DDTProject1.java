package test.testcase1;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DDTProject1 {
    public static void main(String[] args) throws IOException {
        //Registration Form
        FileInputStream file = new FileInputStream("C://Users//HimanshiRajput//Desktop//Automationjava//Project1.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(file);
        XSSFSheet sheet = workbook.getSheetAt(0);
        int rowcount = sheet.getLastRowNum();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/automation-practice-form");
        for (int i=1 ; i<=rowcount ; i++)
        {
            XSSFRow rowpointer = sheet.getRow(i);

                String First_name =  rowpointer.getCell(0).getStringCellValue();
                driver.findElement(By.id("firstName")).sendKeys(First_name);
                String  Last_name =  rowpointer.getCell(1).getStringCellValue();
                driver.findElement(By.id("lastName")).sendKeys(Last_name);
                String  Email =  rowpointer.getCell(2).getStringCellValue();
                driver.findElement(By.id("userEmail")).sendKeys(Email);
                String Gender =  rowpointer.getCell(3).getStringCellValue();
                if (Gender.equals("Female"))
                {
                    driver.findElement(By.xpath("//*[@for=\"gender-radio-2\" ]")).click();
                }
                else
                {
                    driver.findElement(By.xpath("//*[@for=\"gender-radio-1\" ]")).click();
                }
                long   Mobile =  (long)rowpointer.getCell(4).getNumericCellValue();
                driver.findElement(By.xpath("//input[@maxlength=\"10\" ]")).sendKeys(String.valueOf(Mobile));
                String Subject =  rowpointer.getCell(5).getStringCellValue();
                driver.findElement(By.id("subjectsInput")).sendKeys(Subject);
                driver.findElement(By.id("subjectsInput")).sendKeys(Keys.ENTER);

            driver.findElement(By.id("firstName")).clear();
            driver.findElement(By.id("lastName")).clear();
            driver.findElement(By.id("userEmail")).clear();
            driver.findElement(By.xpath("//input[@maxlength=\"10\" ]")).clear();

        }
        System.out.println("Testing is Completed.");
        driver.quit();
        file.close();
    }
}
 