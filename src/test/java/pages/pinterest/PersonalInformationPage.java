package pages.pinterest;

import org.openqa.selenium.By;
import pages.Common;

public class PersonalInformationPage {

    public static By maleRadio = By.xpath("//div[@data-test-id='settings-gender']//input[@id='male']");
    public static By femaleRadio = By.xpath("//div[@data-test-id='settings-gender']//input[@id='female']");
    public static By resetButton = By.xpath("//div[@data-test-id='cancel-button']/button");
    public static By saveButton = By.xpath("//div[@data-test-id='done-button']/button");

    public static void open() {
        Common.openUrl("https://www.pinterest.com/settings/personal-information/");
    }

    public static void waitToLoad() {
        Common.waitForElementToBeVisible(By.xpath("//div[@data-test-id='settings-gender']"));
        Common.waitForElementToBeVisible(By.xpath("//div[@data-test-id='settings-gender']"));
        Common.waitForElementToBeVisible(By.xpath("//div[@data-test-id='done-button']"));
    }

    public static void clickMaleRadio() {
        Common.clickElement(maleRadio);
    }

    public static boolean isMaleRadioChecked() {
        return Common.isAttributePresent(maleRadio, "checked");
    }

    public static void clickFemaleRadio() {
        Common.clickElement(femaleRadio);
    }

    public static boolean isFemaleRadioChecked() {
        return Common.isAttributePresent(femaleRadio, "checked");
    }

    public static boolean isResetButtonDisabled() {
        boolean isDisabled = Common.isAttributePresent(resetButton, "disabled");
        return isDisabled;
    }

    public static boolean isSaveButtonDisabled() {
        boolean isDisabled = Common.isAttributePresent(saveButton, "disabled");
        return isDisabled;
    }

    public static void save() {
        Common.clickElement(saveButton);
    }
}
