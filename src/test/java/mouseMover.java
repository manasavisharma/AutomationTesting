import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.awt.*;

public class mouseMover {

    public static void main(String[] args) throws AWTException, InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\pc\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/exit_intent");

        Robot rb = new Robot();
//        rb.mouseMove(0, 0);
//        Thread.sleep(2000);
        rb.mouseMove(600, 0);
    }
}
