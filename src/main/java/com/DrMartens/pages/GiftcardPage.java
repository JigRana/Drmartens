package com.DrMartens.pages;

import com.DrMartens.drivermanger.DriverManger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class GiftcardPage extends DriverManger {
    @FindBy(css = "#js-site-search-input")
    WebElement search;
    @FindBy(linkText = "gift card")
    WebElement giftCardText;
    @FindBy(css = "#country-modal-submit")
    WebElement continueshopping;
    @FindBy(css = "#onetrust-accept-btn-handler")
    WebElement CookieAccept;
    @FindBy (xpath = "//div[@class='dm-navigation-topbar']/div[2]/div[1]")
    WebElement giftcard;
    @FindBy (xpath = "//div[@class='col-xs-12 col-md-6 col-md-offset-3']/div/div[1]")
    WebElement buynow;
    @FindBy (xpath = "(//a[@class='colorVariant js-pdp-variant giftCardVariant'])[2]")
    WebElement giftcardcolour;
    @FindBy (xpath = "//div[@class='variant-block _active']/ul/li[1]" )
    WebElement amount;
    @FindBy (css = ".price-selection")
    List<WebElement>amounts;
    @FindBy (id = "recipient_name")
    WebElement rcipientname;
    @FindBy (id = "recipientemail")
    WebElement rcipientmail;
    @FindBy (id = "confirm_recipient_email")
    WebElement confirmrecipientmail;
    @FindBy (id="sender_name")
    WebElement sendername;
    @FindBy (id= "giftcard_message")
    WebElement giftcardmessage;
    @FindBy(css = ".sendLater")
    WebElement sendLater;
    @FindBy(css = ".calendar-icon")
    WebElement calenderIcon;
    @FindBy(css = ".day")
    List<WebElement> calenderDates;
    @FindBy (id = "addToCartButton")
    WebElement addtocart;
    @FindBy (css = ".headline-text")
    WebElement headlinetext;
    @FindBy(css = ".col-xs-5.basket-product-right")
    WebElement giftCardValueInBasket;




  /*  public void setGiftcard(){
        CookieAccept.click();
        continueshopping.click();

       // giftcard.click();
    }*/
    public void setSearch(){

        search.sendKeys("gift");
    }
    public void clickGiftCard(){
        giftCardText.click();
        //sleep(4000);
    }
    public void setBuynow(){
        ScrollByJavaScriptExecutor(0,400);
        waitUntilElementVisible(buynow);
        isBtnClickable(buynow).click();
        //sleep(2000);
    }
    public void setGiftcardcolour(){

        waitUntilElementVisible(giftcardcolour).click();
    }
    public void setAmount(String amount){
        ScrollByJavaScriptExecutor(0,200);

        for (int i = 0; i < amounts.size(); i++) {
            String Calenderdatetext = amounts.get(i).getText();
            System.out.println(Calenderdatetext + "$$$$$$$$$$");
            if (Calenderdatetext.equalsIgnoreCase(amount)) {
                amounts.get(i).click();
                break;
            }

    }}
    public void setRcipientdetails(){
        ScrollByJavaScriptExecutor(0,400);
        rcipientname.sendKeys("jig");
        rcipientmail.sendKeys("rana_jigar@yahoo.com");
        confirmrecipientmail.sendKeys("rana_jigar@yahoo.com");
        sendername.sendKeys("het");
        giftcardmessage.sendKeys("Happy birthday");

    }
    public void selectLaterDate(String date){
        isBtnClickable(sendLater).click();
        isBtnClickable(calenderIcon).click();
        for (WebElement calenderDate : calenderDates){
            String calenderDateText = calenderDate.getText();
            if(calenderDateText.equalsIgnoreCase(date)){
                calenderDate.click();
                break;
            }
        }
    }
    public void setAddtocart()
    {
        //sleep(1000);
        waitUntilElementVisible(addtocart);
        isBtnClickable(addtocart).click();
        //sleep(5000);
    }
    public String setHeadlinetext(){
        String cartActualHeadline= waitUntilElementVisible(headlinetext).getText();
        System.out.println(cartActualHeadline + "££££££££££££");
        return cartActualHeadline;
      //  Assert.assertEquals("Added to Your Shopping Cart",cartActualHeadline);

    }
    public String setGiftCardValueInBasket(){
        String cartActualAmount = waitUntilElementVisible(giftCardValueInBasket).getText();
        System.out.println(cartActualAmount + "xxxxxxxxx");
        return cartActualAmount;
    }
}
