package Attributes;

import org.testng.annotations.*;

public class Hooks {
    @BeforeMethod
    public void beforeSelection() {
        System.out.println("Before Selection! ");
    }

    @BeforeClass
    public void beforeTraining() {
        System.out.println("Before Training!");
    }

    @BeforeTest
    public void beforeJob() {
        System.out.println("Before Job!");
    }

    @BeforeSuite
    public void beforeOffice() {
        System.out.println("Before Office!");
    }




    @Test
    public void test1(){
        System.out.println("Test 1");
    }

    @Test
    public void test2(){
        System.out.println("Test 2");
    }


    // After hooks - post conditions
    @AfterMethod
    public void afterSelection() {
        System.out.println("After Selection!");
    }

    @AfterClass
    public void afterTraining() {
        System.out.println("After Training!");
    }

    @AfterTest
    public void afterJob() {
        System.out.println("After Job!");
    }

    @AfterSuite
    public void afterOffice() {
        System.out.println("After Office!");
    }
}


