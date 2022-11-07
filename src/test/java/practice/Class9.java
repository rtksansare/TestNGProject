package practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.concurrent.TimeUnit;

public class Class9 {
    public WebDriver driver;


    @Test
    public void verifylogin() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement username = driver.findElement(By.xpath("//*[@name='username']"));
        username.sendKeys("Admin");
        WebElement pswd = driver.findElement(By.xpath("//*[@name='password']"));
        pswd.sendKeys("admin123");
        WebElement login = driver.findElement(By.xpath("//*[@type='submit']"));
        login.click();
        WebElement admin = driver.findElement(By.xpath("//*[@class='oxd-text oxd-text--span oxd-main-menu-item--name']"));
        admin.click();
        WebElement head = driver.findElement(By.xpath("//*[@class='oxd-topbar-header-breadcrumb']/h6[1]"));
        WebElement head1 = driver.findElement(By.xpath("//*[@class='oxd-topbar-header-breadcrumb']/h6[2]"));
        WebElement nav1 = driver.findElement(By.xpath("//*[@class='oxd-topbar-body-nav-tab --parent --visited']/span"));
        WebElement nav2 = driver.findElement(By.xpath("//*[@class='oxd-topbar-body-nav-tab --parent']/span[1]"));
        WebElement nav3 = driver.findElement(By.xpath("//*[@class='oxd-topbar-body']/nav/ul/li[3]/span"));
        WebElement nav4 = driver.findElement(By.xpath("//*[@class='oxd-topbar-body']/nav/ul/li[4]/span"));
        WebElement nav5 = driver.findElement(By.xpath("//*[@class='oxd-topbar-body']/nav/ul/li[5]/a"));
        WebElement nav6 = driver.findElement(By.xpath("//*[@class='oxd-topbar-body']/nav/ul/li[6]/a"));
        WebElement nav7 = driver.findElement(By.xpath("//*[@class='oxd-topbar-body']/nav/ul/li[7]/span"));
        WebElement Employeename = driver.findElement(By.xpath("//input[@placeholder='Type for hints...']"));
        WebElement searchbtn = driver.findElement(By.xpath("//button[@type='submit']"));
        SoftAssert soft = new SoftAssert();
        String actual ="Admin";
        String expected = head.getText();
        System.out.println(expected);
        soft.assertEquals(actual,expected);
        String actualt = "User Management";
        String expected1 = head1.getText();
        System.out.println(expected1);
        soft.assertEquals(actualt,expected1);
        //nav1
        soft.assertTrue(nav1.isDisplayed());
        //nav2
        soft.assertTrue(nav2.isDisplayed());
        //nav3
        soft.assertTrue(nav3.isDisplayed());
        //nav4
        soft.assertTrue(nav4.isDisplayed());
        //nav5
        String actual5 = "Nationalities";
        String expect5 = nav5.getText();
        System.out.println(expect5);
        soft.assertEquals(actual5,expect5);
        //nav6
        String actual6 = "Corporate Branding";
        String expect6 = nav6.getText();
        System.out.println(expect6);
        soft.assertEquals(actual6,expect6);
        //nav7
        soft.assertTrue(nav7.isDisplayed());
        soft.assertTrue(Employeename.isDisplayed());
        soft.assertTrue(searchbtn.isDisplayed());
        soft.assertAll();
    }





    }

