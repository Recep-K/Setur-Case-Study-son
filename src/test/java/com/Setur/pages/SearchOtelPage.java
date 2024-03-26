package com.Setur.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchOtelPage extends BasePage{

    @FindBy(xpath = "/html/body/div[4]/div[2]/div/div[2]/div/div[1]/div")
    public WebElement nereyeGideceksiniz;
    @FindBy(xpath = "/html/body/div[2]/div[2]/div/div[2]/div/div[1]/div/div[2]/div[2]/input\n")
    public WebElement input;
    @FindBy(xpath = "/html/body/div[6]/div[2]/div/div[2]/div/div[2]/div/div[8]/div/div")
    public WebElement sehir;

    @FindBy(xpath = "//html/body/div[6]/div[2]/div/div[2]/div/div[3]/button")
    public WebElement uygulaButonu;

    @FindBy(xpath = "/html/body/div[6]/div[2]/div/div[2]/div/div[2]/div/div/div/div[2]/div/div[2]/div[3]/div/table/tbody/tr[1]/td[3]/span")
    public WebElement gidisTarihi;

    @FindBy(xpath = "/html/body/div[6]/div[2]/div/div[2]/div/div[2]/div/div/div/div[2]/div/div[2]/div[3]/div/table/tbody/tr[1]/td[6]/span")
    public WebElement donusTarihi;

    @FindBy(xpath = "//*[@id=\"__next\"]/div[3]/div[2]/div[1]/div/div/div/div[7]/button")
    public WebElement araButonu;

}
