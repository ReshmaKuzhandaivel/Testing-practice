package Attributes;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider {
        @Test
    public void loginTest1(){
        System.out.println("admin" + "admin123");
    }

    @Test
    public void loginTest2(){
        System.out.println("Reshma" + "resh123");
    }

    @Test
    public void loginTest3(){
        System.out.println("Sago" + "sago321");
    }
//
//    @Test(dataProvider = "login-data")
//    public void loginTest(String username, String password){
//        System.out.println( username + " " + password);
//    }
//
//    @Test(dataProvider = "Tom-Jerry", dataProviderClass = SigninTestData.class)
//    public void signInTest(String username, String password){
//        System.out.println( username + " " + password);
//    }
//
//
//    @DataProvider(name = "login-data")
//    Object[][] loginData() {
//        Object[][] data = {
//                {"admin", "admin123"},
//                {"Reshma", "resh123"},
//                {"Sago", "sago321"},
//        };
//        return data;
  //  }

}

