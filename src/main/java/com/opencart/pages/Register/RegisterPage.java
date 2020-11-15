package com.opencart.pages.Register;

import com.opencart.pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends BasePage {

    @FindBy(id = "input-firstname")
    private WebElement firstnameInput;

    @FindBy(id = "input-lastname")
    private WebElement lastnameInput;

    @FindBy(id = "input-email")
    private WebElement emailInput;

    @FindBy(id = "input-telephone")
    private WebElement telephoneInput;

    @FindBy(id = "input-password")
    private WebElement passwordInput;

    @FindBy(id = "input-confirm")
    private WebElement confirmInput;

    @FindBy(name = "agree")
    private WebElement policy;

    @FindBy(xpath = ".//*[@type='submit']")
    private WebElement continueButton;

    public WebElement getSubscribeRadioButton(int value) {
        return driver.findElement(By.xpath("//*[@type = 'radio' and @value = '" + value + "']"));
    }

    public WebElement getFirstNameInput() {
        return firstnameInput;
    }

    public WebElement getLastNameInput() {
        return lastnameInput;
    }

    public WebElement getEmailInput() {
        return emailInput;
    }

    public WebElement getTelephoneInput() {
        return telephoneInput;
    }

    public WebElement getPasswordInput() {
        return passwordInput;
    }

    public WebElement getConfirmInput() {
        return confirmInput;
    }

    public WebElement getPolicy() {
        return policy;
    }

    public WebElement getContinueButton() {
        return continueButton;
    }
}
