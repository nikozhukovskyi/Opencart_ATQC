package com.opencart.pages.Search;

import com.opencart.pages.BasePage;
import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


@Getter

public class SearchPage extends BasePage {

    @FindBy(id = "input-search")
    private WebElement SearchInput;

    @FindBy(id = "button-search")
    private WebElement SearchButton;

    @FindBy(name = "description")
    private WebElement description;

}
