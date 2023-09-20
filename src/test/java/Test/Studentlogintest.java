package Test;

import Pageobjects.LoggedPage;
import Pageobjects.StudentloginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class Studentlogintest {
   // @Test
    //public void studenlogintest() {

      public static void main(String[] args){
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://practicetestautomation.com/practice-test-login/");


        StudentloginPage loginPage = new StudentloginPage(driver);
        LoggedPage loggedPage = new LoggedPage(driver);


        loginPage.fillUsername("Admin");
        loginPage.fillPassword("admin123");
        loginPage.clickSubmit();


        loggedPage.verifyLoggedPage();

        driver.quit();

    }



}

