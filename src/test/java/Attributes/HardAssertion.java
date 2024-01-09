package Attributes;

import Pageobjects.DashboardPage;
import Pageobjects.StudentloginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class HardAssertion {
    StudentloginPage loginPage;
    DashboardPage dashboardPage;
    WebDriver driver;

    @BeforeMethod
    public void beforeMethod() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://practicetestautomation.com/practice-test-login/");

        loginPage = new StudentloginPage(driver);

        // loginPage = new LoginPage(driver);

    }


    @Test
    public void loginTest1() {
        loginPage.fillUsername("student");
        loginPage.fillPassword("Password123");
        loginPage.clickSubmit();
//        dashboardPage.verifyDashboard();

        try {
            Thread.sleep(5000);
        } catch (Exception e){}

        Assert.assertTrue(driver.getCurrentUrl().contains("successfully"), "You  are not matched!");

//        Assert.assertEquals("https://practicetestautomation.com/logged-in-successfully/",
  //              driver.getCurrentUrl(), "You  are not matched!!!");
      //  Assert.assertFalse(driver.getCurrentUrl().contains("successfully"), "You  are not matched!");


    }

    @Test
    public void loginTest2() {
        loginPage.fillUsername("reshmak");
        loginPage.fillPassword("resh123");
        loginPage.clickSubmit();
//        dashboardPage.verifyDashboard();
        try {
            Thread.sleep(5000);
        } catch (Exception e){}




       Assert.assertFalse(driver.getCurrentUrl().contains("successfully"), "You  are not matched!");
//        Assert.assertTrue(driver.getCurrentUrl().contains("successfully"), "You  are not matched!");

    }


    @AfterMethod
    public void afterMethod() {
        driver.quit();
    }


}

