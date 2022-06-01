package pages.pinterest;

import org.openqa.selenium.By;
import pages.Common;
import pages.Constants;

public class WelcomeToPinterestElement {

    private static String loginModalDefault = "//div[@data-test-id='login-modal-default']";
    public static By welcomeElement = By.xpath(loginModalDefault + "//h1");
    public static By closeButton = By.xpath(loginModalDefault + "//div[@data-test-id='full-page-signup-close-button']");
    public static By emailInput = By.xpath(loginModalDefault + "//div[@data-test-id='emailInputField']//input");
    public static By passwordInput = By.xpath(loginModalDefault + "//div[@data-test-id='passwordInputField']//input");
    public static By loginButton = By.xpath(loginModalDefault + "//div[@data-test-id='registerFormSubmitButton']/button");
    public static By loginWithFacebookButton = By.xpath(loginModalDefault + "//div[@data-test-id='facebook-connect-button']");
    public static By loginWithGoogleButton = By.xpath(loginModalDefault + "//div[@data-test-id='google-connect-button']");

    public static void waitToLoad() {
        Common.waitForElementToBeVisible(welcomeElement);
    }

    public static void logIn() {
        Common.sendKeysToElement(emailInput, Constants.email);
        Common.sendKeysToElement(passwordInput, Constants.password);
        Common.clickElement(loginButton);
    }

}
