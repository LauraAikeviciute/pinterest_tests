package tests.pinterest;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Common;
import pages.Constants;
import pages.pinterest.LoggedInLandingPage;
import pages.pinterest.PersonalInformationPage;
import pages.pinterest.ProfilePage;
import pages.pinterest.SettingMenuSideElement;
import pages.pinterest.SocialPermissionsPage;
import tests.BaseLoggedInTest;
// prevent from logging in for each tests in this class
public class LoggedInTests extends BaseLoggedInTest {

    @Test
    public void checkAllPinsElementAfterSearch() {

        // input 'dog' and press enter
        String searchText = "dog";
        LoggedInLandingPage.search(searchText);

        // check search filter displayed
        By searchFilter = LoggedInLandingPage.searchFilter;
        boolean isSearchFilterDisplayed = Common.isElementDisplayed(searchFilter);
        Assert.assertTrue(isSearchFilterDisplayed);

        // check search filter text
        String actualSearchFilterText = Common.getElementText(searchFilter);
        String expectedSearchFilterText = "All Pins";
        Assert.assertEquals(actualSearchFilterText, expectedSearchFilterText);
    }

    @Test
    public void correctNameAfterSuccessfulLoginTest() {

        // click on avatar
        LoggedInLandingPage.clickOnAvatar();

        // check profile title text
        String actualProfileTitleText = Common.getElementText(ProfilePage.profileTitle);
        String expectedProfileTitleText = Constants.profileTitle;
        Assert.assertEquals(actualProfileTitleText, expectedProfileTitleText);

        // check username text
        String actualUserNameText = Common.getElementText(ProfilePage.usernameElement);
        String expectedUserNameText = Constants.usernameWithEta;
        Assert.assertEquals(actualUserNameText, expectedUserNameText);
    }

    @Test
    public void tryToChangeGenderInSettingsTest() {

        // click on avatar
        LoggedInLandingPage.clickOnAvatar();

        // click on 'Edit Profile'
        ProfilePage.clickEditProfileButton();

        // click 'Personal information' on the left side
        SettingMenuSideElement.clickPersonalInformation();

        // let's find out if 'male' or 'female' are selected (element is 'checked')
        boolean isMaleRadioChecked = PersonalInformationPage.isMaleRadioChecked();
        boolean isFemaleRadioChecked = PersonalInformationPage.isFemaleRadioChecked();

        // fail test if both are checked
        if (isMaleRadioChecked && isFemaleRadioChecked) {
            Assert.fail("'Male' and 'Female' can not be both checked.");
        }

        // check 'Reset' button disabled
        boolean resetButtonDisabled = PersonalInformationPage.isResetButtonDisabled();
        Assert.assertTrue(resetButtonDisabled);

        // check 'Save' button disabled
        boolean saveButtonDisabled = PersonalInformationPage.isSaveButtonDisabled();
        Assert.assertTrue(saveButtonDisabled);

        // if 'male' was checked – click 'female', otherwise – click 'male'
        if (isMaleRadioChecked) {
            PersonalInformationPage.clickFemaleRadio();
        } else {
            PersonalInformationPage.clickMaleRadio();
        }

        // check 'Reset' button not disabled
        resetButtonDisabled = PersonalInformationPage.isResetButtonDisabled();
        Assert.assertFalse(resetButtonDisabled);

        // check 'Save' button not disabled
        saveButtonDisabled = PersonalInformationPage.isSaveButtonDisabled();
        Assert.assertFalse(saveButtonDisabled);
    }

    @Test
    public void tryToChangeManualFilterInSettingsTest() {

        // click on avatar
        LoggedInLandingPage.clickOnAvatar();

        // click on 'Edit Profile'
        ProfilePage.clickEditProfileButton();

        // click 'Social permissions' on the left side
        SettingMenuSideElement.clickSocialPermissions();

        // check 'Blocked words' status
        boolean originalStatus = SocialPermissionsPage.isBlockedWordsTextAreaDisplayed();

        // click 'Manual filter' checkbox
        SocialPermissionsPage.clickManualFilterCheckbox();

        // check 'Blocked words' status has changed
        boolean afterChangeStatus = SocialPermissionsPage.isBlockedWordsTextAreaDisplayed();
        Assert.assertNotEquals(afterChangeStatus, originalStatus);

    }

}
