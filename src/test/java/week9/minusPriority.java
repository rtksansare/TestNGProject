package week9;

import org.testng.annotations.Test;

public class minusPriority {




    @Test(priority = 0)
    public void hello(){
        System.out.println("0 Priority");
    }

    @Test(priority = -20)
    public void minus2(){
        System.out.println("-20 priority");
    }


    @Test(priority = 15)
    public void hi(){
        System.out.println("15 priority");
    }

    @Test(priority = -1)
    public void minus(){
        System.out.println("-1 priority");
    }
}
