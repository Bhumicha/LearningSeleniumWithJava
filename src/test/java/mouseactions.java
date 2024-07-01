import org.checkerframework.checker.units.qual.A;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseactions {
    WebDriver driver;

    @BeforeEach
    public void setUp()
    {
        driver = new ChromeDriver();
        driver.get("https://demo.opencart.com/");
        driver.manage().window().maximize();
    }
    @AfterEach
    public void tearDown()
    {
        driver.quit();
    }
    @Test
    //mouse hover and click actions
    public void MouseHoverAction() throws InterruptedException {
        WebElement desktops=driver.findElement(By.xpath("//a[normalize-space()='Desktops']"));
        WebElement mac = driver.findElement(By.xpath("//a[normalize-space()='Mac (1)']"));

        Actions act= new Actions(driver);
        //mouse hover action
        act.moveToElement(desktops).moveToElement(mac).click().build().perform();
        Thread.sleep(5000);
    }
    @Test
    //right click action
    public void RightClickAction()
    {
        driver.navigate().to("https://swisnl.github.io/jQuery-contextMenu/demo.html");
        WebElement button=driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
        Actions act1=new Actions(driver);
        act1.contextClick(button).build().perform();
        //click on copy
        driver.findElement(By.xpath("//span[normalize-space()='Copy']")).click();
        //close alert box
        driver.switchTo().alert().accept();
    }
    @Test
    //double click
    public void doubleClick()
    {
        driver.navigate().to("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
        driver.switchTo().frame("iframeResult");
        WebElement box1=driver.findElement(By.xpath("//input[@id='field1']"));
        WebElement box2= driver.findElement(By.xpath("//input[@id='field2']"));
        WebElement button=driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));
        box1.clear();
        box1.sendKeys("Welcome");
        //double click action on thw button
        Actions act2=new Actions(driver);
        act2.doubleClick(button).perform();

        //validation:box2 should contain same text
        String text=box2.getAttribute("value");
        System.out.println("Captured value is:"+ text);
        if (text.equals("Welcome"))
        {
            System.out.println("Text copied");
        }
        else
        {
            System.out.println("Text not copied");
        }
    }
    @Test
    //drag and drop
    public void dragAndDrop()
    {
        driver.navigate().to("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
        WebElement sourceElement=driver.findElement(By.xpath("//div[@id='box6']"));
        WebElement targetElement=driver.findElement(By.xpath("//div[@id='box106']"));
        Actions act3= new Actions(driver);
        act3.dragAndDrop(sourceElement,targetElement).perform();

    }
}
