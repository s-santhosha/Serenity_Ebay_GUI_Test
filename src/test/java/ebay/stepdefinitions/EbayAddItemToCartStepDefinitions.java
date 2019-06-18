package ebay.stepdefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import ebay.search.SearchCatalogMenu;
import net.thucydides.core.annotations.Steps;
import ebay.navigation.NavigateTo;
import ebay.search.SearchFor;
import org.junit.Assert;

public class EbayAddItemToCartStepDefinitions {

    @Steps
    NavigateTo navigateTo;

    @Steps
    SearchCatalogMenu searchCatalogMenu;

    @Steps
    SearchFor searchFor;

    //Scenario 1

    @Given("^the user browse the catalog \"([^\"]*)\"$")
    public void the_user_browse_the_catalog(String arg1) {
        navigateTo.theEbayHomePage();
        //user clicks the Electronics menu
        searchCatalogMenu.clickCatalogMenu(arg1);
    }

    @When("^the user selects the Home Entertainment$")
    public void the_user_selects_the_Home_Entertainment() {
        //click on Home Entertainment
       searchCatalogMenu.clickSubItem();
    }


    @When("^adds the first item to cart$")
    public void adds_the_first_item_to_cart() {
        //select first item from the list
        searchCatalogMenu.selectFirstItem();
        //Add to cart
        searchCatalogMenu.clickAddToCart();
        //Handle overlay
        searchCatalogMenu.overlayHandle();
    }

    @When("^the user searches for another item \"([^\"]*)\"$")
    public void the_user_searches_for_another_item(String arg1) throws InterruptedException {
        searchFor.searchAnotherItem(arg1);
    }

    @When("^the user selects the first item in the list$")
    public void the_user_selects_the_first_item_in_the_list()  {
        searchFor.selectAnotherItem();

    }

    @When("^adds the second item to cart$")
    public void adds_the_second_item_to_cart() {
        //Add to cart
        searchCatalogMenu.clickAddToCart();
        //Handle overlay
        searchCatalogMenu.overlayHandle();
    }


    @Then("^the user validates the cart$")
    public void the_user_validates_the_cart() {
        Assert.assertTrue(searchFor.validateCartItems().contains("2 items"));
    }

    @When("^the user clears the cart$")
    public void the_user_clears_the_cart()  {
        searchFor.removeItems();

    }


    @Then("^the cart should be empty$")
    public void the_cart_should_be_empty() {
        Assert.assertTrue(searchFor.emptyCartValidation().contains("You don't have any items in your cart"));
    }


}
