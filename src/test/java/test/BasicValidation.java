package test;

import org.testng.Reporter;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class BasicValidation extends BaseTest {

    @Test
    public void titleValidation() {
        String expectedTitle = "Facebook - log in or sign up";
        String actualTitle = driver.getTitle();

        Reporter.log("Expected Title = " + expectedTitle);
        Reporter.log("Actual Title = " + actualTitle);

        assertTrue(actualTitle.equals(expectedTitle), "Page title validation failed");

    }
}
