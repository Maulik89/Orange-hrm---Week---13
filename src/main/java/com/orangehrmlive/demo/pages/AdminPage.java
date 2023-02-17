package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminPage extends Utility {

        private static final Logger log = LogManager.getLogger(AdminPage.class.getName());

        public AdminPage(){
            PageFactory.initElements(driver,this);
        }

        @FindBy(xpath="//span[normalize-space()='User Management']")
        WebElement UserManagement;
        @FindBy (xpath="//span[normalize-space()='Job']")
        WebElement Job;
        @FindBy (xpath="//span[normalize-space()='Organization']")
        WebElement OrganizationTabs;
        public void ClickonUserManagement(){
            clickOnElement(UserManagement);
}
}
