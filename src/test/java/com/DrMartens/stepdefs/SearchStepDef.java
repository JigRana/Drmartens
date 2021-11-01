package com.DrMartens.stepdefs;

import com.DrMartens.pages.ProductListPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.everyItem;
import static org.hamcrest.MatcherAssert.assertThat;

public class SearchStepDef {
    ProductListPage productListPage = new ProductListPage();
    @When("User search for Particular {string}")
    public void user_search_for_particular(String product) {
        productListPage.setSearch(product);


    }
    @Then("User can see respective {string} list")
    public void user_can_see_respective_list(String productRange) {
        List<String > actualProductList = productListPage.productList();
        assertThat(actualProductList,everyItem(containsString(productRange)));
    }


}
