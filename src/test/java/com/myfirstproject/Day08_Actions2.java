package com.myfirstproject;

import com.myfirstproject.utilities.TestBase;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static org.junit.Assert.assertTrue;

public class Day08_Actions2 extends TestBase {
    /*
Given user is on the https://www.amazon.com/
When use click on "Account" link
Then verify the page title contains "Your Account"
 */
    @Test
    public void hoverOverTest(){


    //Given user is on the https://www.amazon.com/
        driver.get("https://www.amazon.com/");
        //When use click on "Account" link
        WebElement menu= driver.findElement(By.id("nav-link-accountList"));
        //Then verify the page title contains "Your Account"
        Actions actions=new Actions(driver);
        actions.moveToElement(menu).perform();
        driver.findElement(By.linkText("Account")).click();
        assertTrue(driver.getTitle().contains("Your Account"));

    }
}
