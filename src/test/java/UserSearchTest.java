import com.opencart.navigation.Navigation;
import com.opencart.pages.BasePage;
import com.opencart.steps.MainPageBL;
import com.opencart.steps.search.SearchPageBL;
import org.testng.annotations.Test;

import static com.opencart.enums.URLs.BASE_URL;

public class UserSearchTest extends BaseTest{

    @Test
    public void SearchUserWithValidParameters() {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        MainPageBL mainPageBL = new MainPageBL();
        SearchPageBL searchPageBL = mainPageBL.getHeaderPageBL()
                .clickOnSearchButton()
                .SearchProduct();
       searchPageBL.verifyUserSearch();
    }
}
