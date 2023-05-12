package com.myfirstproject;

import com.myfirstproject.utilities.TestBase;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertTrue;

public class Day09_FileUpload extends TestBase {
    /*
    Given user goes to https://the-internet.herokuapp.com/upload
    When user selects an image from the desktop
    And click on the upload button
    Then verify the File Uploaded!  Message displayed
     */
    @Test
    public void fileUploadTest() {
//Given user goes to https://the-internet.herokuapp.com/upload
        driver.get("https://the-internet.herokuapp.com/upload");
//    When user selects an image from the desktop
        String pathOfFile=System.getProperty("user.home")+"/Desktop/flower.jpeg";
        WebElement chooseFileInput=driver.findElement(By.id("file-upload"));
        chooseFileInput.sendKeys(pathOfFile);
//    And click on the upload button
        driver.findElement(By.id("file-submit")).click();
//    Then verify the File Uploaded!  Message displayed
        WebElement fileUploadedMessage=driver.findElement(By.xpath("//h3"));
        assertTrue(fileUploadedMessage.isDisplayed());
    }
}
