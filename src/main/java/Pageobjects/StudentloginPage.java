package Pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class StudentloginPage {
    WebDriver driver;
    private static final By USERNAME = By.name("username");
    private static final By PASSWORD = By.xpath("//input[@name='password']");
    private static final By SUBMIT_BUTTON = By.xpath("//button[normalize-space()='Submit']");


    public StudentloginPage(WebDriver rdriver) {
        driver = rdriver;
    }


    public void fillUsername(String username) {

        driver.findElement(USERNAME).clear();
        driver.findElement(USERNAME).sendKeys(username);
        driver.findElement(PASSWORD).clear();
    }

    public void fillPassword(String password) {

        driver.findElement(PASSWORD).sendKeys(password);

    }

    public void clickSubmit()
    {

        driver.findElement(SUBMIT_BUTTON).click();
    }

}


