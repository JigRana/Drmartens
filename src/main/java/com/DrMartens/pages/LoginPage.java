package com.DrMartens.pages;

import com.DrMartens.drivermanger.DriverManger;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends DriverManger {



    @FindBy(id = "j_username")
    WebElement UserName;
    @FindBy(id = "j_password")
    WebElement Password;
    @FindBy(xpath = "//button[contains(text(),'Log In')]")
    WebElement LoginButton;
    @FindBy(css = "li.logged_in.js-logged_in")
    WebElement welcome;
   // @FindBy(css = "//ul[@class='nav__links nav__links--account']/li[2]")
    @FindBy(css = ".liOffcanvas")
    WebElement Signout;
    @FindBy(xpath = "//div[contains(text(),'Your username or password was incorrect.')]")
    WebElement Errormessage;

    public void setUserName(String userName) {
        UserName.sendKeys(userName);
    }

    public void setPassword(String password) {
        Password.sendKeys(password);
    }

    public void setLoginButton() {
        LoginButton.click();
    }




    public void loginAssert(String status) {
        if (status.equalsIgnoreCase("valid")){
        String message1 = welcome.getText();
        System.out.println(message1);
        Assert.assertTrue(message1.contains("WELCOME"));

                }
        else {
           String message=Errormessage.getText();
            System.out.println(message);
            Assert.assertTrue(message.contains("INCORRECT"));

        }
    }
    public void setSignout(){
        Signout.click();
    }

}