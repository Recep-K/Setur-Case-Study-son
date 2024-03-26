package com.Setur.tests;

import com.Setur.pages.SearchOtelPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Search {
    public static void main(String[] args) throws InterruptedException {

            WebDriverManager.chromedriver().setup();

            ChromeOptions options = new ChromeOptions();
            options.addArguments("disable-popup-blocking");
            options.addArguments("disable-notifications");
            options.addArguments("disable-media-stream");

            WebDriver driver = new ChromeDriver(options);

            driver.manage().window().maximize();

            driver.get("https://www.setur.com.tr");
            Thread.sleep(7000);

            // Hediye Çarkındaki kapatma tuşunun tıklanması
            WebElement closeCark = driver.findElement(By.xpath("(//*[@id=\"close-button-1454703513202\"])[2]"));

            // Explicit Wait
            WebDriverWait wait = new WebDriverWait(driver,60);
            wait.until(ExpectedConditions.visibilityOf(closeCark));
            wait.until(ExpectedConditions.elementToBeClickable(closeCark));
            closeCark.click();

            // Verilerin sorumlu kullanımı alanında Tümüne izin vere tıklanması
            WebElement allowCookie = driver.findElement(By.id("CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll"));
            Thread.sleep(2000);
            allowCookie.click();

            Thread.sleep(10000);
           SearchOtelPage searchOtelPage = new SearchOtelPage();

            WebElement nereye = driver.findElement(By.xpath("//*[@class=\"sc-5836d1c2-7.fnfCed\"]"));

        // Explicit Wait
            WebDriverWait wait2 = new WebDriverWait(driver,60);
            wait2.until(ExpectedConditions.visibilityOf(nereye));
            wait2.until(ExpectedConditions.elementToBeClickable(nereye));
            nereye.click();
            nereye.sendKeys("Paris");

           searchOtelPage.nereyeGideceksiniz.click();
            Thread.sleep(5000);

            searchOtelPage.input.sendKeys("Paris");

            searchOtelPage.sehir.sendKeys("Paris");
            BrowserUtils.waitFor(3);

            searchOtelPage.gidisTarihi.click();
            searchOtelPage.donusTarihi.click();
            searchOtelPage.uygulaButonu.click();

            driver.close();
        }
    }

