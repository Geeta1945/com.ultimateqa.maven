package com.ultimateqa.courses.pages;

import com.ultimateqa.courses.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {

    By signInButton = By.xpath("//li[@class='header__nav-item header__nav-sign-in']");

    public void clickOnSignIn(){

        mouseHoverToElementAndClick(signInButton);
    }

}
