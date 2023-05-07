package com.myfirstproject;
import com.myfirstproject.utilities.TestBase;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class Day06_Iframe extends TestBase {
//    https://testcenter.techproeducation.com/index.php?page=iframe
// click on the Back to TechProEducation.com

    @Test
    public void iframeTest() throws InterruptedException {
        driver.get("https://testcenter.techproeducation.com/index.php?page=iframe");
        driver.switchTo().frame(0);
        Thread.sleep(3000);

        WebElement element= driver.findElement(By.xpath("//a[@type='button']"));
        element.click();
    }
}