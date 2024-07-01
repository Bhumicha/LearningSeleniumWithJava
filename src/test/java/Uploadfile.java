import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Uploadfile {
    WebDriver driver;

    @BeforeEach
    public void steUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        JavascriptExecutor js= (JavascriptExecutor) driver;
    }
    @AfterEach
    public void tearDown()
    {
        driver.quit();
    }
    @Test
    public void fileUpload() {
        driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys("E:\\Sample.docx");
        if (driver.findElement(By.xpath("//ul[@id='fileList']")).getText().equals("Sample.docx"))
        {
            System.out.println("File is uploaded.");
        }
        else
        {
            System.out.println("Not uploaded");
        }
    }
}
