package org.ait.qa25;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class OpenSiteTest {

    WebDriver driver;

    //before - setUp
    @BeforeMethod

    public void setUp() {
        driver = new ChromeDriver();
      //  driver.get("https://google.com");// выполняет открытие сайта без историй
        driver.navigate().to("https://google.com");// открывает с историей
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
    }

    // tests

    @Test
    public void openGoogleTest () {
        System.out.println("Site opened!!!");
    }

    //after - tearDown

    @AfterMethod
    public void tearDown () {
        // driver.quit();// закрывает браузер
        driver.close();// закрывает только одну вкладку
    }
}
