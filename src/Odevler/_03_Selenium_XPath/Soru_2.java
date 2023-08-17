package Odevler._03_Selenium_XPath;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Soru_2 extends BaseDriver {

/* 1) Bu siteye gidin. -> https://demo.applitools.com/
2) Username kısmına "ttechno@gmail.com" girin.
3) Password kısmına "techno123." girin.
4) "Sign in" buttonunan tıklayınız.
5) "Your nearest branch closes in: 30m 5s" yazısının göründüğünü doğrulayınız.*/
    @Test
    public void Soru2(){
        driver.get("https://demo.applitools.com/");

        WebElement username=driver.findElement(By.xpath("//input[@id='username']"));
        username.sendKeys("ttechno@gmail.com");
        MyFunc.wait(2);

        WebElement passwpord=driver.findElement(By.xpath("//input[@id='password']"));
        passwpord.sendKeys("techno123.");
        MyFunc.wait(2);

        WebElement signin=driver.findElement(By.xpath("//a[@id='log-in']"));
        signin.click();
        MyFunc.wait(2);

        WebElement yazi=driver.findElement(By.xpath("//h6[@id='time']"));

        Assert.assertTrue("hata",yazi.getText().contains("Your nearest branch closes in: 30m 5s"));

        bekleVeKapat();
    }
}
