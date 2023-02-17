package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddUserPage extends Utility {

    private static final Logger log = LogManager.getLogger(AddUserPage.class.getName());


    public AddUserPage() {
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/i[1]")
    WebElement userRole;
    @FindBy(xpath = "//input[@placeholder='Type for hints...']")
    WebElement EmployeeName;
    @FindBy(xpath = "//div[@class='oxd-form-row']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]")
    WebElement user;
    @FindBy(xpath = "//*[@class='oxd-select-wrapper']//*[contains(text(), 'Admin')]")
    WebElement adminOption;
    @FindBy(xpath = "//div[@class='oxd-form-row']/div[1]/div[4]/div[1]/div[2]/input")
    WebElement userNm;

    @FindBy(xpath = "//*[@class='oxd-autocomplete-wrapper']")
    WebElement nam;
    @FindBy(xpath = "//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]")
    WebElement StatusDropDown;
    @FindBy(xpath = "//*[@class='oxd-select-wrapper']//*[contains(text(),'Disabled')]")
    WebElement disabledOption;
    @FindBy(xpath = "//div[@class='oxd-form-row user-password-row']/div[1]/div[1]/div[1]/div[2]/input")
    WebElement passWd;
    @FindBy(xpath = "//div[@class='oxd-form-row user-password-row']/div[1]/div[2]/div[1]/div[2]/input")
    WebElement confirmPw;
    @FindBy(xpath = "//button[normalize-space()='Save']")
    WebElement SaveButton;
    @FindBy(xpath = "//button[normalize-space()='Cancel']")
    WebElement CancelButton;
    @FindBy(xpath = "//div[@class='oxd-grid-2 orangehrm-full-width-grid']//div[1]//div[1]//div[2]//div[1]//div[1]//div[2]//i[1]")
    WebElement Dropdown;

    public void selectUserRoleAdmin() throws InterruptedException {
        clickOnElement(userRole);
        Thread.sleep(1000);
        clickOnElement(adminOption);
        sendTextToElement(user, "Admin");
    }

    public void enterEmployeeName() throws InterruptedException {
        sendTextToElement(EmployeeName, "P");
        Thread.sleep(1000);
        clickOnElement(nam);

    }

    public void enterUserName(String name) {
        //clearTextToElement(userName);
        sendTextToElement(userNm, name);
    }

    public void clickStatusDropDown1() throws InterruptedException {
        clickOnElement(StatusDropDown);
        Thread.sleep(1000);
        clickOnElement(disabledOption);
    }

    public void enterPasswordField(String pswd) {
        sendTextToElement(passWd, pswd);
    }

    public void enterConfirmPasswordField(String pswd) {
        sendTextToElement(confirmPw, pswd);
    }

    public void clickSaveButton() {
        clickOnElement(SaveButton);
    }

    public void clickCancleButton() {
        clickOnElement(CancelButton);
    }

    public void clickDropdown() {
        clickOnElement(Dropdown);
    }
}