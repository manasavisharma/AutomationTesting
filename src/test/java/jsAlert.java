import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class jsAlert {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\SONY\\Downloads\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        //===========Click for js alert
//        driver.findElement(By.xpath("//button[contains(text(),'Click for JS Alert')]")).click();
//
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(1000));
//        wait.until(ExpectedConditions.alertIsPresent());
//        Alert alert = driver.switchTo().alert();
//        String txt = driver.switchTo().alert().getText();
//        System.out.println(txt);
//        Thread.sleep(500);
//        alert.accept();
//        Thread.sleep(2000);
//        driver.quit();

        //===========Click for js confirm
//        driver.findElement(By.xpath("//button[contains(text(),'Click for JS Confirm')]")).click();
//
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(1000));
//        wait.until(ExpectedConditions.alertIsPresent());
//        Alert alt = driver.switchTo().alert();
//        String txt = driver.switchTo().alert().getText();
//        System.out.println(txt);
//        Thread.sleep(1000);
//        alt.accept();                            //can write if-else?
////        alt.dismiss();
//        Thread.sleep(1000);
//        Thread.sleep(1000);
//        driver.quit();

        //===========Click for js prompt
        driver.findElement(By.xpath("//button[contains(text(),'Click for JS Prompt')]")).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(1000));
        wait.until(ExpectedConditions.alertIsPresent());
        Alert alt = driver.switchTo().alert();
        String txt = driver.switchTo().alert().getText();
        System.out.println(txt);
        Thread.sleep(1000);
        alt.sendKeys("Hello");
        Thread.sleep(2000);
        alt.accept();

    }
}
