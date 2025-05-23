package testBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class TestBase {
    public static WebDriver driver;

    public void initializerDriver() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("http://localhost:5173/login"); // 🔁 Update if deployed
    }

    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
