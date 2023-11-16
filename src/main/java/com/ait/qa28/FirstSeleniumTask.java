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

public class FirstSeleniumTask {
WebDriver driver;

@BeforeMethod
public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://telranedu.web.app/login");
        //maximize browser to window
        driver.manage().window().maximize();
        //
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        }

@Test
public void findElementByTagTest() {
    WebElement element =driver.findElement(By.tagName(("h1")));
    System.out.println(element.getText());
    WebElement element1 = driver.findElement(By.tagName("a"));
    System.out.println(element1.getText());
    List<WebElement> elements = driver.findElements(By.tagName("a"));
    System.out.println(elements.size());
}

    @Test
    public void findElementTest() {
        System.out.println("++++++++++++By.id(root)++++++++++++++");
        WebElement element =driver.findElement(By.id(("root")));
        System.out.println(element.getText());
        System.out.println("++++++++++++By.className++++++++++++++");
        WebElement element1 = driver.findElement(By.className("login_login__3EHKB"));
        System.out.println(element1.getText());
        System.out.println("++++++++++++By.name++++++++++++++");
        WebElement element2 = driver.findElement(By.name("email"));
        System.out.println(element2.getAttribute("name"));
        System.out.println("++++++++++++By.linktext++++++++++++++");
        WebElement element3 = driver.findElement(By.linkText("LOGIN"));
        System.out.println("++++++++++++By.partialinktext++++++++++++++");
        System.out.println(element3.getAttribute("name"));
        WebElement element4 = driver.findElement(By.partialLinkText("LOG"));
        System.out.println(element4.getAttribute("name"));
    }
    @Test
    public void findElementByCssTest() {
        System.out.println("++++++++++++By.cssSelectort++++++++++++++");
        WebElement element =driver.findElement(By.cssSelector("h1"));
        System.out.println(element.getText());

        WebElement element1 = driver.findElement(By.cssSelector("#root"));
        System.out.println(element1.getText());

        System.out.println("++++++++++++By.css className++++++++++++++");
        WebElement element2 = driver.findElement(By.cssSelector(".login_login__3EHKB"));
        System.out.println(element2.getText());

        //[attribute='value']
        driver.findElement(By.cssSelector("[name='email']"));

        //[placeholder*='ssw']
        driver.findElement(By.cssSelector("[placeholder*='ssw']"));
        //start
        driver.findElement(By.cssSelector("[placeholder^='Pas']"));
        //end to
        //start
        driver.findElement(By.cssSelector("[placeholder$='word']"));

    }

    @Test
    public void findElementByXpath() {
    //xpath-->//
        WebElement element =driver.findElement(By.xpath(("//h1")));
        System.out.println(element.getText());

        WebElement element1 =driver.findElement(By.xpath(("//div[@id='root']")));
        System.out.println(element1.getText());

        WebElement element2 =driver.findElement(By.xpath(("//div[@class='login_login__3EHKB']")));
        System.out.println(element2.getText());

        //contains --> //*[contains(.,'Text')]
        driver.findElement(By.xpath("//button[contains(.,'Registration')]"));

        driver.findElement(By.xpath("//button[starts-with(@name,'reg')]"));

    }
    }