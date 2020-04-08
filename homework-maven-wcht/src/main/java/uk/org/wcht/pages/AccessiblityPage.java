package uk.org.wcht.pages;

import org.openqa.selenium.By;
import uk.org.wcht.basepage.BasePage;
import uk.org.wcht.utility.Utility;

public class AccessiblityPage extends Utility {
    By yourCommunityTab = By.xpath("//a[@class='header__nav-area-title'][contains(text(),'Your community')]");
    By getInvolved = By.xpath("//ul[@class='header__sub-nav js-sub-nav']//a[contains(text(),'Get involved')]");
    By lightBitesField = By.id("form-OrderFromTheInvolvementMenu-3780_DropDown_SelectedValue");
    By mainMenuField = By.id("form-OrderFromTheInvolvementMenu-b361_DropDown_1_SelectedValue");
    By allYouCanEatField = By.id("form-OrderFromTheInvolvementMenu-caa2_DropDown_2_SelectedValue");
    By takeAwayField = By.id("form-OrderFromTheInvolvementMenu-caa2_DropDown_3_SelectedValue");
    By yesIWouldLikeToBecomeAMemberCheckbox = By.xpath("//label[contains(text(),'Yes, I would like to become a member')]");
    By yesIWouldLikeToFindOutMoreCheckBox = By.xpath("//label[contains(text(),'Yes, I would like to find out more')]");
    By yesIWouldLikeHelpUsingEmailOrFacebookCheckbox = By.xpath("//label[contains(text(),'Yes, I would like help using email or Facebook')]");
    By nameField = By.id("form-OrderFromTheInvolvementMenu-d240_Name_Value");
    By addressField = By.id("form-OrderFromTheInvolvementMenu-caa2_Postcode_Value");
    By postcodeField = By.id("form-OrderFromTheInvolvementMenu-d240_Postcode_Value");
    By howWouldYouLikeToBeContactedDropDown = By.id("form-OrderFromTheInvolvementMenu-d240_Contact_preference_SelectedValue");
    By emailIDField = By.id("form-OrderFromTheInvolvementMenu-d240_Email_or_phone_Value");
    By captchaCheckBox = By.id("google-recaptcha-form-OrderFromTheInvolvementMenu-d240_Recaptcha_Value");
    By submitBtn = By.xpath("//input[@type='submit']");

    public void mouseHoverOnYourCommunityTab() {
        mouseHoverToElement(yourCommunityTab);
    }

    public void mouseHoverOnGetInvolvedAndClick() {
        mouseHoverToElementAndClick(getInvolved);
    }

    public void clickOnLightBitesField() {
        selectByVisibleTextFromDropDown(lightBitesField, "Membership");
    }

    public void clickOnMainMenu() {
        selectByVisibleTextFromDropDown(mainMenuField, "Community groups");
    }

    public void clickOnAllYouCanEatField() {
        selectByVisibleTextFromDropDown(allYouCanEatField, "Committee members");
    }

    public void clickOnTakeAwayField() {
        selectByVisibleTextFromDropDown(takeAwayField, "Email engagement");
    }

    public void clickOnYesIWouldLikeToBecomeAMember() {
        clickOnElement(yesIWouldLikeToBecomeAMemberCheckbox);
    }

    public void clickOnYesIWouldLikeToFindOutMore() {
        clickOnElement(yesIWouldLikeToFindOutMoreCheckBox);
    }

    public void clickOnYesIWouldLikeUsingEmailOrFacebook() {
        clickOnElement(yesIWouldLikeHelpUsingEmailOrFacebookCheckbox);
    }

    public void enterNameField() {
        sendTextToElement(nameField, "Nikita");
    }

    public void enterAddressField() {
        sendTextToElement(addressField, "16 Chapel Rd, Breachwood Green, Hitchin");
    }

    public void enterPostcodeField() {
        sendTextToElement(postcodeField, "SG4 8NU");
    }

    public void clickOnHowWouldYouLikeToBeContacted() {
        selectByVisibleTextFromDropDown(howWouldYouLikeToBeContactedDropDown, "Phone");
    }

    public void enterEmailID() {
        sendTextToElement(emailIDField, "abc@yahoo.com");
    }

    public void clickOnCaptchaCheckbox() {
        clickOnElement(captchaCheckBox);
    }

    public void clickOnSubmitBtn() {
        clickOnElement(submitBtn);
    }
}
