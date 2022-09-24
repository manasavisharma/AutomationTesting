import org.checkerframework.checker.units.qual.K;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class fileUpload {

    public static void main(String[] args) throws AWTException, InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\pc\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/upload");

        Robot rb = new Robot();
//        driver.findElement(By.id("file-upload")).click();
//        driver.findElement(By.xpath(".//input[@id='file-upload']")).click();
        driver.findElement(By.cssSelector("#file-upload")).click();

        Thread.sleep(3000);
        StringSelection filepath =new StringSelection("C:\\Users\\pc\\Desktop\\To-Do");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filepath, null);

        rb.keyPress(KeyEvent.VK_CONTROL);
        rb.keyPress(KeyEvent.VK_V);

        rb.keyRelease(KeyEvent.VK_CONTROL);
        rb.keyRelease(KeyEvent.VK_V);

        rb.keyPress(KeyEvent.VK_ENTER);
        rb.keyRelease(KeyEvent.VK_ENTER);

        driver.findElement(By.id("file-submit")).click();

    }
}
