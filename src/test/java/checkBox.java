import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkBox {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\SONY\\Downloads\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/checkboxes");

        WebElement checkbox1 = driver.findElement(By.xpath("//body/div[2]/div[1]/div[1]/form[1]/input[1]"));
        WebElement checkbox2 = driver.findElement(By.xpath("//body/div[2]/div[1]/div[1]/form[1]/input[2]"));

        Thread.sleep(2000);
        if(checkbox1.isSelected()) {
            checkbox1.click();
            Thread.sleep(2000);

        }
        if (checkbox2.isSelected()) {
            checkbox2.click();
            Thread.sleep(2000);
        }

        checkbox1.click();
        Thread.sleep(1000);
        driver.quit();
    }
}
