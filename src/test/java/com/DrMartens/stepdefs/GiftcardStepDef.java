package com.DrMartens.stepdefs;

import com.DrMartens.pages.GiftcardPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GiftcardStepDef {
    GiftcardPage giftcardPage = new GiftcardPage();

    @Given("User click on giftcard")
    public void user_click_on_giftcard() {
        giftcardPage.setGiftcard();
    }

    @Given("User click Buy now")
    public void user_click_buy_now() {
        giftcardPage.setBuynow();
    }

    @Given("select gift card colour")
    public void select_gift_card_colour() {
        giftcardPage.setGiftcardcolour();
    }

    @When("User select giftcard amount")
    public void user_select_giftcard_amount() {
        giftcardPage.setAmount();
    }

    @When("fill required recipient details")
    public void fill_required_recipient_details() {
        giftcardPage.setRcipientdetails();
    }

    @When("click on add to bag button")
    public void click_on_add_to_bag_button() {
        giftcardPage.setAddtocart();
    }

    @Then("User can see selected Gift card succesfully added to shopping cart")
    public void user_can_see_selected_gift_card_succesfully_added_to_shopping_cart() {
        giftcardPage.setHeadlinetext();

    }

}
