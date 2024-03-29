package com.myfirstproject;

import com.myfirstproject.utilities.TestBase;
import org.junit.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class Day08_Actions3 extends TestBase {
     /*
    Given user is on the https://www.amazon.com/
    Scroll the page down
    Scroll the page up
     */

    @Test
    public void scrollTest() throws InterruptedException {

//        Given user is on the https://www.amazon.com/
        driver.get("https://www.amazon.com/");
//        Scroll the page down
        Actions actions=new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(2000);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(2000);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(2000);
        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).build().perform();

//        Scroll the page up

        actions.sendKeys(Keys.PAGE_UP).perform();
        Thread.sleep(2000);
        actions.sendKeys(Keys.PAGE_UP).perform();
        Thread.sleep(2000);
        actions.sendKeys(Keys.PAGE_UP).perform();

Thread.sleep(2000);
actions.sendKeys(Keys.PAGE_DOWN).perform();
Thread.sleep(2000);
actions.sendKeys(Keys.ARROW_DOWN).perform();
        Thread.sleep(2000);
        actions.sendKeys(Keys.ARROW_UP).perform();
        Thread.sleep(2000);
        actions.sendKeys(Keys.ARROW_UP).perform();

    }
}