package ebay.search;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SearchFor extends UIInteractionSteps {

    static By SEARCH_FIELD  = By.cssSelector("#gh-ac");
    static By SEARCH_BUTTON = By.cssSelector("[value='Search']");
    static By SELECT_SECOND_ITEM = By.cssSelector("[data-view='mi:4333|iid:4'] .s-item__image-section");
    static By SHOPPING_CART_TITLE = By.cssSelector("h1.main-title");
    static By EMPTY_CART_TEXT = By.cssSelector("[aria-live] > span:nth-of-type(1)");


    @Step("Search another item")
    public void searchAnotherItem(String arg1){
           $(SEARCH_FIELD).sendKeys(arg1);
           $(SEARCH_BUTTON).click();
    }

    @Step("Select the first item")
    public void selectAnotherItem(){
           $(SELECT_SECOND_ITEM).click();
    }

    @Step("Validate the cart items")
    public String validateCartItems(){
        return $(SHOPPING_CART_TITLE).getText();
    }

    @Step("Remove the items")
    public void removeItems(){
       List<WebElementFacade> removeButtons = $$(By.cssSelector("[data-test-id] div:nth-of-type(1) [data-test-id='cart-bucket'] [data-test-id='cart-remove-item']"));
       java.util.Iterator<WebElementFacade> i = removeButtons.iterator();
       while(i.hasNext()){
           WebElementFacade element = i.next();
           if(element.isDisplayed()){
               element.click();
           }
        }
    }

    @Step("Validate the empty cart")
    public String emptyCartValidation(){
        return $(EMPTY_CART_TEXT).getText();
    }

}
