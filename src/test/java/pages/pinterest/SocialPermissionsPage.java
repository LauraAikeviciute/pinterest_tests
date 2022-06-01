package pages.pinterest;

import org.openqa.selenium.By;
import pages.Common;

public class SocialPermissionsPage {

    public static By manualFilterCheckbox = By.xpath("//input[@id='manual_filters']");
    public static By blockedWordsTextArea = By.xpath("//textarea[@id='blocked_words']");

    public static void clickManualFilterCheckbox() {
        Common.clickElement(manualFilterCheckbox);
    }

    public static boolean isBlockedWordsTextAreaDisplayed() {
        return Common.isElementDisplayed(blockedWordsTextArea);
    }

}
