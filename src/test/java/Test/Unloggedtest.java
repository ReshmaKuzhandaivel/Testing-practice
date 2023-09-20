package Test;

import Pageobjects.LoggedPage;
import Pageobjects.StudentloginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Unloggedtest {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://practicetestautomation.com/practice-test-login/");

        StudentloginPage studentloginPage = new StudentloginPage(driver);
        LoggedPage loggedPage=new LoggedPage(driver);
        // DashboardPage dashboardPage = new DashboardPage(driver);

        studentloginPage.fillUsername("Admin");
        studentloginPage.fillPassword("admin123");
        studentloginPage.clickSubmit();

        loggedPage.verifyLoggedPage();
        // dashboardPage.verifyDashboard();

//        driver.quit();
    }
}

