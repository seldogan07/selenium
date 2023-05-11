package com.myfirstproject;

import com.myfirstproject.utilities.TestBase;
import org.junit.Test;
import org.openqa.selenium.Cookie;

import java.util.*;

public class Day08_Cookies extends TestBase {
    /*
1. Find the total number of cookies
2. Print all the cookies
3. Get the cookies by their name
4. Add new cookie
5. Delete cookie by name
6. Delete all the cookies
 */
    @Test
    public void cookiesTest(){

        driver.get("https://amazon.com");
        //1. Find the total number of cookies

        Set<Cookie> allCookies=driver.manage().getCookies();
        int totalNumberOfCookies=allCookies.size();
        System.out.println("totalNumberOfCookies = " + totalNumberOfCookies);
//Print all the cookies
        //System.out.println("allCookies = " + allCookies);
        for(Cookie w:allCookies){
            System.out.println("w = " + w);
            System.out.println("Cookie Name: "+w.getName());
            System.out.println("Cookie Value: " + w.getValue());
            System.out.println("Cookie Expiry: "+w.getExpiry());
            System.out.println("Cookie Path: "+w.getPath());
            System.out.println("Cookie SameSite: "+w.getSameSite());
            System.out.println("Cookie Domain: "+w.getDomain());
            System.out.println("\n-------\n");
        }
// Get the cookies by their name
        Cookie cookie=driver.manage().getCookieNamed("sp-cdn");
        System.out.println("cookie = " + cookie);
// Add new cookie
        Cookie myCookie=new Cookie("my-cookie","delicius cookie");
        driver.manage().addCookie(myCookie);
        System.out.println("New total Cookie = " + driver.manage().getCookies().size());
// Delete cookie by name
        driver.manage().deleteCookieNamed("sp-cdn");
        System.out.println("New total Cookie = " + driver.manage().getCookies().size());
// Delete all the cookies,
        driver.manage().deleteAllCookies();
        System.out.println("New total Cookie = " + driver.manage().getCookies().size());

    }

}
