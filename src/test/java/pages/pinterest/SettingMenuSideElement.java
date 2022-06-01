package pages.pinterest;

import org.openqa.selenium.By;
import pages.Common;

public class SettingMenuSideElement {

    private static String settingsMenu = "//div[@data-test-id='settings-menu']";
    public static By personalInformation = By.xpath(settingsMenu + "//div[@data-test-id='settings-menu-item-personal-info']");
    public static By socialPermissions = By.xpath(settingsMenu + "//div[@data-test-id='settings-menu-item-permissions']");

    public static void clickPersonalInformation() {
        Common.clickElement(personalInformation);
    }

    public static void clickSocialPermissions() {
        Common.clickElement(socialPermissions);
    }
}
