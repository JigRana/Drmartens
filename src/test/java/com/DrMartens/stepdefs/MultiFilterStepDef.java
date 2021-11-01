package com.DrMartens.stepdefs;

import com.DrMartens.pages.ProductListPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

import static org.hamcrest.CoreMatchers.hasItem;
import static org.hamcrest.MatcherAssert.assertThat;

public class MultiFilterStepDef {
    ProductListPage productListPage = new ProductListPage();
    @When("User select facet {string}")
    public void user_select_facet(String filter) {
    productListPage.selectFacetFilter(filter);
    }

    @When("User select as per requirement {string}")
    public void user_select_as_per_requirement(String subFilter) {
    productListPage.selectSubFilter(subFilter);
         }

    @When("User click on apply button")
    public void user_click_on_apply_button() {
    productListPage.setClickOnApply();

    }

    @Then("User able to see respective product as per {string}")
    public void user_able_to_see_respective_product_as_per(String filterRange) {
    List<String> actualSelectedFilter = productListPage.checkSelectedFilter(filterRange);
        assertThat(actualSelectedFilter,hasItem(filterRange));
    }

}
