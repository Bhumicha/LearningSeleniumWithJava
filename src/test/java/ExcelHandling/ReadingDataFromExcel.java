import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

public class ReadingDataFromExcel {
    WebDriver driver;

    public static void main(String[] args) throws IOException {
        FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\testdata\\data.xlsx");
        XSSFWorkbook workbook=new XSSFWorkbook(file);
        XSSFSheet sheet= workbook.getSheet("Sheet1");
        int totalRows=sheet.getLastRowNum();
        int totalCells=sheet.getRow(1).getLastCellNum();

        System.out.println("Number of rows: "+totalRows);
        System.out.print("Number of cells: "+ totalCells);

        for(int r=0; r<=totalRows; r++)
        {
            XSSFRow currentRow=sheet.getRow(r);
            for(int c=0; c<totalCells; c++)
            {
                XSSFCell cell=currentRow.getCell(c);
                System.out.print(cell.toString()+"\t");
            }
            System.out.println();
        }
        workbook.close();
        file.close();
    }

}
