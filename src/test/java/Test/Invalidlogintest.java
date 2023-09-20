package Test;

import Pageobjects.DashboardPage;
import Pageobjects.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class Invalidlogintest {
    @Test
    public void invalidlogintest() {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");


        LoginPage loginPage = new LoginPage(driver);
        DashboardPage dashboardPage = new DashboardPage(driver);


        loginPage.fillUsername("Reshma");
        loginPage.fillPassword("resh123");
        loginPage.clickLogin();


        dashboardPage.verifyDashboard();

        driver.quit();

    }



}


