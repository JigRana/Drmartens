package com.DrMartens.pages;

import com.DrMartens.drivermanger.DriverManger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends DriverManger {

    @FindBy(css = "#country-modal-submit")
    WebElement continueshopping;
    @FindBy(css = "#onetrust-accept-btn-handler")
    WebElement CookieAccept;
    @FindBy(xpath ="//li[@class='liOffcanvas']/a" )
    WebElement SignIn;
    public void setCountryselect()
    {
        ScrollByJavaScriptExecutor(0,300);
        continueshopping.click();
        sleep(2000);
    }

    public void setCookieAccept()
    {

        CookieAccept.click();
        sleep(2000);
    }

    public void setSignIn()
    {
        SignIn.click();
    }
    public String getCurrentUrl()
    {

        return driver.getCurrentUrl();
    }
}

