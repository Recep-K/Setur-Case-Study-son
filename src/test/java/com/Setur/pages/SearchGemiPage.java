package com.Setur.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchGemiPage extends BasePage{

    @FindBy(xpath = "/html/body/div[6]/div[2]/div/div[2]/div/div[1]/div/div[2]/div[2]/input")
    public WebElement nereyeGideceksiniz;

    @FindBy(xpath = "//*[@id=\"__next\"]/div[3]/div[2]/div[1]/div/div/div/div[3]/button")
    public WebElement araButonu;
}
