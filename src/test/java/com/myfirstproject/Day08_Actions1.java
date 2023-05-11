package com.myfirstproject;

import com.myfirstproject.utilities.TestBase;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

import static org.junit.Assert.assertEquals;

public class Day08_Actions1 extends TestBase {
    /*
Given go to https://testcenter.techproeducation.com/index.php?page=context-menu
When use right-click on the box
Then verify the alert message is "You selected a context menu"
And accept the alert
 */

    @Test
    public void contextClickTest(){
        //Given go to https://testcenter.techproeducation.com/index.php?page=context-menu
        driver.get("https://testcenter.techproeducation.com/index.php?page=context-menu");
                //When use right-click on the box
        WebElement box=driver.findElement(By.id("hot-spot"));
        //
        Actions actions=new Actions(driver);
        actions.contextClick(box).perform();

//Then verify the alert message is "You selected a context menu"
        String alertMessage=driver.switchTo().alert().getText();
        assertEquals("You selected a context menu",alertMessage);
//And accept the alert
        driver.switchTo().alert().accept();
    }
}
