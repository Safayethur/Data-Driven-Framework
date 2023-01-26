package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pom.Login;



public class LoginTest extends BaseTest {

    @Parameters({"validUsername", "validPassword"})
    @Test
    public void validUsernameValidPasswordTest(String username, String password) {
        Login obj = new Login(driver);
        obj.loginWithCredentials(username,password);
    }

    @Parameters({"invalidUsername", "invalidPassword"})
    @Test
    public void invalidUsernameInvalidPasswordTest(String username, String password) {
        Login obj = new Login(driver);
        obj.loginWithCredentials(username,password);
    }

    @Parameters({"invalidUsername", "validPassword"})
    @Test
    public void invalidUsernameValidPasswordTest(String username, String password) {
        Login obj = new Login(driver);
        obj.loginWithCredentials(username,password);
    }

    @Parameters({"validUsername", "invalidPassword"})
    @Test
    public void validUsernameInvalidPasswordTest(String username, String password) {
        Login obj = new Login(driver);
        obj.loginWithCredentials(username,password);
    }

    @Test
    public void blankUsernameBlankPasswordTest() {
        String username = " ";
        String password = " ";
        Login obj = new Login(driver);
        obj.loginWithCredentials(username,password);
    }
}
