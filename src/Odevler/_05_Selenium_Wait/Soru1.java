package Odevler._05_Selenium_Wait;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import java.util.Scanner;

public class Soru1 extends BaseDriver {
    /*
    Senaryo
    1- https://testsheepnz.github.io/BasicCalculator.html sitesine gidiniz.
    2- random 100 e kadar 2 sayı üretiniz.
    3- Sayıları hesap makinesinin bütün fonksiyonları için çalıştırınız.
    4- Sonuçları Assert ile kontrol ediniz.
    5- Yukarıdaki her işlemi 5 kez tekrar ettiriniz.
 */
    @Test
    public void TestADD(){
        driver.get("https://testsheepnz.github.io/BasicCalculator.html");



        for (int i = 0 ; i <5 ; i++) {

            int rndTamSayi= (int)(Math.random()*100);
            String x= Integer.toString(rndTamSayi);
            WebElement firstNu= driver.findElement(By.xpath("//input[@id='number1Field']"));
            firstNu.sendKeys(x);    //1. sayı girildi
            MyFunc.wait(2);


            int rndTamSayi2= (int)(Math.random()*100);
            String y= Integer.toString(rndTamSayi2);
            WebElement secondNu= driver.findElement(By.xpath("//input[@id='number2Field']"));
            secondNu.sendKeys(y);  //2. sayı girildi
            MyFunc.wait(2);


            WebElement islemler= driver.findElement(By.xpath("//select[@id='selectOperationDropdown']"));
            islemler.click();

            Select add=new Select(islemler);
            add.selectByVisibleText("Add");

            WebElement calculate= driver.findElement(By.xpath("//input[@id='calculateButton']"));
            calculate.click();

            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='numberAnswerField']")));

            WebElement answer= driver.findElement(By.xpath("//input[@id='numberAnswerField']"));
            int gercek = Integer.parseInt(answer.getAttribute("value"));
            int beklenen = rndTamSayi+rndTamSayi2;

            Assert.assertTrue("Hatalı işlem", beklenen==gercek);

            firstNu.clear();
            secondNu.clear();
        }
bekleVeKapat();

    }

    @Test
    public void TestSUBT(){
        driver.get("https://testsheepnz.github.io/BasicCalculator.html");

        for (int i = 0 ; i <5 ; i++) {

            int rndTamSayi= (int)(Math.random()*100);
            String x= Integer.toString(rndTamSayi);
            WebElement firstNu= driver.findElement(By.xpath("//input[@id='number1Field']"));
            firstNu.sendKeys(x);    //1. sayı girildi
            MyFunc.wait(2);


            int rndTamSayi2= (int)(Math.random()*100);
            String y= Integer.toString(rndTamSayi2);
            WebElement secondNu= driver.findElement(By.xpath("//input[@id='number2Field']"));
            secondNu.sendKeys(y);  //2. sayı girildi
            MyFunc.wait(2);


            WebElement islemler= driver.findElement(By.xpath("//select[@id='selectOperationDropdown']"));
            islemler.click();

            Select subtract=new Select(islemler);
            subtract.selectByVisibleText("Subtract");

            WebElement calculate= driver.findElement(By.xpath("//input[@id='calculateButton']"));
            calculate.click();

            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='numberAnswerField']")));

            WebElement answer= driver.findElement(By.xpath("//input[@id='numberAnswerField']"));
            int gercek = Integer.parseInt(answer.getAttribute("value"));
            int beklenen = rndTamSayi-rndTamSayi2;

            Assert.assertTrue("Hatalı işlem", beklenen==gercek);

            firstNu.clear();
            secondNu.clear();
        }
        bekleVeKapat();

    }

    @Test
    public void TestMULTI(){

        driver.get("https://testsheepnz.github.io/BasicCalculator.html");

        for (int i = 0 ; i <5 ; i++) {

            int rndTamSayi= (int)(Math.random()*100);
            String x= Integer.toString(rndTamSayi);
            WebElement firstNu= driver.findElement(By.xpath("//input[@id='number1Field']"));
            firstNu.sendKeys(x);    //1. sayı girildi
            MyFunc.wait(2);


            int rndTamSayi2= (int)(Math.random()*100);
            String y= Integer.toString(rndTamSayi2);
            WebElement secondNu= driver.findElement(By.xpath("//input[@id='number2Field']"));
            secondNu.sendKeys(y);  //2. sayı girildi
            MyFunc.wait(2);


            WebElement islemler= driver.findElement(By.xpath("//select[@id='selectOperationDropdown']"));
            islemler.click();

            Select multiply=new Select(islemler);
            multiply.selectByVisibleText("Multiply");

            WebElement calculate= driver.findElement(By.xpath("//input[@id='calculateButton']"));
            calculate.click();

            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='numberAnswerField']")));

            WebElement answer= driver.findElement(By.xpath("//input[@id='numberAnswerField']"));
            int gercek = Integer.parseInt(answer.getAttribute("value"));
            int beklenen = rndTamSayi*rndTamSayi2;

            Assert.assertTrue("Hatalı işlem", beklenen==gercek);

            firstNu.clear();
            secondNu.clear();
        }
        bekleVeKapat();

    }
    @Test
    public void TestDIVIDE(){
        driver.get("https://testsheepnz.github.io/BasicCalculator.html");

        for (int i = 0 ; i <5 ; i++) {

            int rndTamSayi= (int)(Math.random()*100);
            String x= Integer.toString(rndTamSayi);
            WebElement firstNu= driver.findElement(By.xpath("//input[@id='number1Field']"));
            firstNu.sendKeys(x);    //1. sayı girildi
            MyFunc.wait(2);


            int rndTamSayi2= (int)(Math.random()*100);
            String y= Integer.toString(rndTamSayi2);
            WebElement secondNu= driver.findElement(By.xpath("//input[@id='number2Field']"));
            secondNu.sendKeys(y);  //2. sayı girildi
            MyFunc.wait(2);


            WebElement islemler= driver.findElement(By.xpath("//select[@id='selectOperationDropdown']"));
            islemler.click();

            Select divide=new Select(islemler);
            divide.selectByVisibleText("Divide");

            WebElement calculate= driver.findElement(By.xpath("//input[@id='calculateButton']"));
            calculate.click();

            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='numberAnswerField']")));

            WebElement answer= driver.findElement(By.xpath("//input[@id='numberAnswerField']"));
            double gercek =Double.parseDouble(answer.getAttribute("value"));
            double beklenen = (double)rndTamSayi/rndTamSayi2;

            Assert.assertTrue("Hatalı işlem", beklenen==gercek);

            firstNu.clear();
            secondNu.clear();
        }
        bekleVeKapat();

    }

    @Test
    public void TestCONCA(){

        driver.get("https://testsheepnz.github.io/BasicCalculator.html");

        for (int i = 0 ; i <5 ; i++) {

            int rndTamSayi= (int)(Math.random()*100);
            String x= Integer.toString(rndTamSayi);
            WebElement firstNu= driver.findElement(By.xpath("//input[@id='number1Field']"));
            firstNu.sendKeys(x);    //1. sayı girildi
            MyFunc.wait(2);


            int rndTamSayi2= (int)(Math.random()*100);
            String y= Integer.toString(rndTamSayi2);
            WebElement secondNu= driver.findElement(By.xpath("//input[@id='number2Field']"));
            secondNu.sendKeys(y);  //2. sayı girildi
            MyFunc.wait(2);


            WebElement islemler= driver.findElement(By.xpath("//select[@id='selectOperationDropdown']"));
            islemler.click();

            Select concatenate=new Select(islemler);
            concatenate.selectByVisibleText("Concatenate");

            WebElement calculate= driver.findElement(By.xpath("//input[@id='calculateButton']"));
            calculate.click();

            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='numberAnswerField']")));

            WebElement answer= driver.findElement(By.xpath("//input[@id='numberAnswerField']"));


            Assert.assertTrue("Hatalı işlem", (x+y).equals(answer.getAttribute("value")));

            firstNu.clear();
            secondNu.clear();
        }
        bekleVeKapat();

    }

}
