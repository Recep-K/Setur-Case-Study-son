package com.Setur.pages;

import com.Setur.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }

    public void navigateTo(String tab) {

        Driver.get().findElement(By.linkText(tab)).click();
    }

    @FindBy(xpath = "//*[@id=\"CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll\"]")
    public WebElement acceptAllCookies;

    @FindBy(xpath = "//*[@id=\"close-button-1454703513202\"]/span")
    public WebElement closeButton;

    @FindBy(css = ".fas.fa-file-csv")
    public WebElement csv;

    @FindBy(css = ".fas.fa-file-csv")
    public WebElement opencsv;

    @FindBy(xpath = "//*[@id=\"app\"]/div/main/div/div/div/div[2]/div[4]/div/button")
    public WebElement logoutButton;



}
