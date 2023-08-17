package Odevler._03_Selenium_XPath;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Soru_3 extends BaseDriver {
/* 1) Bu siteye gidin. -> https://www.snapdeal.com/
2) "teddy bear" aratın ve Search butonuna tıklayın.
3) Bu yazının göründüğünü doğrulayınız. -> (We've got 297 results for 'teddy bear')
Not: Bu yazıdaki sayı değişiklik gösterebilir. Önemli olan cümle kalıbı.*/
    @Test
    public void Soru3(){

driver.get("https://www.snapdeal.com/");

        WebElement searchBox=driver.findElement(By.xpath("//input[@name='keyword' and @id='inputValEnter']"));
        searchBox.sendKeys("teddy bear");
        MyFunc.wait(1);

        WebElement searchButton=driver.findElement(By.xpath("//span[@class='searchTextSpan']"));
        searchButton.click();
        MyFunc.wait(1);

        WebElement result=driver.findElement(By.xpath("//div[@id='searchMessageContainer']//span[@class='nnn']"));
        Assert.assertTrue("görünmüyor",result.getText().contains("We've got"));

        bekleVeKapat();
    }
}
