package com.automation.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UserStory11_Downloading extends AbstractBasePage {

    @FindBy(xpath = "//span[text()='Mac OS']")
    private WebElement MacOS;

    @FindBy(xpath = "//span[text()='Windows']")
    private WebElement Windows;

    @FindBy(xpath = "//span[text()='Linux']")
    private WebElement Linux;

    public void clickToMacOS(){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(MacOS)).click();
    }

    public void clickToWindows(){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(Windows));
    }

    public void clickToLinux(){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(Linux));
    }






}
