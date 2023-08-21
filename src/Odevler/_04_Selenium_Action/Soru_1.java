package Odevler._04_Selenium_Action;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class Soru_1 extends BaseDriver {
    /* http://dhtmlgoodies.com/scripts/drag-drop-quiz/drag-drop-quiz-d2.html
       buradaki ülke ve şehirleri findElements ile topluca bularak bir döngü ile bütün şehirleri doğru ülkere dağıtınız.*/
    @Test
    public void Test(){
        driver.get("http://dhtmlgoodies.com/scripts/drag-drop-quiz/drag-drop-quiz-d2.html");
        Actions driverAct= new Actions(driver);
        MyFunc.wait(2);

        List<WebElement> ulkeler = driver.findElements(By.xpath("//div[@class='dragDropSmallBox' and starts-with(@id,'q')]"));
        List<WebElement> sehirler = driver.findElements(By.xpath("//div[@class='dragDropSmallBox' and starts-with(@id,'a')]"));

        for (WebElement s : sehirler) {
            String sehirId =s.getAttribute("id").replaceAll("[^0-9]","");
            for (WebElement u : ulkeler)
            { String ulkeId=u.getAttribute("id").replaceAll("[^0-9]","");
                driverAct.clickAndHold(s).build().perform();
                driverAct.moveToElement(u).build().perform();
                driverAct.moveToElement(u).release().build().perform();

                if (ulkeId.equals(sehirId))
                    break;
            }
        }
       bekleVeKapat();

    }
}
