package steps;

import core.DriverManager;
import io.cucumber.java.pt.Dado;

public class CommonStep {

    @Dado("que tenha um usuário cadastrado no site")
    public void que_tenha_um_usuário_cadastrado_no_site() {
        String site = "https://automationexercise.com/";
        DriverManager.openBrowser(site);
    }
}
