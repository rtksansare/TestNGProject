package testng;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Class4 {

    public WebDriver driver;

    @Test(priority = 1,enabled = true)
    public void launchBrowser(){
        WebDriverManager.chromedriver().setup();
        driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement userName=driver.findElement(By.id("txtUsername"));
        WebElement password=driver.findElement(By.id("txtPassword"));

        WebElement login=driver.findElement(By.id("btnLogin"));

        userName.sendKeys("admin");
        password.sendKeys("Hum@nhrm123");

        login.click();

        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);


    }
}
