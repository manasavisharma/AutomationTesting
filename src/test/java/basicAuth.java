import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class basicAuth {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\SONY\\Downloads\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
//        driver.get("https://the-internet.herokuapp.com/");

        //Set the username
        String username = "admin";

        //Set the password
        String password = "admin";


        String URL = "https://" +username +":" +password +"@"+ "the-internet.herokuapp.com/basic_auth";
        driver.get(URL);

        driver.manage().timeouts().pageLoadTimeout(Duration.ofMillis(2000));
        String title = driver.getTitle();

        System.out.println("The page title is "+title);
        String text = driver.findElement(By.tagName("p")).getText();
        System.out.println("The test present in page is ==> "+text);

        driver.close();
        driver.quit();
        
    }

}
