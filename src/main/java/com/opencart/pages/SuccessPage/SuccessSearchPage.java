package com.opencart.pages.SuccessPage;

import com.opencart.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SuccessSearchPage extends BasePage {

    @FindBy(className = "")
    private WebElement successTitle;

    public WebElement getSuccessTitle() {
        return successTitle;
    }
}

