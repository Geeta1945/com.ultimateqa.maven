package com.ultimateqa.courses.testsuite;

import com.ultimateqa.courses.pages.WelcomePage;
import com.ultimateqa.courses.testbase.TestBase;

import org.testng.Assert;
import org.testng.annotations.Test;

public class WelcomePageTest extends TestBase {

    WelcomePage welcomePageObj = new WelcomePage();
    LoginPageTest loginPageTestObj = new LoginPageTest();

    // In this test we need to identify that after clicking Sign In button user is on right page
    // - which we can confirm by checking the welcome back! message
    @Test
    public void checkUserIsOnWelcomePage(){

        loginPageTestObj.clickOnLoginLink();
        String actualMessage= welcomePageObj.getWelcomeMessage();
        String expectedMessage = "Welcome Back!";
        Assert.assertEquals(actualMessage,expectedMessage);

    }


    @ Test

    public void verifyTheErrorMessage(){
        loginPageTestObj.clickOnLoginLink();
        welcomePageObj.enterEmailId("myemail@yahoo.co.uk");
        welcomePageObj.enterPassword("MyPasswordIsTough");
        welcomePageObj.clickOnSignInButton();
      String actualMessage=   welcomePageObj.getErrorMessage();
      String expectedMessage ="Invalid email or password.";
      Assert.assertEquals(actualMessage,expectedMessage);


    }


}
