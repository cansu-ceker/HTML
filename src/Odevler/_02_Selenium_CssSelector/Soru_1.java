package Odevler._02_Selenium_CssSelector;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Soru_1 extends BaseDriver {
    /*1) Bu siteye gidin. -> http://demoqa.com/text-box
2) Full Name kısmına "Automation" girin.
3) Email kısmına "Testing@gmail.com" girin.
4) Current Address kısmına "Testing Current Address" girin.
5) Permanent Address kısmına "Testing Permanent Address" girin.
6) Submit butonuna tıklayınız.
7) Full Name'in, "Automation"ı içinde bulundurduğunu doğrulayın.
8) Email'in, "Testing"ı içinde bulundurduğunu doğrulayın.*/
    @Test
    public void Soru1(){
        driver.get("http://demoqa.com/text-box");

        WebElement nameBox=driver.findElement(By.cssSelector("[id='userName']"));
        nameBox.sendKeys("Automation");
        MyFunc.wait(2);

        WebElement mailBox=driver.findElement(By.cssSelector("[id='userEmail']"));
        mailBox.sendKeys("Testing@gmail.com");
        MyFunc.wait(2);

        WebElement address=driver.findElement(By.cssSelector("[id='currentAddress']"));
        address.sendKeys("Testing Current Address");
        MyFunc.wait(2);

        WebElement adres=driver.findElement(By.cssSelector("[id='permanentAddress']"));
        adres.sendKeys("Testing Permanent Address");
        MyFunc.wait(2);

        WebElement submitButton=driver.findElement(By.cssSelector("[id='submit']"));
        submitButton.click();
        MyFunc.wait(2);

        WebElement gorunenName=driver.findElement(By.cssSelector("[class='mb-1'][id='name']"));
        String arananisim=gorunenName.getText();
        System.out.println("gorunenName = " + gorunenName.getText());
        MyFunc.wait(2);
        Assert.assertTrue("bulunamadı",arananisim.contains("Automation"));


        WebElement varMi=driver.findElement(By.cssSelector("[class='mb-1'][id='email']"));
        String aranan=varMi.getText();
        System.out.println("varMı = " + varMi.getText());
        MyFunc.wait(2);
        Assert.assertTrue("bulunamadıııı",aranan.contains("Testing"));

        MyFunc.wait(2);
        bekleVeKapat();
    }








}
