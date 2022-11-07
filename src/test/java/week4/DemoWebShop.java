package week4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utils.CommonMethods;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class DemoWebShop{
 public WebDriver driver;
    @Test
    public void login(){
        //Opening the browser and navigate to the url
        WebDriverManager.chromedriver().setup();
        driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https://demowebshop.tricentis.com/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //Assertion
        SoftAssert soft=new SoftAssert();

        //Login Code
        soft.assertTrue(driver.findElement(By.xpath("//*[text()='Log in']")).isDisplayed());
        driver.findElement(By.xpath("//*[text()='Log in']")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //Fill Email
        soft.assertTrue(driver.findElement(By.cssSelector("input#Email")).isDisplayed());
        driver.findElement(By.cssSelector("input#Email")).sendKeys("abc19082000@gmail.com");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //Fill Password
        soft.assertTrue(driver.findElement(By.cssSelector("input#Password")).isDisplayed());
        driver.findElement(By.cssSelector("input#Password")).sendKeys("Hum@n@1908");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //Click on Login Button
        soft.assertTrue(driver.findElement(By.xpath("//input[@value='Log in']")).isDisplayed());
        driver.findElement(By.xpath("//input[@value='Log in']")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
/*
    @Test(dependsOnMethods = "login")
    public void addProductToCart(){

        //Assertion
        SoftAssert soft=new SoftAssert();

        //add to cart function
        soft.assertTrue(driver.findElement(By.xpath("(//input[@value='Add to cart'])[1]")).isDisplayed());
        driver.findElement(By.xpath("(//input[@value='Add to cart'])[1]")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        WebElement recipientName=driver.findElement(By.cssSelector("input#giftcard_2_RecipientName"));
        soft.assertTrue(recipientName.isDisplayed());
        recipientName.sendKeys("abc");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement recipientEmail=driver.findElement(By.cssSelector("input#giftcard_2_RecipientEmail"));
        soft.assertTrue(recipientEmail.isDisplayed());
        recipientEmail.sendKeys("abc19082000@gmail.com");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        soft.assertTrue(driver.findElement(By.cssSelector("input#add-to-cart-button-2")).isDisplayed());
        driver.findElement(By.cssSelector("input#add-to-cart-button-2")).click();

    }
*/
    /*
    @Test(dependsOnMethods = "addProductToCart")
    public void checkProductAddedToShippingCartOrNot(){

        //Assertion
        SoftAssert soft=new SoftAssert();

        //Check Shopping Cart
        soft.assertTrue(driver.findElement(By.xpath("//span[@class='cart-label']")).isDisplayed());
        driver.findElement(By.xpath("//span[@class='cart-label']")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        List<WebElement> list=driver.findElements(By.xpath("//td[@class='product']/a"));

        String expected="$25 Virtual Gift Card";
        String actual="";
        for (WebElement w:list
             ) {
            actual=w.getText();
            soft.assertEquals(actual,expected);

            if (actual.equalsIgnoreCase(expected)){
                System.out.println("Product is Added Successfully to the cart");
            }
        }

    }
    */

    @Test(dependsOnMethods = "login")
    public void search(){
        driver.findElement(By.id("small-searchterms")).clear();
        driver.findElement(By.id("small-searchterms")).sendKeys("computer");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.findElement(By.xpath("(//input[@type='submit'])[1]")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        List<WebElement> list=driver.findElements(By.xpath("//div[@class='details']/h2/a"));
        int a=1;
        String s="(//input[@value='Add to cart'])"+"["+a+"]";
        for (WebElement w:list
             ) {
            if(w.getText().equalsIgnoreCase("Simple Computer")){
                System.out.println(a);
                driver.findElement(By.xpath(s)).click();
            }
            a++;
        }
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }
}
