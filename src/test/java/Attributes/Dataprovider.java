package Attributes;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider {
        @Test
    public void loginTest1(){
        System.out.println("admin" + "admin20");
    }

    @Test
    public void loginTest2(){
        System.out.println("Reshma" + "resh10");
    }

    @Test
    public void loginTest3(){
        System.out.println("Sago" + "sago30");
    }

    @Test(dataProvider = "Tom-Jerry")
    public void loginTest(String username, String password){
        System.out.println( username + " " + password);
    }

    @Test(dataProvider = "Tom-Jerry", dataProviderClass = SigninTestData.class)
    public void signInTest(String username, String password){
        System.out.println( username + " " + password);
    }


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

