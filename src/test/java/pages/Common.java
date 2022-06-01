package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.Driver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class Common {

    public static void openUrl(String url) {
        Driver.getDriver().get(url);
    }

    public static WebElement getElement(By locator) {
        return Driver.getDriver().findElement(locator);
    }

    public static List<WebElement> getElements(By locator) {
        return Driver.getDriver().findElements(locator);
    }

    public static void clickElement(By locator) {
        getElement(locator).click();
    }

    public static void sendKeysToElement(By locator, String keys) {
        getElement(locator).sendKeys(keys);
    }

    public static void sendEnterToElement(By locator) {
        getElement(locator).sendKeys(Keys.ENTER);
    }

    public static String getElementText(By locator) {
        return getElement(locator).getText();
    }

    public static void selectOptionByValue(By locator, String value) {
        WebElement webElement = getElement(locator);
        Select selectElement = new Select(webElement);
        selectElement.selectByValue(value);
    }

    public static String getElementAttributeValue(By locator, String attributeName) {
        return getElement(locator).getAttribute(attributeName);
    }

    public static boolean isAttributePresent(By locator, String attributeName) {
        boolean result = false;
        try {
            String value = getElement(locator).getAttribute(attributeName);
            if (value != null) {
                result = true;
            }
        } catch (Exception e) {
        }
        return result;
    }

    public static List<Boolean> getSelectedStatusForCheckboxesByLocator(By locator) {

        List<WebElement> elements = Common.getElements(locator);

        List<Boolean> statusList = new ArrayList(Arrays.asList());

        for (WebElement element : elements) {

            statusList.add(element.isSelected());
        }

        return statusList;
    }

    public static void acceptAlert() {
        Driver.getDriver().switchTo().alert().accept();
    }

    public static void waitForElementToBeVisible(By locator) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Constants.TIMEOUT);
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public static void waitForElementToBeClickable(By locator) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Constants.TIMEOUT);
        wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    public static void waitForElementAttributeToContain(By locator, String attributeName, String attributeValue) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Constants.TIMEOUT);
        wait.until(ExpectedConditions.attributeContains(locator, attributeName, attributeValue));
    }

    public static boolean isAlertPresent() {
        try {
            Driver.getDriver().switchTo().alert();
            return true;
        } catch (NoAlertPresentException ex) {
            return false;
        }
    }

    public static void dismissAlert() {
        Driver.getDriver().switchTo().alert().dismiss();
    }

    public static void sendKeysToAlert(String keys) {
        Driver.getDriver().switchTo().alert().sendKeys(keys);
    }

    public static Boolean isElementPresent(By locator) {
        List<WebElement> elements = getElements(locator);
        if (elements.size() > 0) {
            return true;
        } else {
            return false;
        }
    }

    public static Boolean isElementDisplayed(By locator) {
        Boolean elementPresent = isElementPresent(locator);
        if (elementPresent) {
            WebElement element = getElement(locator);
            boolean isDisplayed = element.isDisplayed();
            return isDisplayed;
        } else {
            return false;
        }
    }

    public static void doubleClick(By locator) {
        WebElement element = getElement(locator);

        Actions action = new Actions(Driver.getDriver());

        action.moveToElement(element);
        action.doubleClick();
        action.perform();
    }

    public static void rightClick(By locator) {
        WebElement element = getElement(locator);

        Actions action = new Actions(Driver.getDriver());

        action.moveToElement(element);
        action.contextClick();
        action.perform();
    }

    public static Set<String> getCurrentWindowsHandles() {
        return Driver.getDriver().getWindowHandles();
    }

    public static String getCurrentWindowHandle() {
        return Driver.getDriver().getWindowHandle();
    }

    public static void switchToWindowByHandle(String handle) {
        Driver.getDriver().switchTo().window(handle);
    }

    public static void closeWindowByHandle(String handle) {
        Driver.getDriver().switchTo().window(handle);
        Driver.getDriver().close();
    }
}




















