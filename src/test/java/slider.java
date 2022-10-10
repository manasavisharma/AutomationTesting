import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class slider {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\SONY\\Downloads\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/horizontal_slider");

//        WebElement slider = driver.findElement(By.cssSelector(".sliderContainer"));
        WebElement slider = driver.findElement(By.xpath("//body[1]/div[2]/div[1]/div[1]/div[1]/input[1]"));
        Actions action = new Actions(driver);
        action.dragAndDropBy(slider, 100, 5).perform();
        Thread.sleep(3000);
        driver.quit();

    }
}
