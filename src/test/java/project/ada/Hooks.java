package project.ada;

import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Hooks {
    private static WebDriver driver;

    @Before
    public static void setup(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
    }

/* alternativa para coletar print após cada step */
    @AfterStep
    public void tirarScreenshots(Scenario scenario){
        TakesScreenshot ts = (TakesScreenshot) driver;
        byte[] src = ts.getScreenshotAs(OutputType.BYTES);
        scenario.attach(src, "image/png", "" + scenario.getUri());
    }

/* alternativa para coletar print apenas quando o cenário falhou */
//    @AfterStep
//    public void tirarScreenshotsCasoFalhe(Scenario scenario){
//        if(scenario.isFailed()) {
//            TakesScreenshot ts = (TakesScreenshot) driver;
//            byte[] src = ts.getScreenshotAs(OutputType.BYTES);
//            scenario.attach(src, "image/png", String.format("executed_%s.png", scenario.getUri()));
//        }
//    }

    @After
    public void tearDown(){
        driver.quit();
    }

    public static WebDriver getDriver(){
        return driver;
    }
}
