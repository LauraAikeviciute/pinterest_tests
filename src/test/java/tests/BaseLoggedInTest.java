package tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import pages.pinterest.PublicLandingPage;
import pages.pinterest.WelcomeToPinterestElement;
import utilities.Driver;
import utilities.TestListener;

@Listeners(TestListener.class)
public class BaseLoggedInTest {

    @BeforeClass
    public void setup() {
        Driver.setDriver();
        PublicLandingPage.open();
        PublicLandingPage.clickLogin();
        WelcomeToPinterestElement.logIn();
    }

    @AfterClass
    public void teardown() {
        Driver.closeDriver();
    }

}
