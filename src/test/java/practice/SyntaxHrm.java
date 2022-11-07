package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import utils.CommonMethods;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class SyntaxHrm extends CommonMethods {

    @Test(groups = "regression")
    public void editUserDetails(){
        WebElement userName=driver.findElement(By.id("txtUsername"));
        WebElement password=driver.findElement(By.id("txtPassword"));

        WebElement login=driver.findElement(By.id("btnLogin"));

        userName.sendKeys("admin");
        password.sendKeys("Hum@nhrm123");

        login.click();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.findElement(By.id("menu_pim_viewPimModule")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.findElement(By.id("menu_pim_viewEmployeeList")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.findElement(By.id("empsearch_id")).clear();
        driver.findElement(By.id("empsearch_id")).sendKeys("7534661");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //Search
        driver.findElement(By.id("searchBtn")).click();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

        //Open Employee Page
        driver.findElement(By.xpath("(//tr[@class='odd']/td/a)[1]")).click();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

        //Click edit Button
        driver.findElement(By.id("btnSave")).click();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

        //First Name
        driver.findElement(By.id("personal_txtEmpFirstName")).clear();
        driver.findElement(By.id("personal_txtEmpFirstName")).sendKeys("Rtk");

        //Middle Name
        driver.findElement(By.id("personal_txtEmpMiddleName")).clear();
        driver.findElement(By.id("personal_txtEmpMiddleName")).sendKeys("Rocks");
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

        //Last Name
        driver.findElement(By.id("personal_txtEmpLastName")).clear();
        driver.findElement(By.id("personal_txtEmpLastName")).sendKeys("Fire");
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

        //Order Id
        driver.findElement(By.id("personal_txtOtherID")).clear();
        driver.findElement(By.id("personal_txtOtherID")).sendKeys("110022");
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

        //Driver Licence
        driver.findElement(By.id("personal_txtLicenNo")).clear();
        driver.findElement(By.id("personal_txtLicenNo")).sendKeys("99934424");
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

        //Licence Expiry Date
        driver.findElement(By.xpath("(//img[@class='ui-datepicker-trigger'])[1]")).click();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

        //Select Month
        WebElement month_licence=driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
        Select s1=new Select(month_licence);
        s1.selectByIndex(10);
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

        //Select Year
        WebElement year_licence=driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
        Select s2=new Select(year_licence);
        s2.selectByVisibleText("2016");
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

        //Select Date
        List<WebElement> list=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td/a"));
        for (WebElement w:list
             ) {
            if (w.getText().equals("13")){
                w.click();
            }
        }
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

        //SSN Number
        driver.findElement(By.id("personal_txtNICNo")).clear();
        driver.findElement(By.id("personal_txtNICNo")).sendKeys("23424225");
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

        //SIN Number
        driver.findElement(By.id("personal_txtSINNo")).clear();
        driver.findElement(By.id("personal_txtSINNo")).sendKeys("454656");
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

        //Gender
        driver.findElement(By.id("personal_optGender_1")).click();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

        //Marital Status
        WebElement maritalStatus=driver.findElement(By.id("personal_cmbMarital"));
        Select s3=new Select(maritalStatus);
        s3.selectByVisibleText("Single");
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

        //Nationality
        WebElement nationality=driver.findElement(By.id("personal_cmbNation"));
        Select s4=new Select(nationality);
        s4.selectByVisibleText("Indian");
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

        //Date of Birth

        driver.findElement(By.xpath("(//img[@class='ui-datepicker-trigger'])[2]")).click();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

        //Select Month
        WebElement month_licence2=driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
        Select s5=new Select(month_licence2);
        s5.selectByIndex(7);
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

        //Select Year
        WebElement year_licence2=driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
        Select s6=new Select(year_licence2);
        s6.selectByVisibleText("2000");
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

        //Select Date
        List<WebElement> list2=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td/a"));
        for (WebElement w:list2
        ) {
            if (w.getText().equals("13")){
                w.click();
            }
        }
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

        //Nickname
        driver.findElement(By.id("personal_txtEmpNickName")).clear();
        driver.findElement(By.id("personal_txtEmpNickName")).sendKeys("Krish");
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

        //Smoker Tag
        driver.findElement(By.id("personal_chkSmokeFlag")).click();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

        //Military Service
        driver.findElement(By.id("personal_txtMilitarySer")).clear();
        driver.findElement(By.id("personal_txtMilitarySer")).sendKeys("Yes");
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

        //Click Save Button
        driver.findElement(By.id("btnSave")).click();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

    }
}
