package Pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    
        WebDriver driver;
        private static final By USERNAME = By.name("username");
        private static final By PASSWORD = By.xpath("//input[@name='password']");
        private static final By LOGIN_BUTTON = By.xpath("//button[normalize-space()='Login']");


        public LoginPage(WebDriver rdriver) {
            driver = rdriver;
        }


        public void fillUsername(String username) {

            driver.findElement(USERNAME).clear();
            driver.findElement(USERNAME).sendKeys(username);
        }

        public void fillPassword(String password) {
            driver.findElement(PASSWORD).clear();
            driver.findElement(PASSWORD).sendKeys(password);
        }

        public void clickLogin()
        {
            driver.findElement(LOGIN_BUTTON).click();
        }

    }
