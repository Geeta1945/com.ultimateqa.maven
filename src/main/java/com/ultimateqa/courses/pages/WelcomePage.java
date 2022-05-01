package com.ultimateqa.courses.pages;

import com.ultimateqa.courses.utility.Utility;
import org.openqa.selenium.By;

public class WelcomePage extends Utility {

    By welcomeMessage = By.xpath("//h1[@class='page__heading']");
    By emailId = By.xpath("//input[@id='user[email]']");
    By password = By.xpath("//input[@id='user[password]']");
    By signInButton = By.xpath("//input[@class='button button-primary g-recaptcha']");
    By errorMessage = By.xpath("//li[@role='alert']");

    // this method will return string - in this method we are calling utility method "GetTextFromElement" and passing
    //By as parameter to find text of that particular element
    public String getWelcomeMessage(){

        return getTextFromElement(welcomeMessage);
    }
    // sending email address
    public void enterEmailId(String email){

        sendTextToElement(emailId,email);

    }
    // sending password
    public void enterPassword(String myPassword){

        sendTextToElement(password,myPassword);
    }

    public void clickOnSignInButton(){

    mouseHoverToElementAndClick(signInButton);

    }
    public void dismissAlertOnSignInPage(){

        dismissAlert();
    }

    public String getErrorMessage(){
     return  getTextFromElement(errorMessage);

    }
}
