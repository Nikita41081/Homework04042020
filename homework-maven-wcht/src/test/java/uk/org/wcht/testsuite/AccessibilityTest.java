package uk.org.wcht.testsuite;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import uk.org.wcht.pages.AccessiblityPage;
import uk.org.wcht.pages.HomePage;
import uk.org.wcht.testbase.TestBase;

import javax.swing.*;

public class AccessibilityTest extends TestBase {
HomePage homePage = new HomePage();
AccessiblityPage accessiblityPage= new AccessiblityPage();


@Test
    public void verifyUserCanNavigateToAccessiblityPage() throws InterruptedException {
    homePage.clickOnAccessibilityLink();
    accessiblityPage.mouseHoverOnYourCommunityTab();
    accessiblityPage.mouseHoverOnGetInvolvedAndClick();
    Thread.sleep(5000);
    accessiblityPage.clickOnLightBitesField();
    accessiblityPage.clickOnMainMenu();
    accessiblityPage.clickOnAllYouCanEatField();
    accessiblityPage.clickOnTakeAwayField();
    accessiblityPage.clickOnYesIWouldLikeToBecomeAMember();
    accessiblityPage.clickOnYesIWouldLikeToFindOutMore();
    accessiblityPage.clickOnYesIWouldLikeUsingEmailOrFacebook();
    accessiblityPage.enterNameField();
    accessiblityPage.enterAddressField();
    accessiblityPage.enterPostcodeField();
    accessiblityPage.clickOnHowWouldYouLikeToBeContacted();
    accessiblityPage.enterEmailID();
    accessiblityPage.clickOnCaptchaCheckbox();
    accessiblityPage.clickOnSubmitBtn();

}

}
