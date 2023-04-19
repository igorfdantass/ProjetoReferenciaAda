package project.ada.steps;

import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LoginStepDefinitions {

    WebDriver driver;
    String baseUrl = "https://parabank.parasoft.com/parabank/register.htm";

    @Before
    public void setup(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(options);
    }

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
}
