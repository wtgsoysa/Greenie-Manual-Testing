package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;

    private By emailField = By.xpath("//*[@id=\"email\"]");
    private By passwordField = By.xpath("//*[@id=\"password\"]");
    private By loginButton = By.xpath("//*[@id=\"root\"]/div/div[1]/div[2]/div/form/button");

    // Optional: adjust to your dashboard element
    private By dashboardHeading = By.xpath("//*[@id=\"root\"]/div/div[1]/div/div[1]/div/nav/a[1]/span[2]");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterUsername(String username) {
        driver.findElement(emailField).sendKeys(username);
    }

    public void enterPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }

    public void clickLogin() {
        driver.findElement(loginButton).click();
    }

    public String getMainHeadingText() {
        return driver.findElement(dashboardHeading).getText();
    }
}
