import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import java.time.Duration;

public class HandleAlerts {

    private WebDriver driver;

    @BeforeEach
    public void SetUp()
    {
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

    }
    @AfterEach
    public void tearDown()
    {
        driver.quit();
    }

    @Test
    //normal alert button with ok button
    public void NormalAlterButton() throws InterruptedException {
        driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
        Thread.sleep(5000);
        Alert myalert = driver.switchTo().alert();
        System.out.println(myalert.getText());
        myalert.accept();
    }
    @Test
    // JS confirm alert - Ok And cancel button
    public void ConfirmationAlert() throws InterruptedException {
        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
        Thread.sleep(5000);
        //driver.switchTo().alert().accept(); // to click ok button
        driver.switchTo().alert().dismiss(); // to click cancel button

    }
    @Test
    //handling JS Prompt alert
    public void PromptAlert() throws InterruptedException {
        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
        Thread.sleep(5000);
        Alert myalert = driver.switchTo().alert();
        myalert.sendKeys("Welcome");
        myalert.accept();
    }

    @Test
    public void AuthenticatedPoPup() throws InterruptedException {
        //passing credintails directly to the url
        driver.navigate().to("https://admin:admin@the-internet.herokuapp.com/basic_auth");
        Thread.sleep(5000);
    }
}

