package com.letskodeit.learn.pages;

import com.letskodeit.learn.utility.Utility;
import org.openqa.selenium.By;

public class SignUpPage extends Utility {
    By fullNameField = By.id("user_name");
    By emailAddressField = By.id("user_email");
    By passwordField = By.id("user_password");
    By confirmPasswordField = By.id("user_password_confirmation");
    By reCapchaCheckbox = By.xpath("//div[@class='g-recaptcha']");
    By termsAndPolicyCheckbox = By.xpath("//input[@id='user_agreed_to_terms']");
    By signUpOrCommitBtn = By.xpath("//input[@name='commit']");

    public void enterFullName() {
        sendTextToElement(fullNameField, "Nikita Patel");
    }

    public void enterEmailID() {
        sendTextToElement(emailAddressField, "nikita41081@gmail.com");
    }

    public void enterPasswordField() {
        sendTextToElement(passwordField, "abc123");
    }

    public void enterConfirmPassword() {
        sendTextToElement(confirmPasswordField, "abc123");
    }

    public void clickOnRecapchaCheckbox() {
        clickOnElement(reCapchaCheckbox);
    }

    public void clickOnTermsAndPolicyCheckbox() {
        clickOnElement(termsAndPolicyCheckbox);
    }

    public void clickOnSignUpBtn() {
        clickOnElement(signUpOrCommitBtn);
    }
}
