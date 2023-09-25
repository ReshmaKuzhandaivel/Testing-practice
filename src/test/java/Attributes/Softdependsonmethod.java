package Attributes;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Softdependsonmethod {

    @Test(dependsOnMethods = {"SigninTest"})
    public void sendMessageTest() {
        System.out.println("SignedIn!!!");
        try {
            Thread.sleep(5000);
        } catch (Exception e) {}
    }

    @Test(dependsOnMethods = {"SigninTest"})
    public void postPictureTest() {
        System.out.println("Test");
        try {
            Thread.sleep(5000);
        } catch (Exception e) {}
    }


    @Test(dependsOnMethods = {"SigninTest"}, alwaysRun = true)
    public void viewPictureTest() {
        System.out.println("Test");
        try {
            Thread.sleep(5000);
        } catch (Exception e) {}
    }

    @Test
    public void registerAccountTest() {
        System.out.println("Test3");
        try {
            Thread.sleep(5000);
        } catch (Exception e) {}
    }

    @Test(dependsOnMethods = {"registerAccountTest"})
    public void SigninTest() {
        System.out.println("Test4");
        Assert.fail("Intentinally failing!!!");
    }

    @Test
    public void test() {
        System.out.println("Test without dependency");
    }
}