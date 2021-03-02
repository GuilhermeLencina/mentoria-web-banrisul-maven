package CasosDeTeste;

import Suporte.TesteBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RealizarCompraComSucesso extends TesteBase {

    private WebDriver driver = this.pegarDriver();

    @Test
    public void teste() throws InterruptedException {

        Thread.sleep(5000);
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
