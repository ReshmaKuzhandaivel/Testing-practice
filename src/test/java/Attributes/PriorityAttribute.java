package Attributes;

import org.testng.annotations.Test;

public class PriorityAttribute {

    @Test(priority = 2)
    public void Me() {
    System.out.println("resh");
}

    @Test(priority = 3)
    public void Pisasu() {
        System.out.println("sham");
    }

    @Test
//    @Test(priority = 0) // default priority 0
    public void Egoistic() {
        System.out.println("sago");
    }

    @Test(priority = 1)
    public void Care() {
        System.out.println("Bro");
    }
}
