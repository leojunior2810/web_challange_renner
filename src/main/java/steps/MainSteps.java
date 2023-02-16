package steps;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pages.MainPage;

public class MainSteps {

    @Quando("pesquiso pelo produto {string}")
    public void pesquiso_pelo_produto(String produto) {
        MainPage page = new MainPage();
        page.menuProducts();
        page.searchProduct(produto);
    }
    @Entao("devo clicar para adicionar ao carrinho")
    public void devo_clicar_para_adicionar_ao_carrinho() {
        MainPage page = new MainPage();
        page.viewFirstProduct();
        page.addToCart();
    }
}
