package com.ait.qa28;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class TableTest {
    WebDriver driver;
    @BeforeMethod
    public void serUp() {
        driver= new ChromeDriver();
        driver.get("https://www.w3schools.com/css/css_table.asp");

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @Test
    public void tableCssTest(){
        //tr:nth-child(8) td:nth-child(3)
        //tr:nth-child(8) td:last-child
        WebElement element =driver.findElement(By.tagName("#customers tr:nth-child(8) td:last-child"));
        System.out.println(element.getText());

        System.out.println("+++++++++++++++++++++++++");

        List<WebElement> rows = driver.findElements(By.cssSelector("tr"));
        System.out.println(rows.size());
        for (WebElement el:rows){
            System.out.println(el.getText());
        }
        System.out.println("++++++++Alt-Enter++++++++++++");

    }

    @Test
    public void xpathParentTeste(){
        WebElement element = driver.findElement(By.xpath("//h1/parent"));
        System.out.println(element.getText());
        System.out.println("+++++++++++++++++++++++++");
        WebElement element1 = driver.findElement(By.xpath("//h1/parent::div"));
        System.out.println(element1.getText());
        System.out.println("+++++++++++++++++++++++++");
        WebElement element2 = driver.findElement(By.xpath("//h1/.."));
        System.out.println(element2.getText());
        //ancestor
        System.out.println("+++++++++++ancestor++++++++++++++");
        WebElement ancestor = driver.findElement(By.xpath("//h1/ancestor::*"));
        System.out.println(ancestor.getText());
        System.out.println("+++++++++++++++++++++++++");
        

    }

    //after -tearDown
    @AfterMethod(enabled = false)
    public  void tearDown(){
        driver.quit();
    }
}
