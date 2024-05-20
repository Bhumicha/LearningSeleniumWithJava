import org.checkerframework.checker.units.qual.C;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class HandlingWebTable {
    WebDriver driver;

    @BeforeEach
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("http://demo.guru99.com/test/accessing-nested-table.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void Webtable() {
        // accessing nestled tables
        String innerText = driver.findElement(By.xpath("//table/tbody/tr[2]/td[2]/table/tbody/tr/td[2]")).getText();
        System.out.println(innerText);
        //using attributes as predicates
        String innerText1 = driver.findElement(By.xpath("//table[@width=\"270\"]/tbody/tr[4]/td")).getText();
        System.out.println(innerText1);
    }
}
