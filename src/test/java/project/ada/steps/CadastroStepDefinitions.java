package project.ada.steps;

import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeOptions;

import java.net.URL;

public class CadastroStepDefinitions {

    WebDriver driver;
    String baseUrl = "https://todomvc.com/examples/vanillajs";

    @Before
    public void setup(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(options);
    }

    @Dado("que usuário está na pagina inicial")
    public void que_usuário_está_na_pagina_inicial() {
        driver.get(baseUrl);
    }

    @Quando("inserir nova task")
    public void inserir_nova_task() {
        WebElement input = driver.findElement(By.className("new-todo"));
        input.sendKeys("task1");
        input.sendKeys(Keys.ENTER);
    }

    @Entao("task deve estar na lista de tasks ativas")
    public void task_deve_estar_na_lista_de_tasks_ativas() {
        String task = driver.findElement(By.className("view")).getText();
        Assertions.assertEquals(task, "task1");
    }













}
