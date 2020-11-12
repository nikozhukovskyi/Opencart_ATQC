import com.opencart.navigation.Navigation;
import com.opencart.pages.BasePage;
import com.opencart.steps.login.LoginPageBL;
import com.opencart.steps.MainPageBL;
import org.testng.annotations.Test;

import static com.opencart.enums.URLs.BASE_URL;

public class UserLoginTest extends BaseTest{

    @Test
    public void loginUserWithValidParameters() {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        BasePage basePage = new BasePage();
        MainPageBL mainPageBL = new MainPageBL();
        LoginPageBL loginPageBL = mainPageBL.getHeaderPageBL()
                .clickOnMyAccountButton()
                .clickOnLoginButton()
                .loginPerson();
        loginPageBL.verifyUserLogin();
    }
}
