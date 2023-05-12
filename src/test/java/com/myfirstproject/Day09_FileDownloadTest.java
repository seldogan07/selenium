package com.myfirstproject;

import com.myfirstproject.utilities.TestBase;
import org.junit.Test;
import org.openqa.selenium.By;

import java.nio.file.Files;
import java.nio.file.Paths;

import static org.junit.Assert.assertTrue;

public class Day09_FileDownloadTest extends TestBase {
    /*
 Go to https://testcenter.techproeducation.com/index.php?page=file-download
 Download b10 all test cases, code.docx  file
 Verify if the file downloaded successfully
 */
    @Test
    public void downloadTetst() throws InterruptedException {
        //Go to https://testcenter.techproeducation.com/index.php?page=file-download
        driver.get("https://testcenter.techproeducation.com/index.php?page=file-download");
        // Download b10 all test cases, code.docx  file
        driver.findElement(By.partialLinkText("b10 all")).click();
        Thread.sleep(5000);
        // Verify if the file downloaded successfully
        assertTrue(Files.exists(Paths.get(System.getProperty("user.home")+"/Downloads/b10 all test cases, code.docx")));
    }
}
