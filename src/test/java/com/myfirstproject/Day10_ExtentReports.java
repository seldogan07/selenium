package com.myfirstproject;

import com.myfirstproject.utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.io.IOException;


public class Day10_ExtentReports extends TestBase {


    @Test
    public void extentReportsTest1(){

        driver.get("https://google.com");
        String googleTitle = driver.getTitle();

        if(googleTitle.contains("Hello")){
            extentTest.pass("Test passed. Because Google title contains Hello!");
        }else {
            extentTest.fail("Test failed. Because Google title does not contain Hello!");
        }

        extentTest.pass("Test passed");
        extentTest.fail("Test failed");
        extentTest.info("Test info");
        extentTest.skip("Test skipped");
        extentTest.warning("Warning!!!");

    }


    @Test
    public void extentReportsTest() throws IOException, InterruptedException {
        //        Given user is on https://testcenter.techproeducation.com/index.php?page=autocomplete
        driver.get("https://testcenter.techproeducation.com/index.php?page=autocomplete");
//        When user type "uni" in the search box
        extentTest.pass("Taking the screenshot of the home page");//just like system out print ln
        //TAKE SCREENSHOT
        takeScreenshotOfTheEntirePage();
        driver.findElement(By.id("myCountry")).sendKeys("uni");
        Thread.sleep(2000);
//        And select the 'United Kingdom' from the suggestions
        //TAKE SCREENSHOT
        extentTest.pass("Selecting the United Kingdom option");
        takeScreenshotOfTheEntirePage();

//        TAKING SCREENSHOT OF ONLY UNITED KINGDOM ELEMENT
        takeScreenshotOfThisElement(driver.findElement(By.xpath("//div[@id='myCountryautocomplete-list']//*[.='United Kingdom']")));
        driver
                .findElement(By.xpath("//div[@id='myCountryautocomplete-list']//*[.='United Kingdom']"))
                .click();
        Thread.sleep(2000);
//        And click on submit button
        //TAKE SCREENSHOT
        takeScreenshotOfTheEntirePage();
        extentTest.pass("Clinking on the Submit Button");
        driver.findElement(By.xpath("//input[@type='button']")).click();
        Thread.sleep(2000);
        //TAKE SCREENSHOT
//        Then verify the result contains 'United Kingdom'
        takeScreenshotOfTheEntirePage();

//        TAKING THE SCREENSHOT OF THE RESULT ELEMENT
        extentTest.pass("Taking the screenshot of result element");
        WebElement result = driver.findElement(By.id("result"));
        takeScreenshotOfThisElement(result);

        extentTest.pass("Asserting the result contains United Kingdom");
        Assert.assertTrue(driver.findElement(By.id("result")).getText().contains("United Kingdom"));
    }
}