package com.opencart.steps.search;

import com.opencart.datamodel.search.SearchModel;
import com.opencart.pages.Search.SearchPage;
import com.opencart.pages.SuccessPage.SuccessSearchPage;
import com.opencart.repository.search.SearchModelRepository;
import com.opencart.util.DriverUtils;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class SearchPageBL {

    private WebDriver driver;

    private SearchPage searchPage;
    private SuccessSearchPage successSearchPage;

    public SearchPageBL() {
        searchPage = new SearchPage();
    }

    public SearchPageBL SearchProduct() {
        SearchModel searchModel = SearchModelRepository.getSearchModel();
        inputSearch(searchModel.getSearch());
        clickSearchButton();
        clickOnDescriptionBox();

        successSearchPage = new SuccessSearchPage();
        return this;

    }

    private void inputSearch(String search) {
        searchPage.getSearchInput().clear();
        searchPage.getSearchInput().sendKeys(search);
    }

    private void clickOnDescriptionBox(){
        new DriverUtils().clickOnElementJS(searchPage.getDescription());
    }


    private void clickSearchButton() {
        searchPage.getSearchButton().click();
    }

    public void verifyUserSearch() {
        String expectedMessage = "Apple Cinema 30";
        Assert.assertEquals(successSearchPage.getSuccessTitle().getText(), expectedMessage, "Incorrect page title");
    }

}
