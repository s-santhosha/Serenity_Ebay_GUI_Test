package ebay.navigation;


import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class EbayCatalogPage extends PageObject {

    static By CATALOG_MENU = By.linkText("Electronics");



    public void clickElectronicsLink(){
        $(CATALOG_MENU).click();
    }


}
