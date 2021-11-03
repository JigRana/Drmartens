package com.DrMartens.drivermanger;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class DriverManger {
    public static WebDriver driver;
    JavascriptExecutor js;

    public DriverManger() {
        PageFactory.initElements(driver, this);
    }

    public DriverManger OpenBrowser(String browser) {
        switch (browser) {
            case "ie":
                WebDriverManager.iedriver().setup();
                driver = new InternetExplorerDriver();
                break;
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
            default :
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;
        }
        return this;

    }

    public void NavigateToURL(String url) {
        driver.navigate().to(url);
    }

    public void MaxBrowser() {
        driver.manage().window().maximize();
    }

    public void ImplicitliWait() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
    }
    public void ScrollByJavaScriptExecutor(int y, int x) {
        js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(" + y + "," + x + ")");
    }

    public void sleep(int ms) {

            try {
                Thread.sleep(ms);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


    public DriverManger Close(){
        driver.close();
        return this;
    }

    //Wherever clickable action you can use this to check button clickable or not?
    public WebElement isBtnClickable(WebElement element){
        new WebDriverWait(driver,5)
                .until(ExpectedConditions.elementToBeClickable(element));
        return element;
    }
    //when some product displaying you need to say selenium to wait until some product loaded
    public void waitUntilNumOfElementsGrater(By element, int number){
        new WebDriverWait(driver,5)
                .until(ExpectedConditions.numberOfElementsToBeMoreThan(element,number));
    }

    public WebElement waitUntilElementVisible(WebElement element){
        new WebDriverWait(driver,5)
                .until(ExpectedConditions.visibilityOf(element));
        return element;
    }

    }


