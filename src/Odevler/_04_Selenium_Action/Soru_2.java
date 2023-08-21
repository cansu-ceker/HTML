package Odevler._04_Selenium_Action;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class Soru_2 extends BaseDriver {
    /*http://dhtmlgoodies.com/scripts/drag-drop-nodes/drag-drop-nodes.html
      buradaki bütün öğrencileri bütün kutucukları doldurana kadar atınız.*/
    @Test
    public void Test(){
        driver.get("http://dhtmlgoodies.com/scripts/drag-drop-nodes/drag-drop-nodes.html");
        Actions driverAct= new Actions(driver);
        MyFunc.wait(2);

        List<WebElement> ogrenciler = driver.findElements(By.xpath("//li[starts-with(@id,'node')]"));
        List<WebElement> kutucuklar = driver.findElements(By.xpath("//ul[starts-with(@id,'box')]"));


        for (WebElement o : ogrenciler) {
            for (WebElement k : kutucuklar)
            {
                driverAct.clickAndHold(o).build().perform();
                driverAct.moveToElement(k).build().perform();
                driverAct.moveToElement(k).release().build().perform();
            }
        }
        bekleVeKapat();
}
}

