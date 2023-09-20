package Pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoggedPage {
    WebDriver ldriver;
    public LoggedPage(WebDriver rdriver) {
        ldriver = rdriver;
    }

    public void verifyLoggedPage() {
        WebDriverWait wait = new WebDriverWait(ldriver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.urlContains("logged"));

        String actual_url = ldriver.getCurrentUrl();
        System.out.println(actual_url);
        String expected_url = "https://practicetestautomation.com/practice-test-login/";

        if(expected_url.equals(actual_url)) {
            System.out.println("Matching...");
        } else {
            System.out.println("Not matching...");
        }

        try {
            Thread.sleep(2000);
        } catch (Exception e){}

    }


}





