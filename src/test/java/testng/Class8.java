package testng;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.concurrent.TimeUnit;

public class Class8 {
    public WebDriver driver;

    @Test
    public void verifyLogin(){
        WebDriverManager.chromedriver().setup();
        driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement userName=driver.findElement(By.id("txtUsername"));
        WebElement password=driver.findElement(By.id("txtPassword"));

        WebElement login=driver.findElement(By.id("btnLogin"));

        String actual=driver.getCurrentUrl();
        String expected="http://hr.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";

        SoftAssert soft=new SoftAssert();

        soft.assertEquals(actual,expected);

        soft.assertTrue(userName.isDisplayed());
        soft.assertTrue(password.isDisplayed());
        soft.assertTrue(login.isDisplayed());

        soft.assertAll();

    }

}
