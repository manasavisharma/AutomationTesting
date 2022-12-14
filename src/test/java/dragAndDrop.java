import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragAndDrop {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\SONY\\Downloads\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/drag_and_drop");

        WebElement frame= driver.findElement( By.id("content"));
        driver.switchTo();
        WebElement drag = driver.findElement(By.id("column-a"));
        WebElement drop = driver.findElement(By.id("column-b"));

        Actions act = new Actions(driver);
        act.dragAndDrop(drag, drop);
        Thread.sleep(2000);
        act.perform();
        driver.quit();

    }
}
