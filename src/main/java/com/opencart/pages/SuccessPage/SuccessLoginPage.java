package com.opencart.pages.SuccessPage;

import com.opencart.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SuccessLoginPage extends BasePage {

    @FindBy(xpath = ".//*[@id='content']/h2")
    private WebElement successTitle;

    public WebElement getSuccessTitle() {
        return successTitle;
    }
}

