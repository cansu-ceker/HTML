package Odevler._03_Selenium_XPath;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Soru_5 extends BaseDriver {
/*Bu websitesine gidiniz. [https://testpages.herokuapp.com/styled/index.html]
Fake Alerts' tıklayınız.
Show Alert Box'a tıklayınız.
Ok'a tıklayınız.
Alert kapanmalıdır.*/
    @Test
    public void Soru5(){
        driver.get("https://testpages.herokuapp.com/styled/index.html");
        WebElement fake=driver.findElement(By.xpath("//a[@id='fakealerttest']"));
        fake.click();
        MyFunc.wait(1);

        WebElement show=driver.findElement(By.xpath("//input[@onclick='show_alert()']"));
        show.click();
        MyFunc.wait(1);

        WebElement ok=driver.findElement(By.xpath("//button[@id='dialog-ok']"));
        ok.click();


        MyFunc.wait(2);
        bekleVeKapat();
    }
}
