package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PaginaLogin {

    private WebDriver driver;

    public PaginaLogin(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement pegarInputNomeUsuario(){
        WebElement inputNomeUsuario = driver.findElement(By.id("user-name"));
        return inputNomeUsuario;
    }

    public WebElement pegarInputPassword(){
        return driver.findElement(By.id("password"));
    }

    public WebElement pegarBotaoLogin(){
//        return driver.findElement(By.id("login-button"));
        return driver.findElement(By.className("btn_action"));
    }

}
