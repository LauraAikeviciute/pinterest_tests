package tests.pinterest;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.Common;
import pages.pinterest.WelcomeToPinterestElement;
import pages.pinterest.PublicLandingPage;
import tests.BaseTest;

public class WelcomeToPinterestElementTests extends BaseTest {

    @BeforeMethod
    public void openAndClickLogin() {
        PublicLandingPage.open();
        PublicLandingPage.clickLogin();
        WelcomeToPinterestElement.waitToLoad();
    }

    @Test
    public void checkLoginPageElementsTest() {

        // check 'welcome' displayed
        By welcomeElement = WelcomeToPinterestElement.welcomeElement;
        boolean elementDisplayed = Common.isElementDisplayed(welcomeElement);
        Assert.assertTrue(elementDisplayed);

        // check 'welcome' text
        String actualWelcomeElementText = Common.getElementText(welcomeElement);
        String expectedWelcomeElementText = "Welcome to Pinterest";
        Assert.assertEquals(actualWelcomeElementText, expectedWelcomeElementText);

        // check 'close' button displayed
        By closeButton = WelcomeToPinterestElement.closeButton;
        boolean isCloseButtonDisplayed = Common.isElementDisplayed(closeButton);
        Assert.assertTrue(isCloseButtonDisplayed);

        // check 'with facebook' displayed
        By loginWithFacebookButton = WelcomeToPinterestElement.loginWithFacebookButton;
        boolean isWithFacebookDisplayed = Common.isElementDisplayed(loginWithFacebookButton);
        Assert.assertTrue(isWithFacebookDisplayed);

        // check 'with facebook' text
        String actualWithFacebookText = Common.getElementText(loginWithFacebookButton);
        String expectedWithFacebookText = "Continue with Facebook";
        Assert.assertEquals(actualWithFacebookText, expectedWithFacebookText);

        // check 'with google' displayed
        By loginWithGoogleButton = WelcomeToPinterestElement.loginWithGoogleButton;
        boolean isWithGoogleDisplayed = Common.isElementDisplayed(loginWithGoogleButton);
        Assert.assertTrue(isWithGoogleDisplayed);

    }
}
