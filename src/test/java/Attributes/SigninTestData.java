package Attributes;

import org.testng.annotations.DataProvider;

public class SigninTestData {
    @DataProvider(name = "Tom-Jerry")
    Object[][] loginData() {
        Object[][] data = {
                {"admin", "admin20"},
                {"Reshma", "resh10"},
                {"Sago", "sago30"},
        };


        return data;
    }
}

