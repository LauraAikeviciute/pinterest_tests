package pages.pinterest;

import org.openqa.selenium.By;
import pages.Common;

public class PublicLandingPage {

    private static String unauthHeader = "//div[@data-test-id='unauth-header']";
    public static By pinterestLogo = By.xpath(unauthHeader + "//div[@data-test-id='unauth-header-logo']");
//    public static By aboutButton = By.xpath(unauthHeader + "//div[@data-test-id='header-about-button']");
//    public static By businessButton = By.xpath(unauthHeader + "//div[@data-test-id='header-business-button']");
//    public static By blogButton = By.xpath(unauthHeader + "//div[@data-test-id='header-blog-button']");
    public static By simpleLoginButton = By.xpath(unauthHeader + "//div[@data-test-id='simple-login-button']");
    public static By simpleSignupButton = By.xpath(unauthHeader + "//div[@data-test-id='simple-signup-button']");

    public static void open() {
        Common.openUrl("https://www.pinterest.com/");
    }

    public static void waitToLoad() {
        Common.waitForElementToBeVisible(pinterestLogo);
    }

    public static void clickLogin() {
        Common.clickElement(simpleLoginButton);
    }
}
