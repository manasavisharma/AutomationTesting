import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class basicAuth {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/");

        driver.findElement(By.xpath("//a[contains(text(),'Basic Auth')]")).click();

        Alert alt = driver.switchTo().alert();
        String altmsg = driver.switchTo().alert().getText();
        Thread.sleep(2000);
        System.out.println(altmsg);
        Thread.sleep(2000);
        alt.accept();

        //press tab
        //enter password
        //press tab and click on sign in button
        //or press tab 2 times to cancel the login
        
    }

}
