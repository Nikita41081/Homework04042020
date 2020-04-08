package com.letskodeit.learn.pages;

import com.letskodeit.learn.utility.Utility;
import org.openqa.selenium.By;

public class PracticePage extends Utility {
    By hondaRadioBtn = By.id("hondaradio");
    By selectClassCars = By.id("carselect");
    By selectPeachOption = By.xpath("//option[contains(text(),'Peach')]");
    By selectHondaCheckbox = By.xpath("//div[@id='checkbox-example']//label[3]");
    By yourNameField = By.id("name");
    By alertbtn = By.id("alertbtn");
    By mouseHoverBtn = By.id("mousehover");
    By selectTop = By.xpath("//a[contains(text(),'Top')]");

    public void clickOnHondaRadioBtn (){
        clickOnElement(hondaRadioBtn);
    }
    public void clickOnSelectCarsAndSelectHonda(){
        selectByVisibleTextFromDropDown(selectClassCars,"Honda");
    }
    public void clickOnPeachOption(){clickOnElement(selectPeachOption);}
    public void clickOnHondaCheckBox(){clickOnElement(selectHondaCheckbox);}
    public void enterNameInYourNameField(){ sendTextToElement(yourNameField,"Nikita");}
    public void clickOnAlertButton(){ clickOnElement(alertbtn);}
    public void mouseHoverOnMouseHoverButton(){mouseHoverToElementAndClick(mouseHoverBtn);}
    public void clickOnTop(){clickOnElement(selectTop);}
}
