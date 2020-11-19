package com.opencart.steps.login;

import com.opencart.datamodel.login.LoginModel;
import com.opencart.pages.Login.LoginPage;
import com.opencart.pages.SuccessPage.SuccessLoginPage;
import com.opencart.repository.login.LoginModelRepository;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LoginPageBL {

    private WebDriver driver;

    private LoginPage loginPage;
    private SuccessLoginPage successLoginPage;

    public LoginPageBL() {
        loginPage = new LoginPage();
    }

    public LoginPageBL loginPerson() {
        LoginModel loginModel = LoginModelRepository.getLoginModel();
        inputEmail(loginModel.getEmail());
        inputPassword(loginModel.getPassword());
        clickSubmit();

        successLoginPage = new SuccessLoginPage();
        return this;

    }

    private void inputEmail(String email) {
        loginPage.getEmailInput().clear();
        loginPage.getEmailInput().sendKeys(email);
    }

    private void inputPassword(String pass) {
        loginPage.getPasswordInput().clear();
        loginPage.getPasswordInput().sendKeys(pass);
    }

    private void clickSubmit() {
        loginPage.getSubmitButton().click();
    }

    public void verifyUserLogin() {
        String expectedMessage = "My Account";
        Assert.assertEquals(successLoginPage.getSuccessTitle().getText(), expectedMessage, "Incorrect page title");
    }
}








