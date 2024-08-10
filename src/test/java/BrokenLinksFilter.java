import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

/*
1. Link href="https:/abc.com"
2. https://abc.com --> server --> status code
3. status code =400
 */
public class BrokenLinksFilter {
    public static void main(String[] args) throws MalformedURLException {
        // 1.
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://www.daraz.com.np/");
//        driver.get("https://d.kcmg.nl/login");
////        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("bhumika.shrestha@procit.com");
//        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Kcm2001@#");
//        driver.findElement(By.xpath("//ion-button[@type='submit']")).click();

        List<WebElement> links=driver.findElements(By.tagName("a"));
        System.out.println("Total links: " + links.size());
        int noOfBrokenLinks=0;

        for(WebElement LinkElement:links) {
            String hrefAttributeValue = LinkElement.getAttribute("href");
            if (hrefAttributeValue == null || hrefAttributeValue.isEmpty()) {
                System.out.println("href attribute value is null or empty. So not possible to check");
            }
            //hit url to the server
            try {
                URL linkURL = new URL(hrefAttributeValue);
                HttpURLConnection conn = (HttpURLConnection) linkURL.openConnection();
                conn.connect();
                if (conn.getResponseCode() >= 400) {
                    System.out.println(hrefAttributeValue +" "+"Broken link");
                    noOfBrokenLinks++;
                } else {
                    System.out.println(hrefAttributeValue +" "+ "Not broken link");
                }
            }
            catch(Exception e)
            {

            }
        }

    }
}
