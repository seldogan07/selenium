package com.myfirstproject;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static org.junit.Assert.assertTrue;

public class Day05_CheckBox {
    /*
 Go to https://testcenter.techproeducation.com/index.php?page=checkboxes
 Click on checkbox1 if box is not selected
 Click on checkbox2 if box is not selected
 */
    WebDriver driver;

    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @After
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
    @Test
    public void checkBox() throws InterruptedException {
        driver.get("https://testcenter.techproeducation.com/index.php?page=checkboxes");
        WebElement box1= driver.findElement(By.id("box1"));
            if (!box1.isSelected()){
                Thread.sleep(3000);
            box1.click();
        }
        assertTrue(box1.isSelected());

        WebElement box2= driver.findElement(By.id("box2"));
        if (!box2.isSelected()){
            box2.click();
        }
        assertTrue(box2.isSelected());

    }

}
