package CasosDeTeste;

import Suporte.*;
import Tarefas.*;
import Utilitarios.EsperaFixa;
import com.aventstack.extentreports.Status;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static Suporte.Relatorio.log;

public class RealizarCompraComSucesso extends TesteBase {

    private WebDriver driver = this.pegarDriver();

    LoginTarefa login = new LoginTarefa(driver);
    HomeTarefa homePage = new HomeTarefa(driver);
    DetalhaProdutoTarefa detalhaProduto = new DetalhaProdutoTarefa(driver);
    CarrinhoTarefa carrinho = new CarrinhoTarefa(driver);

    @Test
    public void realizarCompra() {

        try {
            Relatorio.createTest("Realizar Compra com Sucesso" , TipoRelatorio.INDIVIDUAL);

            EsperaFixa.aguardaEmSegundos(2);
            login.realizarLogin();
            homePage.selecionarProduto();
            detalhaProduto.adicionarNoCarrinho();
            carrinho.realizarChekout();

        }catch (Exception e){
            log(Status.ERROR, e.getMessage(), Screenshot.fullPageBase64(driver));
        }

    }

    @Test
    public void carregaGoogle() throws InterruptedException {

        driver.get("http://www.google.com");

// Get search box element from webElement 'q' using Find Element
        WebElement searchBox = driver.findElement(By.name("q"));

        Thread.sleep(2000);
        searchBox.sendKeys("webdriver");
        Thread.sleep(4000);
    }


}
