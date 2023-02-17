package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ViewSystemUsersPage extends Utility {

    private static final Logger log = LogManager.getLogger(ViewSystemUsersPage.class.getName());

    public ViewSystemUsersPage(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath="//h5[normalize-space()='System Users']")
    WebElement SystemUsersText;
    @FindBy(xpath="//div[@class='oxd-form-row']//input[@class='oxd-input oxd-input--active']")
    WebElement UserNameField;
    @FindBy(xpath="//div[@class='oxd-form-row']/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/i[1]")
    WebElement userroleDownArrow;

    @FindBy(xpath="//*[@class='oxd-select-wrapper']//*[contains(text(), 'Admin')]")
    WebElement userrolAdmin;

    @FindBy(xpath="//input[@placeholder='Type for hints...']")
    WebElement EmployeeNameField;
    @FindBy(xpath="//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[4]/div[1]/div[2]/div[1]/div[1]")
    WebElement StatusDropDown;
    @FindBy(xpath="//*[@class='oxd-select-wrapper']//*[contains(text(), 'Disabled')]")
    WebElement disabledOption;
    @FindBy(xpath="//button[normalize-space()='Search']")
    WebElement SearchButton;
    @FindBy(xpath="//button[normalize-space()='Reset']")
    WebElement ResetButton;

    @FindBy(xpath="//button[normalize-space()='Add']")
    WebElement AddButton;

    @FindBy(xpath="//h6[normalize-space()='Add User']")
    WebElement addUserText;
    @FindBy(xpath="//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[3]/div[1]/div[2]/div[1]/div[1]/div[6]/div[1]/button[1]/i[1]")
    WebElement DeleteButton;
    public String verifySystemUsersText(){return getTextFromElement(SystemUsersText);}
    public void enterUserNameField(String userName) {sendTextToElement(UserNameField,userName);}
    public void clickUserRollDropdown() throws InterruptedException {
        clickOnElement(userroleDownArrow);
        Thread.sleep(1000);
        clickOnElement(userrolAdmin);
    }
    public void enterEmployeeNameField(String employee){sendTextToElement(EmployeeNameField,employee);}
    public void clickStatusDropDown() throws InterruptedException {
        clickOnElement(StatusDropDown);
        Thread.sleep(1000);
        clickOnElement(disabledOption);
    }
    public void clickSearchButton(){clickOnElement(SearchButton);}
    public void clickResetButton(){clickOnElement(ResetButton);}
    public void clickAddButton(){clickOnElement(AddButton);}

    public String verifyAddUserText(){
        return getTextFromElement(addUserText);
    }
    public void clickDeleteButton(){clickOnElement(DeleteButton);}


}
