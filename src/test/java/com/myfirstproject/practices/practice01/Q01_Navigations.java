package com.myfirstproject.practices.practice01;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q01_Navigations{
    // ...Practice 1...

    public static void main(String[] args) throws InterruptedException {
// Set Driver Path
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
// Create chrome driver object
        WebDriver driver=new ChromeDriver();

// Maximize the window
        driver.manage().window().maximize();
// Open google home page https://www.google.com/
        driver.get("https://www.google.com/");
// Navigate to techproeducation home page https://techproeducation.com/
        driver.navigate().to("https://techproeducation.com/");
// Navigate back to google
        Thread.sleep(2000);
        driver.navigate().back();
// Navigate forward to techproeducation
        Thread.sleep(2000);
        driver.navigate().forward();
// Refresh the page
        Thread.sleep(2000);
        driver.navigate().refresh();
// Close/Quit the browser
        Thread.sleep(2000);
        driver.close();
// And last step : print "ALL OK" on console
        System.out.println("ALL OK");
    }
}
