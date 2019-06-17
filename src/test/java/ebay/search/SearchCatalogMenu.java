package ebay.search;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

public class SearchCatalogMenu  extends UIInteractionSteps {

    static By HOME_ENTERTAINMENT_LINK = By.cssSelector("ul>li>div a[href*='home-entertainment']");
    static By SELECT_FIRST_ITEM = By.cssSelector("[id='w7-items\\[0\\]']");
    static By ADD_TO_CART = By.cssSelector("#isCartBtn_btn");
    static By OVERLAY_CLOSE =  By.cssSelector("#ADDON_0 .addonBtn button.addonnothx");


    @Step("Click on catalog menu")
    public void clickCatalogMenu(String arg1){
        $(By.linkText(arg1)).click();
       }

       @Step("Click on home entertainment")
       public void clickSubItem(){
       $(HOME_ENTERTAINMENT_LINK).click();
       }

       @Step("Select the first item from the listing")
       public void selectFirstItem(){
        $(SELECT_FIRST_ITEM).click();
       }

       @Step("Click on Add to Cart")
       public void clickAddToCart(){
        $(ADD_TO_CART).click();
       }

       @Step("Handle insurance overlay")
       public void overlayHandle(){
       $(OVERLAY_CLOSE).click();
       }
}
