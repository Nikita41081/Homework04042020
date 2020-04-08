package com.letskodeit.learn.testsuite;

import com.letskodeit.learn.pages.HomePage;
import com.letskodeit.learn.pages.PracticePage;
import com.letskodeit.learn.testbase.TestBase;
import org.testng.annotations.Test;

public class PracticeTest extends TestBase {
    HomePage homePage = new HomePage();
    PracticePage practicePage = new PracticePage();

    @Test
    public void verifyUserIsAbleToUsePracticePageFunctions(){
        homePage.clickOnPracticeLink();
        practicePage.clickOnHondaRadioBtn();
        practicePage.clickOnSelectCarsAndSelectHonda();
        practicePage.clickOnPeachOption();
        practicePage.clickOnHondaCheckBox();
        practicePage.enterNameInYourNameField();
        practicePage.clickOnAlertButton();
    }
    @Test
    public void verifyUserIsAbleToUseMouseHoverFunction(){
        homePage.clickOnPracticeLink();
        practicePage.mouseHoverOnMouseHoverButton();
        practicePage.clickOnTop();
    }

}
