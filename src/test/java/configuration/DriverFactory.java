package configuration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.IOException;
import java.io.InputStream;
import java.time.Duration;
import java.util.Properties;
import org.openqa.selenium.WebDriver;


public class DriverFactory {
    private WebDriver driver;
}
//        public static void main(String[] args) {
//            Properties properties = new Properties();
//            try {
//                FileInputStream fileInputStream = new FileInputStream("config.properties");
//                properties.load(fileInputStream);
//                fileInputStream.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//}

//    public DriverFactory(){
//        ClassLoader loader = Thread.currentThread().getContextClassLoader();
//        Properties properties = new Properties();
//        try (InputStream resourceStream = loader.getResourceAsStream("application.properties")) {
//            properties.load(resourceStream);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//        setBrowser(properties.getProperty("browserName"));
//        driver.get(properties.getProperty("baseUrl"));
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
//        driver.manage().window().maximize();
//    }
//
//    public WebDriver getDriver(){
//        return driver;
//    }
//
//    private WebDriver setBrowser(String browserName){
//        switch (browserName){
//            case "chrome":
//                driver= new ChromeDriver();
//                break;
//            case "firefox":
//                driver= new FirefoxDriver();
//                break;
//            case "edge":
//                driver= new EdgeDriver();
//                break;
//            default:
//                System.out.println("You entered unrecognized driver name!!!");
//                break;
//        }
//        return driver;
//    }
//}

