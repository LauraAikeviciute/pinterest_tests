package pages.pinterest;

import org.openqa.selenium.By;
import pages.Common;

public class LoggedInLandingPage {

    private static String header = "//div[@data-test-id='header-Header']";
    public static By homeButton = By.xpath(header + "//div[@class='Eqh fev zI7 iyn Hsu']");
    public static By searchInput = By.xpath(header + "//div[@id='searchBoxContainer']//input");
    public static By searchFilter = By.xpath(header + "//div[@data-test-id='search-filter']");
    public static By avatarButton = By.xpath(header + "//div[@data-test-id='header-profile']");

    public static void open() {
        Common.openUrl("https://www.pinterest.com/");
    }

    public static void waitToLoad() {
        Common.waitForElementToBeClickable(searchInput);
    }

    public static void search(String searchText) {
        Common.sendKeysToElement(searchInput, searchText);
        Common.sendEnterToElement(searchInput);
    }

    public static void clickOnAvatar() {
        Common.clickElement(avatarButton);
    }
}
