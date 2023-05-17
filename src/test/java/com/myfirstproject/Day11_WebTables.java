package com.myfirstproject;

import com.myfirstproject.utilities.TestBase;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Day11_WebTables extends TestBase {

    /*
    Go to: https://the-internet.herokuapp.com/tables
    Task 1 : Print the entire table
    Task 2 : Print All Rows
    Task 3 : Print Last row data only
    Task 4 : Print column 5 data in the table body
    Task 5 : Write a method that accepts 2 parameters
    Parameter 1 = row number
    Parameter 2 = column number
    printData(2,3); => prints data in 2nd row 3rd column
     */

    @Test
    public void printEntireTable() {
        driver.get("https://the-internet.herokuapp.com/tables");
        String entireTable = driver.findElement(By.id("table1")).getText();
        System.out.println("entireTable = " + entireTable);

        //Alternatively
        List<WebElement> allRows = driver.findElements(By.xpath("(//table)[1]//tr"));
        for (WebElement w : allRows) {
            System.out.println(w.getText());
        }
        System.out.println("\n****-Print Each data-***\n");
        List<WebElement> allData = driver.findElements(By.xpath("(//table)[1]//td"));
        allData.forEach(t -> System.out.println((t.getText() + " ")));
    }
        //Task 2: Print all rows
        @Test
                public void printAllRows(){
        driver.get("https://the-internet.herokuapp.com/tables");
        List<WebElement> allRows=driver.findElements(By.xpath("(//tbody)[1]//tr"));
        int rowNumber=1;
        for (WebElement w:allRows) {
            System.out.println(rowNumber
                    +". rows = " + w.getText());
            rowNumber++;
        }
            System.out.println("\n****-2nd Row ----\n");
            System.out.println(allRows.get(1).getText());

    }
    //Task 3 : Print Last row data only
    @Test
    public void  printLastRow(){
        driver.get("https://the-internet.herokuapp.com/tables");
        System.out.println("\n===Print Last Row===\n");
        List<WebElement> allRows = driver.findElements(By.xpath("(//table)[1]//tr"));
        System.out.println(allRows.get(allRows.size()-1).getText());//(allRows.size()-1) --> last index

        //We can use alternatively this xpath to get last element: (//tbody)[1]//tr[last()]
        System.out.println("\n===//tr[last()]===\n");
        WebElement lastRow = driver.findElement(By.xpath("(//tbody)[1]//tr[last()]"));
        System.out.println(lastRow.getText());

    }
    //Task 4: Print column 5 data in the table body
    @Test
    public void printColumn5(){
        driver.get("https://the-internet.herokuapp.com/tables");
        System.out.println("\n===Print column 5===\n");
        List<WebElement> column5Data=driver.findElements(By.xpath("(table)[1]//td[5]"));
        int rowNumber=1;
        for (WebElement w:column5Data){
            System.out.println(rowNumber+". "+w.getText());
            rowNumber++;
        }

    }
    // Task 5 : Write a method that accepts 2 parameters
    //    Parameter 1 = row number
    //    Parameter 2 = column number
    //    printData(2,3); => prints data in 2nd row 3rd column
    public String printCell(int rowNumber,int columnNumber){
        String cellValue=driver.findElement(By.xpath("(//table)[1]//tr["+rowNumber+"]//td["+columnNumber+"]")).getText();
return cellValue;
    }
    @Test
    public void getcellValueTest(){
        driver.get("https://the-internet.herokuapp.com/tables");
        System.out.println("\n===Print cell value===\n");
        System.out.println(printCell(4,1));
    }

}