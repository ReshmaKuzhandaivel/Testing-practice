package Attributes;

import org.testng.annotations.Test;

public class GroupTest {
    @Test(groups = {"Batch 22"})
    public void Compose() {
        System.out.println("composing mail!!!");

    }

    @Test(groups = {"Batch 2 "})
    public void Openmail() {
        System.out.println("Opened");

    }

    @Test(groups = {"Batch 222"})
    public void Attachment() {
        System.out.println("Test3");
    }

    @Test(groups = {"Batch 2222"})
    public void Sentmail() {
        System.out.println("Sending mail");

    }

    @Test(groups = {"Batch 222", "Batch 2"})
    public void test1() {
        System.out.println("Testing");

}}

