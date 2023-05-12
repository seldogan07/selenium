package com.myfirstproject;


import com.myfirstproject.utilities.TestBase;
import org.junit.Test;

import java.nio.file.Files;
import java.nio.file.Paths;

import static org.junit.Assert.assertTrue;

public class Day09_FileExistTest extends TestBase {
    /*Pick a file on your desktop
    And verify if that
     */
    @Test
    public void isExist(){
//Pick a file on your desktop
        String userHome=System.getProperty("user.home");
        System.out.println("userHome = " + userHome);
        String patOfFile=userHome+"/Desktop/flower.jpeg";
        System.out.println("patOfFile = " + patOfFile);
//    And verify if that

        assertTrue(Files.exists(Paths.get(patOfFile)));
    }
}
