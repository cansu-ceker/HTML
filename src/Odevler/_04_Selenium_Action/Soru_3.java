package Odevler._04_Selenium_Action;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class Soru_3 extends BaseDriver {
    /* http://dhtmlgoodies.com/scripts/drag-drop-nodes-quiz/drag-drop-nodes-quiz.html
       buradaki bütün şehirleri bütün ülkere doğru şekilde topluca dağıtınız.*/
    @Test
    public void Test(){
        driver.get("http://dhtmlgoodies.com/scripts/drag-drop-nodes-quiz/drag-drop-nodes-quiz.html");
        Actions driverAct= new Actions(driver);
        MyFunc.wait(2);

        List<WebElement> sehirler = driver.findElements(By.xpath("//li[starts-with(@id,'node')]"));
        List<WebElement> ulkeler = driver.findElements(By.xpath("//ul[starts-with(@id,'box')]"));


        for (WebElement s : sehirler) {
            String sehirGroupID =s.getAttribute("groupid");

            for (WebElement u : ulkeler)
            { String ulkeId=u.getAttribute("id");
                driverAct.clickAndHold(s).build().perform();
                driverAct.moveToElement(u).build().perform();
                driverAct.moveToElement(u).release().build().perform();

                if (ulkeId.equals(sehirGroupID))
                    break;
            }
        }



    }
}
