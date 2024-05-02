import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getMethods {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        //get url
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(5000);
        //get page title
        //System.out.println(driver.getTitle());
        //get current url
        //System.out.println(driver.getCurrentUrl());
        //get window ID
        //System.out.println(driver.getPageSource());
        //String window=driver.getWindowHandle();
        //System.out.println("WindowID:"+window);

        driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']")).click();
        driver.quit();


    }
}
