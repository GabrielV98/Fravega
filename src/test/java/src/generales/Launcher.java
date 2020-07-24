package src.generales;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launcher {

    static WebDriver driver;
    static String url;
    public static void navegador() {

        url = "https://www.fravega.com/";

        System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe");
        driver = new ChromeDriver();

        //Explorer
//        System.setProperty("webdriver.ie.driver", "C:\\Automation\\IEDriverServer.exe");
//        driver = new InternetExplorerDriver();

        new Generales(driver);
        driver.manage().window().maximize();
        driver.get(url);

    }

    public static WebDriver getDriver(){
        return driver;
    }
}
