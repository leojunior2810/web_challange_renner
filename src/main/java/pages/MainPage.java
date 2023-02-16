package pages;

import org.openqa.selenium.support.PageFactory;

public class MainPage  extends ElementsPageMap{

    public MainPage(){
        PageFactory.initElements(driver, this);
    }

    public void menuProducts() {
        menuProducts.click();
    }

    public void searchProduct(String produto){
        txtSearchProduct.sendKeys(produto);
        btnSearch.click();
    }

    public void viewFirstProduct(){
        btnViewProduct.click();
    }

    public void addToCart(){
        btnAddCart.click();
    }
}
