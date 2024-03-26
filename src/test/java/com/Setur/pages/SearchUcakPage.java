package com.Setur.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchUcakPage extends BasePage{

    @FindBy(xpath = "//*[@id=\"__next\"]/div[3]/div[2]/div[1]/div/div/div/div[3]/div[1]/div[1]/div/div[2]")
    public WebElement neredenGideceksiniz;

    @FindBy(xpath = "/html/body/div[6]/div[2]/div/div[2]/div/div[1]/div/div[2]/span[2]/input")
    public WebElement havalimaniVeyaSehir;

    @FindBy(xpath = "//*[@id=\"__next\"]/div[3]/div[2]/div[1]/div/div/div/div[3]/div[1]/div[2]/div/div[2]")
    public WebElement nereyeGideceksiniz;

    @FindBy(xpath = "/html/body/div[6]/div[2]/div/div[2]/div/div[2]/div/div/div/div[2]/div/div[2]/div[3]/div/table/tbody/tr[1]/td[3]/span/span")
    public WebElement gidisTarihi;
    @FindBy(xpath = "/html/body/div[6]/div[2]/div/div[2]/div/div[2]/div/div/div/div[2]/div/div[2]/div[3]/div/table/tbody/tr[1]/td[6]/span")
    public WebElement donusTarihi;

    @FindBy(xpath = "/html/body/div[6]/div[2]/div/div[2]/div/div[3]/button")
    public WebElement uygulaButonu;

    @FindBy(xpath = "//*[@id=\"__next\"]/div[3]/div[2]/div[1]/div/div/div/div[3]/button")
    public WebElement araButonu;

}
