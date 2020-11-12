package com.opencart.steps;

import com.opencart.pages.HeaderPage;
import com.opencart.steps.login.LoginPageBL;
import com.opencart.steps.register.RegisterPageBL;

public class HeaderPageBL {

    private HeaderPage headerPage;

    public HeaderPageBL() {
        headerPage = new HeaderPage();
    }

    public HeaderPageBL clickOnMyAccountButton() {
        headerPage.getMyAccountButton().click();
        return this;
    }

    public RegisterPageBL clickOnRegisterButton() {
        headerPage.getRegisterButton().click();
        return new RegisterPageBL();
    }

    public LoginPageBL clickOnLoginButton(){
        headerPage.getLoginButton().click();
        return new LoginPageBL();
    }
}
