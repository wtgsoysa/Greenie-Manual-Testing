package tests;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test; // ✅ Required

import pages.LoginPage;
import testBase.TestBase;
import utils.ExtentManager;

public class LoginTest extends TestBase {
    LoginPage loginPage;
    private ExtentTest test;

    @BeforeMethod
    public void setUp() {
        initializerDriver();
        loginPage = new LoginPage(driver);
    }

    @Test(priority = 1)
    public void testValidLogin() {
        test = ExtentManager.createTest("Login Test - Valid Credentials")
                .assignCategory("Greenie - Authentication");

        test.log(Status.INFO, "Starting test with valid credentials");

        loginPage.enterUsername("thanuga.dev@gmail.com");
        loginPage.enterPassword("thanuga.dev@gmail.com");
        loginPage.clickLogin();

        String expected = "Feed"; // Update as needed
        String actual = loginPage.getMainHeadingText();

        logStatus(expected, actual);
        Assert.assertEquals(actual, expected, "Login failed: Dashboard heading mismatch.");
    }

    @Test(priority = 2)
    public void testInvalidLogin() {
        test = ExtentManager.createTest("Login Test - Invalid Credentials")
                .assignCategory("Greenie - Authentication");

        test.log(Status.INFO, "Starting test with invalid credentials");

        loginPage.enterUsername("invalid@example.com");
        loginPage.enterPassword("wrongpass");
        loginPage.clickLogin();

        try {
            String actual = loginPage.getMainHeadingText();
            test.log(Status.FAIL, "Unexpected heading after invalid login: " + actual);
            Assert.fail("Login should fail, but heading was found: " + actual);
        } catch (Exception e) {
            test.log(Status.PASS, "Invalid login correctly prevented access to dashboard.");
        }
    }

    private void logStatus(String expected, String actual) {
        if (expected.equals(actual)) {
            test.log(Status.PASS, "Navigation success: Expected and actual = " + actual);
        } else {
            test.log(Status.FAIL, "Expected: " + expected + ", but got: " + actual);
        }
    }

    @AfterMethod
    public void tearDown() {
        ExtentManager.flushReports();
        driver.quit();
    }
}
