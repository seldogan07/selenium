package com.myfirstproject;

import com.myfirstproject.utilities.TestBase;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import static org.junit.Assert.assertTrue;

public class Day_05DropDown extends TestBase {
    /*
Go to https://testcenter.techproeducation.com/index.php?page=dropdown
1.Create a test method selectByIndexTest and Select Option 1 using index
2.Create a test method selectByValueTest Select Option 2 by value
3.Create a test method selectByVisibleTextTest Select Option 1 value by visible text
4.Create a test method printAllTest Print all dropdown value
6.Create a test method printFirstSelectedOptionTest Print first selected option
5.Verify the dropdown has Texas text
7.Find the size of the dropdown
*/

    //   1.Create a test method selectByIndexTest and Select Option 1 using index
    @Test
    public void selectByIndexTest() throws InterruptedException {
        driver.get("https://testcenter.techproeducation.com/index.php?page=dropdown");
        WebElement dropDown= driver.findElement(By.id("dropdown"));
        Select select=new Select(dropDown);

        Thread.sleep(3000);
        select.selectByIndex(1);}

        @Test
                public void selectedByValueTest() throws InterruptedException {
            driver.get("https://testcenter.techproeducation.com/index.php?page=dropdown");
            WebElement dropDown= driver.findElement(By.id("dropdown"));
            Select select=new Select(dropDown);

            Thread.sleep(3000);
            select.selectByValue("2");
//6.Create a test method printFirstSelectedOptionTest Print first selected option
//5.Verify the dropdown has Texas text
//7.Find the size of the dropdown
    }
    @Test
    public void selectByVisibleTextTest() throws InterruptedException {
        driver.get("https://testcenter.techproeducation.com/index.php?page=dropdown");
        WebElement dropDown= driver.findElement(By.id("dropdown"));
        Select select=new Select(dropDown);

        Thread.sleep(3000);
        select.selectByVisibleText("Option 1");
    }
    @Test
    public void printAllTest(){
        driver.get("https://testcenter.techproeducation.com/index.php?page=dropdown");
        WebElement dropDown= driver.findElement(By.id("state"));
        Select select=new Select(dropDown);
        List<WebElement> optionsList=select.getOptions();
        for (WebElement w:optionsList){
            System.out.println(w.getText());
        }

    }
    @Test
    public void printFirstSelectedOptionTest(){
        driver.get("https://testcenter.techproeducation.com/index.php?page=dropdown");
        WebElement dropDown= driver.findElement(By.id("state"));
        Select select=new Select(dropDown);
        String firstSelectedOption=select.getFirstSelectedOption().getText();
        System.out.println("firstSelectedOption = " + firstSelectedOption);
    }
}