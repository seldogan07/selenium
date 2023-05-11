package com.myfirstproject;

import com.myfirstproject.utilities.TestBase;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Day_08Actions4 extends TestBase {
    /*
Given user is on https://jqueryui.com/droppable/
And user moves the target element(Drag me to my target) in to destination(Drop here)
Then verify it is "Dropped!"
 */
    @Test
    public void dragAndDropTest(){

        //Given user is on https://jqueryui.com/droppable/
        driver.get("https://jqueryui.com/droppable/");
        //And user moves the target element(Drag me to my target) in to destination(Drop here)
        driver.switchTo().frame(0);
        WebElement source=driver.findElement(By.id("draggable"));
        WebElement target= driver.findElement(By.id("droppable"));

        new Actions(driver).dragAndDrop(source,target).perform();
        //Then verify it is "Dropped!"
        assertEquals("Dropped!",target.getText());

    }
    @Test
    public void dragAndDropByTest() {
        driver.get("https://jqueryui.com/droppable/");
        driver.switchTo().frame(0);
        WebElement source=driver.findElement(By.id("draggable"));
        Actions actions=new Actions(driver);

        actions.dragAndDropBy(source,434,253).perform();
    }
    @Test
    public void clickAndHoldTest(){
        driver.get("https://jqueryui.com/droppable/");
        driver.switchTo().frame(0);
        WebElement source=driver.findElement(By.id("draggable"));
        WebElement target= driver.findElement(By.id("droppable"));
        Actions actions=new Actions(driver);
        actions.clickAndHold(source).moveToElement(target).build().perform();
        assertEquals("Drop here",target.getText());


    }
}
