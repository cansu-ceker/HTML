package Odevler._02_Selenium_CssSelector;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Soru_6 extends BaseDriver {
/*Bu siteye gidiniz. https://testpages.herokuapp.com/styled/index.html

Fake Alerts'e tıklayınız.

Show modal dialog buttonuna tıklayınız.

Ok'a tıklayınız.

Alert kapanmalıdır.*/
@Test
public void Soru6(){
    driver.get("https://testpages.herokuapp.com/styled/index.html");
    WebElement fake=driver.findElement(By.cssSelector("[id='fakealerttest']"));
    fake.click();
    MyFunc.wait(1);

    WebElement showModal=driver.findElement(By.cssSelector("[onclick='show_modal()']"));
    showModal.click();
    MyFunc.wait(1);

    WebElement ok=driver.findElement(By.cssSelector("[id='dialog-ok']"));
    ok.click();

    MyFunc.wait(2);
    bekleVeKapat();
}
}
