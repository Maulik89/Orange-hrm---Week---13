package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public void HomePage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//img[@alt='client brand banner']")
    WebElement OrangeHmrLogo;
    @FindBy(xpath = "//a[@class='oxd-main-menu-item']//span[text()='Admin']")
    WebElement Admin;
    @FindBy(xpath = "//a[@class='oxd-main-menu-item']//span[text()='PIM']")
    WebElement PIM;

    @FindBy(xpath = "//span[normalize-space()='Leave']")
    WebElement Leave;
    @FindBy(xpath = "//h6[normalize-space()='Dashboard']")
    WebElement Daseboard;
    @FindBy(xpath = "//p[@class='oxd-userdropdown-name']")
    WebElement WelcomeText;
    @FindBy(xpath = "//img[@alt='profile picture']")
    WebElement ProfileLogo;
    @FindBy(xpath = "//a[normalize-space()='Logout']")
    WebElement LogoutButton;

// Java class methods should be made here, below is an example .
// Click on Login Link

    public boolean verifyLogo() {
        driver.findElement(By.xpath("//img[@alt='client brand banner']")).isDisplayed();
        return true;
    }

    public boolean verifyLoginpanel() {
        driver.findElement(By.xpath("//h5[normalize-space()='Login']")).isDisplayed();
        return true;
    }

    public void clickAdminButton() {
        clickOnElement(Admin);
    }

    public void clickPIMbutton() {
        clickOnElement(PIM);
    }

    public void clickOnLeavebutton() {
        clickOnElement(Leave);
    }

    public String verifyLeaveButton() {
        return getTextFromElement(Leave);
    }

    public String verifyDasboardbutton() {
        return getTextFromElement(Daseboard);
    }

    public void clickOnProfilePhoto() {
        clickOnElement(ProfileLogo);
    }

    public void clickOnLogoutButton() {
        clickOnElement(LogoutButton);
    }

    public String verifyWelcomeText() {
        return getTextFromElement(WelcomeText);
    }
}

