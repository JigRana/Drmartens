package com.DrMartens.stepdefs;

import com.DrMartens.pages.HomePage;
import io.cucumber.java.en.Given;
import org.junit.Assert;

public class HomePageStepDef {
    HomePage homePage= new HomePage();
    @Given("User is on Home page")
    public void user_is_on_home_page()
    {

        homePage.setCookieAccept();
        homePage.setCountryselect();
        String actual = homePage.getCurrentUrl();
        String expected= "https://www.drmartens.com/uk/en_gb/";
        Assert.assertEquals(actual,expected);
    }
    @Given("click on sign In link")
    public void click_on_sign_in_link()
    {

        homePage.setSignIn();
    }

}
