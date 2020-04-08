package uk.co.barclays.testsuite;

import org.testng.annotations.Test;
import uk.co.barclays.pages.HomePage;
import uk.co.barclays.testbase.TestBase;

public class BranchFinderToSwitchTest extends TestBase {
    HomePage homePage = new HomePage();

    @Test
    public void verifyUserCanFindABranchToSwitchBank() {
        homePage.mouseHoverOnBankMenuItem();
        homePage.mouseHoverAndClickOnSwitchingBankAccountToBarclays();
        homePage.clickOnNewToUsBtn();
        homePage.clickOnBranchFinderButton();
        homePage.enterLocationInLocationField();
        homePage.clickOnSearchBtn();
    }
}


