package Attributes;

import org.testng.annotations.DataProvider;

public class SigninTestData {
    @DataProvider(name = "Tom-Jerry")
    Object[][] loginData() {
        Object[][] data = {
                {"admin", "admin123"},
                {"Reshma", "resh123"},
                {"Sago", "sago321"},
        };


        return data;
    }
}

