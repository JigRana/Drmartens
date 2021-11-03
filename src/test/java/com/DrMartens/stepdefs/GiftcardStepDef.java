package com.DrMartens.stepdefs;

import com.DrMartens.pages.GiftcardPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class GiftcardStepDef {
    GiftcardPage giftcardPage = new GiftcardPage();

    @Given("User search for GiftCard")
    public void user_search_for_gift_card() {

        giftcardPage.setSearch();

    }

    @Given("User click on giftCard")
    public void user_click_on_giftCard() {

        giftcardPage.clickGiftCard();

    }

    @Given("User click Buy now")
    public void user_click_buy_now() {

        giftcardPage.setBuynow();
    }

    @Given("select gift card colour")
    public void select_gift_card_colour() {
        giftcardPage.setGiftcardcolour();
    }

    @When("User select giftCard amount {string}")
    public void userSelectGiftCardAmount(String amount) {
        giftcardPage.setAmount(amount);
    }


    @When("fill required recipient details")
    public void fill_required_recipient_details() {
        giftcardPage.setRcipientdetails();
    }
    @And("user select laterDate {string}")
    public void userSelectLaterDate(String date) {
        giftcardPage.selectLaterDate(date);
    }

    @When("click on add to bag button")
    public void click_on_add_to_bag_button() {
        giftcardPage.setAddtocart();
    }

    @Then("User can see selected Gift card successfully added to shopping cart")
    public void user_can_see_selected_gift_card_successfully_added_to_shopping_cart() {
        String  actualHeadLineText = giftcardPage.setHeadlinetext();
        Assert.assertEquals("Added to Your Shopping Cart",actualHeadLineText);
        String actualCartAmountText = giftcardPage.setGiftCardValueInBasket();
        Assert.assertEquals("£125.00",actualCartAmountText);


    }



}
