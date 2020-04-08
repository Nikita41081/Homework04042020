package com.orangehrm.testsuite;

import com.orangehrm.pages.HomePage;
import com.orangehrm.testbase.TestBase;
import org.testng.annotations.Test;

public class ContactSalesTest extends TestBase {
    HomePage homePage = new HomePage();

    @Test
    public void verifyUserIsAbleToSubmitContactSalesDetails() {
        homePage.clickOnContactSalesBtn();
        homePage.enterFirstName();
        homePage.enterLastName();
        homePage.enterCompanyName();
        homePage.selectNumberOfEmployeesFromDropDown();
        homePage.enterPhoneNumber();
        homePage.enterJobTitle();
        homePage.enterEmailID();
        homePage.selectCountryNameFromDropDown();
        homePage.enterComment();
        homePage.clickOnSubmitBtn();
    }

}
