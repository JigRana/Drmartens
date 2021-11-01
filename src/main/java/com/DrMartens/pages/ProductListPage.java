package com.DrMartens.pages;

import com.DrMartens.drivermanger.DriverManger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProductListPage extends DriverManger {
    @FindBy(css = "#js-site-search-input")
    WebElement search;
    @FindBy(css = ".product__list__item__name.atb-hover-item")
    List<WebElement> productRange;
    @FindBy(css = ".facet__title")
    List<WebElement> facetFilers;
    @FindBy(css = "a[class='facet__label__item js-facet-label _unselect']")
    List<WebElement> subFilters;
    @FindBy(css = "button[class='facet__btn--black btn-block js-facet-apply']")
    List<WebElement> apply;
    @FindBy(css = ".facet__applied.js-facet-remove")
    List<WebElement> selectedFilters;



    public void setSearch(String product){
        search.sendKeys(product, Keys.ENTER);
        sleep(6000);
    }

    public List<String> productList(){
        List<String> productDesc = new ArrayList<>();
        for (WebElement product :productRange){
            String productText = product.getText();
            productDesc.add(productText);
        }
        return productDesc;
    }

    public void selectFacetFilter(String filter){
       for (WebElement facetFilter : facetFilers)
       {
           String facetFilterText = facetFilter.getText();
           //System.out.println(facetFilterText);
           if (facetFilterText.equalsIgnoreCase(filter))
           {
               facetFilter.click();
               break;
           }

       }
       sleep(2000);
    }
    public void selectSubFilter(String subFil){
        for (WebElement subFilter : subFilters){
           List <String> subFilterText = Arrays.asList (subFilter.getText().trim().split(" "));
            //WOMENS (209), // WOMENS,(209)
            String stringIndex0 = subFilterText.get(0);
            //System.out.println(stringIndex0);

            System.out.println(subFilterText);
            if (stringIndex0.equalsIgnoreCase(subFil))
            {
                subFilter.click();
                break;
            }
        }

    }
    public void setClickOnApply(){
        for (WebElement app :apply){
            String applyText = app.getText();
            System.out.println(applyText);
            if(applyText.equalsIgnoreCase("apply")){
                app.click();
                break;
            }
        }
        sleep(3000);
    }
    public List<String> checkSelectedFilter(String filterRange){
        List<String> actualFilter = new ArrayList<>();
        for (WebElement selectedFilter : selectedFilters){
            String selectedFilterText = selectedFilter.getText();
            actualFilter.add(selectedFilterText);
            System.out.println(actualFilter);
        }
        return actualFilter;
    }

}
