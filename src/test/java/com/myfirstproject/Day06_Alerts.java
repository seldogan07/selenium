package com.myfirstproject;
import com.myfirstproject.utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
public class Day06_Alerts extends TestBase {
    @Test
    public void acceptAlert(){
/*
acceptAlert() => click on the first alert,
verify the text “I am a JS Alert” ,
click OK ,
and Verify “You successfully clicked an alert”
 */
    }
    @Test
    public void dismissAlert(){
/*
dismissAlert()=> click on the second alert,
verify text "I am a JS Confirm”,
click cancel,
and Verify “You clicked: Cancel”
 */
    }
    @Test
    public void sendKeysAlert(){
/*
sendKeysAlert()=> click on the third alert,
verify text “I am a JS prompt”,
type “Hello World”,
click OK,
and Verify “You entered: Hello World”
Collapse
 */
        driver.get("https://testcenter.techproeducation.com/index.php?page=javascript-alerts");
//        click on the third alert
        driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
//        verify text “I am a JS prompt”
        String actualAlertText = driver.switchTo().alert().getText();
        Assert.assertEquals("I am a JS prompt",actualAlertText);
        driver.switchTo().alert().sendKeys("Hello World");
        driver.switchTo().alert().accept();
        String actualResultText=driver.findElement(By.id("resut")).getText();
        Assert.assertEquals("You entered: Hello World",actualResultText);
    }
}