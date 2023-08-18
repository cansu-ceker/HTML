package Odevler._02_Selenium_CssSelector;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Soru_4 extends BaseDriver {
/*Bu websitesine gidiniz. [https://testpages.herokuapp.com/styled/index.html]
Calculate'e tıklayınız.
İlk input'a herhangi bir sayı giriniz.
İkinci input'a herhangi bir sayı giriniz.
Calculate button'una tıklayınız.Sonucu alınız.Sonucu yazdırınız.*/
@Test
public void Soru4(){
    driver.get("https://testpages.herokuapp.com/styled/index.html");

    WebElement calculate=driver.findElement(By.cssSelector("[id='calculatetest']"));
    calculate.click();
    MyFunc.wait(1);

    WebElement firstInput=driver.findElement(By.cssSelector("[id='number1']"));
    firstInput.sendKeys("3");
    MyFunc.wait(1);

    WebElement secondInput=driver.findElement(By.cssSelector("[id='number2']"));
    secondInput.sendKeys("5");
    MyFunc.wait(1);

    WebElement calculateButton=driver.findElement(By.cssSelector("[id='calculate']"));
    calculateButton.click();
    MyFunc.wait(1);

    WebElement sonuc=driver.findElement(By.cssSelector("[id='answer']"));
    System.out.println(sonuc.getText());

    bekleVeKapat();








    MyFunc.wait(2);
    bekleVeKapat();
}







}
