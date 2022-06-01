package pages.pinterest;

import org.openqa.selenium.By;
import pages.Common;

public class ProfilePage {

    private static String profileHeader = "//div[@data-test-id='profile-header']";
    public static By profileTitle = By.xpath(profileHeader + "//h1");
    public static By usernameElement = By.xpath(profileHeader + "//span");
    public static By editProfileButton = By.xpath(profileHeader + "//div[@data-test-id='edit-button']");

    public static void clickEditProfileButton() {
        Common.clickElement(editProfileButton);
    }
}
