import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dom {


    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\SONY\\Downloads\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/challenging_dom");

        driver.findElement(By.xpath("//a[@id='c59275f0-2607-013b-49be-66854959dbb0']")).click();
        String buttonmessage = driver.findElement(By.id("canvas")).getText();
        System.out.println(buttonmessage);

    }
}
