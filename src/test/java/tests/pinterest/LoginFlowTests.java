package tests.pinterest;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.Common;
import pages.Constants;
import pages.pinterest.LoggedInLandingPage;
import pages.pinterest.PublicLandingPage;
import pages.pinterest.WelcomeToPinterestElement;
import tests.BaseTest;

public class LoginFlowTests extends BaseTest {

    @BeforeMethod
    public void openAndClickLogin() {
        PublicLandingPage.open();
        PublicLandingPage.clickLogin();
        WelcomeToPinterestElement.waitToLoad();
    }

    @Test
    public void homeButtonAfterSuccessfulLoginTest() {

        // login flow
        By emailInput = WelcomeToPinterestElement.emailInput;
        Common.sendKeysToElement(emailInput, Constants.email);
        By passwordInput = WelcomeToPinterestElement.passwordInput;
        Common.sendKeysToElement(passwordInput, Constants.password);
        By loginButton = WelcomeToPinterestElement.loginButton;
        Common.clickElement(loginButton);
        LoggedInLandingPage.waitToLoad();

        // check 'Home' is displayed
        By homeButton = LoggedInLandingPage.homeButton;
        boolean isHomeButtonDisplayed = Common.isElementDisplayed(homeButton);
        Assert.assertTrue(isHomeButtonDisplayed);

        // check 'Home' text
        String actualHomeButtonText = Common.getElementText(homeButton);
        String expectedHomeButtonText = "Home";
        Assert.assertEquals(actualHomeButtonText, expectedHomeButtonText);
    }

}
