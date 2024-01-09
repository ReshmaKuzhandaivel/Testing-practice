package Listerner;
import org.testng.annotations.Test;


public class Myloggintest {
    Pageobjects.LoginPage loginPage;
    Pageobjects.DashboardPage dashboardPage;
    org.openqa.selenium.WebDriver driver;

    @org.testng.annotations.BeforeMethod
    public void beforeMethod() {
        driver = new org.openqa.selenium.chrome.ChromeDriver();
        driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        loginPage = new Pageobjects.LoginPage(driver);
        dashboardPage = new Pageobjects.DashboardPage(driver);
    }


    @Test
    public void loginTest1() {
        loginPage.fillUsername("Admin");
        loginPage.fillPassword("admin123");
        loginPage.clickLogin();
        dashboardPage.verifyDashboard();
    }

    @Test
    public void loginTest2() {
        loginPage.fillUsername("ganeshk");
        loginPage.fillPassword("ganesh123");
        loginPage.clickLogin();
        dashboardPage.verifyDashboard();
    }


    @org.testng.annotations.AfterMethod
    public void afterMethod() {
        driver.quit();
    }
}

