import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class keyPress {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\SONY\\Downloads\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/key_presses");
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement targets = driver.findElement(By.id("target"));
        targets.sendKeys(Keys.ALT);

        String txt = driver.findElement(By.xpath("//p[@id='result']")).getText();
        System.out.println(txt);
        Thread.sleep(2000);
        driver.quit();
    }
}
