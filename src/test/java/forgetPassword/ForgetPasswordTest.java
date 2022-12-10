package forgetPassword;

import Basetest.BaseTest;
import org.testng.annotations.Test;
import pages.ForgotPassword;

import static org.testng.Assert.assertEquals;

public class ForgetPasswordTest extends BaseTest {
@Test
    public  void retivePassowrd(){
    ForgotPassword forgotPassword = homePage.retiveEmail();
    forgotPassword.enterEmail("ahmedziko500@gmail2.com");
    assertEquals(forgotPassword.getEmail(),"E-mail","you choose the wron choise  ");

    forgotPassword.preesbutton();

}
}
