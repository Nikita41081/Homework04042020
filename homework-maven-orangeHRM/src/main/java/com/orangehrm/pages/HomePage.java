package com.orangehrm.pages;

import com.orangehrm.utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {
    By contactSalesBtn = By.xpath("//a[contains(@class,'btn-orange contact-ohrm')]");
    By firstNameField = By.name("firstname");
    By lastNameField = By.name("lastname");
    By companyNameField = By.name("company");
    By numberOfEmployeesDropDownMenu = By.name("numemployees");
    By phoneNumberField = By.name("phone");
    By jobTitleField = By.name("jobtitle");
    By emailField = By.name("email");
    By countryDropDownMenu = By.name("country");
    By commentField = By.name("message");
    By submitBtn = By.className("hs-button primary large");

    public void clickOnContactSalesBtn(){
        clickOnElement(contactSalesBtn);
    }
    public void enterFirstName(){
        sendTextToElement(firstNameField, "Nikita");
    }
    public void enterLastName(){
        sendTextToElement(lastNameField, "Patel");
    }
    public void enterCompanyName(){
        sendTextToElement(companyNameField, "ORGHRM");
    }
    public void selectNumberOfEmployeesFromDropDown (){
        selectByValueFromDropDown(numberOfEmployeesDropDownMenu,"301 - 350");
    }
    public void enterPhoneNumber(){
        sendTextToElement(phoneNumberField, "3789342569");
    }
    public void enterJobTitle(){
        sendTextToElement(jobTitleField, "Customer Service Assistant");
    }
    public void enterEmailID(){
        sendTextToElement(emailField, "nikita41081@yahoo.com");
    }
    public void selectCountryNameFromDropDown (){
        selectByValueFromDropDown(countryDropDownMenu, "Zambia");
    }
    public void enterComment (){
        sendTextToElement(commentField, "None");
    }
    public void clickOnSubmitBtn(){
        clickOnElement(submitBtn);
    }
}
