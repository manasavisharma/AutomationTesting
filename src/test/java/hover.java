import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class hover {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\pc\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/hovers");

        Actions act = new Actions(driver);

        WebElement img1 = driver.findElement(By.xpath("//body/div[2]/div[1]/div[1]/div[1]"));
        WebElement img2 = driver.findElement(By.xpath("//body[1]/div[2]/div[1]/div[1]/div[2]/img[1]"));

        act.moveToElement(img1).perform();
        Thread.sleep(2000);
        act.moveToElement(img2).perform();
        Thread.sleep(1000);
        driver.quit();

    }
}
