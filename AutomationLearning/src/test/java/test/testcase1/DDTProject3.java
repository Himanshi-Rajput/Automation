package test.testcase1;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DDTProject3 {
    public static void main(String[] args) throws IOException {

        FileOutputStream file = new FileOutputStream("C://Users//HimanshiRajput//Desktop//Automationjava//Project3.xlsx");

        XSSFWorkbook workbook = new XSSFWorkbook();


        XSSFSheet sheet = workbook.createSheet("First");
        XSSFSheet sheet1 = workbook.createSheet("Second");

        for (int i=0 ; i<=5; i++)
        {
            XSSFRow rowpointer1 = sheet.createRow(i);
            XSSFRow rowpointer2 = sheet1.createRow(i);
            for(int j=0 ; j<=5 ; j++)
            {
                rowpointer1.createCell(j).setCellValue("New-sheet1");
                rowpointer2.createCell(j).setCellValue("New-sheet2");
            }
        }

        workbook.write(file);
        file.close();

        System.out.println("Program compiled successfully");

    }
}
