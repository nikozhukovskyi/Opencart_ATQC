package com.opencart.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HeaderPage extends BasePage {

    @FindBy(xpath = ".//*[@title = 'My Account']")
    private WebElement myAccountButton;

    @FindBy(xpath = ".//*[contains(@href,'register')]")
    private WebElement registerButton;

    @FindBy(xpath = ".//*[contains(@href,'login')]")
    private WebElement loginButton;

    @FindBy(xpath = "//*[@id=\"search\"]/span/button")
    private WebElement searchButton;


    public WebElement getMyAccountButton() {
        return myAccountButton;

    }

    public WebElement getRegisterButton() {
        return registerButton;
    }

    public WebElement getLoginButton(){
        return loginButton;
    }

    public WebElement getSearchButton() {
        return searchButton;
    }
}
