package com.myfirstproject;

import com.myfirstproject.utilities.TestBase;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;



import static org.junit.Assert.assertTrue;

public class Day_06DynamicXpath extends TestBase{
    @Test
    public void dynamicXpathTest() throws InterruptedException {
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        String userNameText=driver.findElement(By.id("text")).getText();
    }
}
