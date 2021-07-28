package com.DrMartens.drivermanger;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class DriverManger {
    public static WebDriver driver;
    JavascriptExecutor js;

    public DriverManger() {
        PageFactory.initElements(driver, this);
    }

    public void OpenBrowser(String browser) {
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


    public void Close(){
        driver.close();
    }
    }


