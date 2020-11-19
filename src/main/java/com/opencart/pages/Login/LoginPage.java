package com.opencart.pages.Login;

import com.opencart.pages.BasePage;
import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter

public class LoginPage extends BasePage {

    @FindBy(id = "input-email")
    public WebElement emailInput;

    @FindBy(id = "input-password")
    private WebElement passwordInput;

    @FindBy(xpath = ".//*[@type='submit']")
    private WebElement submitButton;



}
