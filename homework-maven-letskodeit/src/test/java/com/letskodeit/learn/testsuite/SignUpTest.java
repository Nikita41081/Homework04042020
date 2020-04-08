package com.letskodeit.learn.testsuite;

import com.letskodeit.learn.pages.HomePage;
import com.letskodeit.learn.pages.SignUpPage;
import com.letskodeit.learn.testbase.TestBase;
import org.testng.annotations.Test;

public class SignUpTest extends TestBase {
    HomePage homePage=new HomePage();
    SignUpPage signUpPage=new SignUpPage();

    @Test
    public void verifyUserCanSignUpSuccessfully(){
        homePage.clickOnSignUpBtn();
        signUpPage.enterFullName();
        signUpPage.enterEmailID();
        signUpPage.enterPasswordField();
        signUpPage.enterConfirmPassword();
        signUpPage.clickOnRecapchaCheckbox();
        signUpPage.clickOnTermsAndPolicyCheckbox();
        signUpPage.clickOnSignUpBtn();
    }
}
