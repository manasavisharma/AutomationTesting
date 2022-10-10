import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class wyEditor {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\SONY\\Downloads\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/tinymce");

        WebElement inputs = driver.findElement(By.xpath("//iframe[@id='mce_0_ifr']"));
        inputs.sendKeys("Content has been added");
        Thread.sleep(2000);
        driver.quit();
    }
}
