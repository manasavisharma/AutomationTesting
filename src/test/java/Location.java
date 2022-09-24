import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Location {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\pc\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/geolocation");

        driver.findElement(By.xpath("//button[contains(text(),'Where am I?')]")).click();
        Thread.sleep(2000);
        driver.quit();

        //for first time open this website alert will appear for permission to access the location(accept/reject)
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(3000));
//        wait.until(ExpectedConditions.alertIsPresent());
//        driver.switchTo().alert().accept();
//        driver.quit();

    }
}
