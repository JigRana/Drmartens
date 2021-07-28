package com.DrMartens.stepdefs;

import com.DrMartens.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDef  {
    LoginPage loginPage=new LoginPage();

    @When("User enter {string} and {string}")
    public void user_enter_and(String userName, String Password)
    {
        loginPage.setUserName(userName);
        loginPage.setPassword(Password);
    }
    @When("User click on SignIn Button")
    public void user_click_on_sign_in_button()
    {

        loginPage.setLoginButton();
    }
    @Then("User check {string} of Login")
    public void user_check_of_login(String status)
    {
       loginPage.loginAssert(status);
       loginPage.setSignout();

    }

}
