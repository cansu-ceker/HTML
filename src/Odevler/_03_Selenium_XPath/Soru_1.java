package Odevler._03_Selenium_XPath;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Soru_1 extends BaseDriver {

/* 1) Bu siteye gidin. -> http://demoqa.com/text-box
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

        WebElement nameBox=driver.findElement(By.xpath("//input[@id='userName']"));
        nameBox.sendKeys("Automation");
        MyFunc.wait(2);

        WebElement mailBox=driver.findElement(By.xpath("//input[@id='userEmail']"));
        mailBox.sendKeys("Testing@gmail.com");
        MyFunc.wait(2);

        WebElement address=driver.findElement(By.xpath("//*[@id='currentAddress']"));
        address.sendKeys("Testing Current Address");
        MyFunc.wait(2);

        WebElement adres=driver.findElement(By.xpath("//*[@id='permanentAddress']"));
        adres.sendKeys("Testing Permanent Address");
        MyFunc.wait(2);

        WebElement submitButton=driver.findElement(By.xpath("//*[@id='submit']"));
        submitButton.click();
        MyFunc.wait(2);

        WebElement gorunenName=driver.findElement(By.xpath("//p[@class='mb-1' and @id='name']"));
        String arananisim=gorunenName.getText();
        System.out.println("gorunenName = " + gorunenName.getText());
        MyFunc.wait(2);
        Assert.assertTrue("bulunamadı",arananisim.contains("Automation"));


        WebElement varMı=driver.findElement(By.xpath("//p[@class='mb-1' and @id='email']"));
        String aranan=varMı.getText();
        System.out.println("varMı = " + varMı.getText());
        MyFunc.wait(2);
        Assert.assertTrue("bulunamadıııı",aranan.contains("Testing"));



        MyFunc.wait(2);
        bekleVeKapat();
    }






}
