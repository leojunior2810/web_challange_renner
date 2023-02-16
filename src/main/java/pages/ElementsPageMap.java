package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ElementsPageMap extends CommonPage{

    @FindBy(id = "search_produt")
    protected WebElement txtSearchProduct;

    @FindBy(id = "submit_search")
    protected WebElement btnSearch;

    @FindBy(linkText = "View Product")
    protected WebElement btnViewProduct;

    @FindBy(className = "btn btn-default cart")
    protected WebElement btnAddCart;

    @FindBy(xpath = "//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[2]/a")
    protected WebElement menuProducts;


}
