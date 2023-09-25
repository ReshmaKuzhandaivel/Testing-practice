package Attributes;

import org.testng.annotations.Test;

public class Invocationcount {
    @Test(invocationCount = 8)
    public void Me() {

        System.out.println("resh");
    }

    @Test
    public void Pisasu() {
        System.out.println("sham");

    }

    @Test(invocationCount = 8)
    public void Egoistic() {
        System.out.println("sago");

    }

    @Test
    public void Care() {
        System.out.println("Bro");

    }
}


