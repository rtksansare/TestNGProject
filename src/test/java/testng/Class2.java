package testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Class2 {

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("before");
    }

    @Test
    public void myFirstCase(){
        System.out.println("1st");
    }


}
