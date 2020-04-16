package com.automation.tests;
import com.automation.pages.LoginPage;
import com.automation.pages.UserStory11_Downloading;
import org.testng.annotations.Test;

public class UserStory11_DownloadingTest extends AbstractBaseTest {

    @Test
    public void clickOnMacOSTest() {
        LoginPage loginPage = new LoginPage();
        loginPage.login();
        UserStory11_Downloading userStory11_downloading = new UserStory11_Downloading();
        userStory11_downloading.clickToMacOS();
    }

    @Test
    public void clickOnWindows(){
        LoginPage loginPage = new LoginPage();
        loginPage.login();
        UserStory11_Downloading userStory11_downloading = new UserStory11_Downloading();
        userStory11_downloading.clickToWindows();
    }

    @Test
    public void clickOnLinux(){
        LoginPage loginPage = new LoginPage();
        loginPage.login();
        UserStory11_Downloading userStory11_downloading = new UserStory11_Downloading();
        userStory11_downloading.clickToLinux();
        //Assert.assertTrue();
    }
}
