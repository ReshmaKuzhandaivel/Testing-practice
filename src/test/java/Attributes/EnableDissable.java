package Attributes;

import org.testng.annotations.Test;

public class EnableDissable {
    @Test(enabled = false)
    public void Me() {

        System.out.println("resh");
    }

    @Test
    public void Pisasu() {
        System.out.println("sham");

    }

    @Test(enabled = true)
    public void Egoistic() {
        System.out.println("sago");

    }

    @Test
    public void Care() {
        System.out.println("Bro");

    }
}



