package project.ada.steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import project.ada.Hooks;

import java.time.Duration;

public class LoginStepDefinitions {
    WebDriver driver = Hooks.getDriver();

    String baseUrl = "https://parabank.parasoft.com/parabank/register.htm";

    @Dado("que estou na página home")
    public void que_estou_na_página_home() {
        driver.get(baseUrl);
    }
    @Quando("inserir {string} e {string}")
    public void inserir_e(String username, String pwd) {
        driver.findElement(By.name("username")).sendKeys(username);
        driver.findElement(By.name("password")).sendKeys(pwd);
        driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[3]/input")).click();
    }

    @Entao("login deve realizado com sucesso")
    public void login_deve_realizado_com_sucesso() {
        driver.findElement(By.id("accountTable")).isDisplayed();
    }

    @Quando("inserir <username> e <pwd>")
    public void inserirUsernameEPwd(String username, String pwd) {
        driver.findElement(By.name("username")).sendKeys(username);
        driver.findElement(By.name("password")).sendKeys(pwd);
        driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[3]/input")).click();
    }

    @Quando("fazer logout")
    public void fazer_logout() {
        driver.findElement(By.xpath("//*[@id=\"leftPanel\"]/ul/li[8]/a")).click();
    }

    @Entao("deve desconectar corretamente")
    public void deve_desconectar_corretamente() {
        String pathElement = "//*[@id=\"loginPanel\"]/form/div[3]/input";
//        driver.manage().timeouts().implicitlyWait(10, Time );
//        Thread.sleep();
//        new WebDriverWait(driver, Duration.ofSeconds(10));
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.xpath(pathElement)));

        Boolean isDisplayed = new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(driver -> driver.findElement(
                        By.xpath(pathElement)).isDisplayed());

        Assertions.assertTrue(isDisplayed);
        driver.findElement(By.xpath(pathElement)).isDisplayed();
        Assertions.assertTrue(isDisplayed);
    }
}
