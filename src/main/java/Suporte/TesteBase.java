package Suporte;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;

public class TesteBase extends GerenciadorDriver{

    private static WebDriver driver;
    private String URL = "https://www.saucedemo.com";

    public static WebDriver pegarDriver(){

        driver = pegarDriver(TipoDriver.CHROME);
        return driver;
    }

    @BeforeEach
    public void setUp(){
        pegarDriver().get(URL);
    }

    @AfterEach
    public void encerraDriver(){
        encerrarDriver();
    }

}
