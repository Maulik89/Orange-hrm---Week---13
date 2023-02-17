package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage extends Utility {

        private static final Logger log = LogManager.getLogger(DashboardPage.class.getName());

        public void DashboardPage(){
            PageFactory.initElements(driver,this);
        }
        @FindBy(xpath = "//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'][normalize-space()='Dashboard']")
        WebElement dashboardTab;
        @FindBy (xpath="//h6[normalize-space()='Dashboard']")
        WebElement dashboardText;
        public void ClickDashboard(){clickOnElement(dashboardTab);}

        public String verifyTextDashboard(){
            return getTextFromElement(dashboardText);}
    }

