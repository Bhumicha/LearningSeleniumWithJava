import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class conditionalMethods {
    WebDriver driver = new ChromeDriver();


    @BeforeEach
        public void setUp () {
                driver.get("https://demo.nopcommerce.com/register");
                driver.manage().window().maximize();
                driver.manage().window().setSize(new Dimension(786, 816));
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
            }
            //isDisplayed()
        /*
        driver.get("https://demo.nopcommerce.com");
        driver.manage().window().maximize();
        WebElement logo =driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
        System.out.println("Display Status:" +logo.isDisplayed());
        //isEnabled()
        Boolean search =driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isEnabled();
        System.out.println("Enabled Status:"+search);
         */
            //isSelected()
            @AfterEach
            public void tearDown () {
                driver.quit();
            }
            @Test
            public void selection () {
                WebElement male_Seletcion = driver.findElement(By.xpath("//input[@id='gender-male']"));
                WebElement female_Seletcion = driver.findElement(By.xpath("//input[@id='gender-female']"));
                System.out.println("Before Seletcion:");
                System.out.println(male_Seletcion.isSelected());
                System.out.println(female_Seletcion.isSelected());
                //after seletion
                System.out.println("Afer Seletcion:");
                male_Seletcion.click();
                System.out.println(male_Seletcion.isSelected());
                System.out.println(female_Seletcion.isSelected());
            }


    }

