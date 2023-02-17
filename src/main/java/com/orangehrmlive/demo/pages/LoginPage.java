package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends Utility {

    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());

    public LoginPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@name='username']")
    WebElement Username;
    @FindBy(xpath = "//input[@name='password']")
    WebElement Password;
    @FindBy(xpath = "//button[@type='submit']")
    WebElement LoginButton;


    public void enterUserName(String text) {
        sendTextToElement(Username, text);
    }

    public void enterPassword(String text) {
        sendTextToElement(Password, text);
    }

    public void clickOnLoginButton() {
        clickOnElement(LoginButton);
}
}