package Tarefas;

import PageObjects.PaginaHome;
import PageObjects.PaginaLogin;
import Suporte.Relatorio;
import Suporte.Screenshot;
import com.aventstack.extentreports.Status;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

public class LoginTarefa {

    private static WebDriver driver;
    private static PaginaLogin login;
    private static PaginaHome selecionaProduto;

    public LoginTarefa(WebDriver driver) {

        this.driver = driver;
        login = new PaginaLogin(this.driver);
        selecionaProduto = new PaginaHome(this.driver);
    }

    public void realizarLogin(){
        validaCarregouPaginaLogin();
        login.pegarInputNomeUsuario().sendKeys("standard_user");
        login.pegarInputPassword().sendKeys("secret_sauce");
        login.pegarBotaoLogin().click();
        validaLogin();

    }

//    public void realizarLoginParametrizado(String usuario, String senha){
//
//        login.pegarInputNomeUsuario().sendKeys(usuario);
//        login.pegarInputPassword().sendKeys(senha);
//        login.pegarBotaoLogin().click();
//        validaLogin();
//
//    }

    private void validaCarregouPaginaLogin(){
        try{
            Assertions.assertTrue(login.pegarImagemRobozinho().isDisplayed());
            Relatorio.log(Status.PASS, "Carregou a página de login", Screenshot.fullPageBase64(driver));
        }catch (Exception e){

            Relatorio.log(Status.FAIL,"Não carregou página de Login", Screenshot.fullPageBase64(driver));
        }
    }


    private void validaLogin(){
        try{
            String rotulo = selecionaProduto.pegarTextoDoCabecalhoDaHome().getText();
            Assertions.assertEquals(rotulo, "Products");
            Relatorio.log(Status.PASS, "Login Realizado : " + rotulo , Screenshot.fullPageBase64(driver));
        }catch (Exception e){

            Relatorio.log(Status.FAIL,"Login Falhou", Screenshot.fullPageBase64(driver));
        }
    }
}
