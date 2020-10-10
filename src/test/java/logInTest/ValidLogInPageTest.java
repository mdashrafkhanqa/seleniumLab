package logInTest;

import base.ScriptBase;
import logInController.ValidLogInController;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ValidLogInPageTest extends ScriptBase {
    ValidLogInController validLogInController;

    @BeforeTest
    public void beforeTest(){
        init();
    }

    @Test
    public void verifyAccountTab(){
        validLogInController = new ValidLogInController(driver);
        validLogInController.accountTabVerification();
    }
}
