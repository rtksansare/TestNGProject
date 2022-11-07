package testng;

import org.testng.annotations.*;

public class Class3 {

    @BeforeClass
    public void beforeClass(){
        System.out.println("Before class");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Before Method");
    }

    @Test
    public void test1(){
        System.out.println("1st");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("after Method");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("After class");
    }
}
