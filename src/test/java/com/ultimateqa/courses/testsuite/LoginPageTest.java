package com.ultimateqa.courses.testsuite;

import com.ultimateqa.courses.pages.LoginPage;
import com.ultimateqa.courses.testbase.TestBase;
import org.testng.annotations.Test;

public class LoginPageTest extends TestBase {

    LoginPage loginPageObj = new LoginPage();

    @Test

    public void clickOnLoginLink(){

        loginPageObj.clickOnSignIn();
    }

}
