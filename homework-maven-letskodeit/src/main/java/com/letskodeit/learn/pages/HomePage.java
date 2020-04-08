package com.letskodeit.learn.pages;

import com.letskodeit.learn.utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {
    By practiceLink = By.xpath("//a[@class='fedora-navbar-link navbar-link']");
    By loginLink = By.xpath("//a[@class='navbar-link fedora-navbar-link']");
    By signUpBtn = By.id("header-sign-up-btn");

    public void clickOnPracticeLink() {
        clickOnElement(practiceLink);
    }

    public void clickOnLoginLink() {
        clickOnElement(loginLink);
    }

    public void clickOnSignUpBtn(){
        clickOnElement(signUpBtn);
    }
}
