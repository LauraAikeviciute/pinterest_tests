package tests.pinterest;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.Common;
import pages.pinterest.PublicLandingPage;
import tests.BaseTest;

public class PublicLandingPageTests extends BaseTest {

    @BeforeMethod
    public void open() {
        PublicLandingPage.open();
        PublicLandingPage.waitToLoad();
    }

    @Test
    public void checkTopHeaderElementsTest() {

        // check logo displayed
        By pinterestLogo = PublicLandingPage.pinterestLogo;
        boolean isLogoDisplayed = Common.isElementPresent(pinterestLogo);
        Assert.assertTrue(isLogoDisplayed);

        // check 'Log in' displayed
        By simpleLoginButton = PublicLandingPage.simpleLoginButton;
        boolean isLoginDisplayed = Common.isElementDisplayed(simpleLoginButton);
        Assert.assertTrue(isLoginDisplayed);

        // check 'Log in' text
        String actualLoginText = Common.getElementText(simpleLoginButton);
        String expectedLoginText = "Log in";
        Assert.assertEquals(actualLoginText, expectedLoginText);

        // check 'Sign up' displayed
        By simpleSignupButton = PublicLandingPage.simpleSignupButton;
        boolean isSignupDisplayed = Common.isElementDisplayed(simpleSignupButton);
        Assert.assertTrue(isSignupDisplayed);

        // check 'Sign up' text
        String actualSignupText = Common.getElementText(simpleSignupButton);
        String expectedSignupText = "Sign up";
        Assert.assertEquals(actualSignupText, expectedSignupText);

    }

}
