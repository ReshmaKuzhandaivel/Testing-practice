package Test;

import Pageobjects.DashboardPage;
import Pageobjects.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class Admintest {
   @Test
    public void adminlogintest() {

           WebDriver driver = new ChromeDriver();
           driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
           driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");


           LoginPage loginPage = new LoginPage(driver);
           DashboardPage dashboardPage = new DashboardPage(driver);


           loginPage.fillUsername("Admin");
           loginPage.fillPassword("admin123");
           loginPage.clickLogin();


           dashboardPage.verifyDashboard();

           // driver.quit();

       }
    @Test
    public void invalidlogintest(){

    }
    @Test
    public void userlogintest(){

    }
   }
