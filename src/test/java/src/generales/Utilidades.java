package src.generales;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Utilidades extends Generales {

    public Utilidades(WebDriver driver) {
        super(driver);
    }

    public static void reconocer(String xpath, int tiempo) {
        new WebDriverWait(driver, tiempo).until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
    }

    public static void reconocerId(String id, int tiempo){
        new WebDriverWait(driver, tiempo).until(ExpectedConditions.presenceOfElementLocated(By.id(id)));
    }

    public static void reconocerName(String name, int tiempo){
        new WebDriverWait(driver, tiempo).until(ExpectedConditions.presenceOfElementLocated(By.id(name)));
    }

    public static boolean enabled(String xpath) {
        reconocer(xpath,10);
        return driver.findElement(By.xpath(xpath)).isEnabled();
    }

    public static boolean enabledId(String id){
        reconocerId(id, 10);
        return driver.findElement(By.id(id)).isEnabled();
    }

    public static WebElement elemento (String xpath){
        return driver.findElement(By.xpath(xpath));
    }

    public static void display (String xpath) {
        reconocer(xpath,10);
        driver.findElement(By.xpath(xpath)).isDisplayed();
    }

    public static void click(String xpath) {
        reconocer(xpath,30);
        driver.findElement(By.xpath(xpath)).click();
    }

    public static void clickId(String id){
        reconocer(id, 10);
        driver.findElement(By.id(id)).click();
    }

    public static void clickName(String name){
        reconocerName(name, 10);
        driver.findElement(By.name(name)).click();
    }

    public static String getCssValue(String xpath, String cssValue) {
        reconocer(xpath,10);
        return driver.findElement(By.xpath(xpath)).getCssValue(cssValue);
    }

    public static String getAttribute(String xpath, String attribute) {
        reconocer(xpath,10);
        return driver.findElement(By.xpath(xpath)).getAttribute(attribute);
    }

    public static void clear(String xpath) {
        reconocer(xpath,10);
        driver.findElement(By.xpath(xpath)).clear();
    }

    public static void sendKeys(String xpath, String keys) throws InterruptedException {
        try {
            reconocer(xpath,10);
            WebElement element = driver.findElement(By.xpath(xpath));
            element.sendKeys(keys);
        }catch(Exception e){
            Thread.sleep(3000);
            System.out.println("Error al querer dar datos en el xpath: " + xpath);

        }
    }

    public static void sendKeysId(String id, String keys) throws InterruptedException {
        try {
            reconocer(id,10);
            WebElement element = driver.findElement(By.id(id));
            element.sendKeys(keys);
        }catch(Exception e){
            Thread.sleep(3000);
            System.out.println("Error al querer dar datos en el xpath: " + id);

        }
    }

    public static void sendKeysName(String name, String keys) throws InterruptedException {
        try {
            reconocer(name,10);
            WebElement element = driver.findElement(By.id(name));
            element.sendKeys(keys);
        }catch(Exception e){
            Thread.sleep(3000);
            System.out.println("Error al querer dar datos en el xpath: " + name);

        }
    }

    public static void sendKeys2(String xpath, Keys keys) throws InterruptedException {
        try {
            reconocer(xpath,10);
            WebElement element = driver.findElement(By.xpath(xpath));
            element.sendKeys(keys);
        }catch(Exception e){
            Thread.sleep(3000);
            System.out.println("Error al querer dar datos en el xpath: " + xpath);

        }
    }

    public static String tomarTexto(String xpath) {
        reconocer(xpath,10);
        return driver.findElement(By.xpath(xpath)).getText();
    }

    public static boolean checked(String xpath) {
        reconocer(xpath,10);
        return driver.findElement(By.xpath(xpath)).isSelected();
    }

    public static void visible(String xpath, int tiempo) {
        WebDriverWait wait;
        wait = new WebDriverWait(driver, tiempo);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
    }

    public static boolean Preset(String xpath) {
        reconocer(xpath,10);
        //return driver.findElements(By.xpath(xpath)).size() != 0;
        return driver.findElement(By.xpath("xpath"))!= null;
    }

    public static boolean notvisible(String xpath, int tiempo) {
        WebDriverWait wait;
        wait = new WebDriverWait(driver, tiempo);
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)))!= null;
    }

    public static String tomarAtributo(String Atributo, String id){
        WebElement valor = driver.findElement(By.id(id));
        valor.getAttribute(Atributo);
        return Atributo;
    }

    public static boolean deshabilitado (String xpath, int tiempo) {
        return driver.findElement(By.xpath(xpath)).isEnabled();
    }
    public static void error(String mensaje) {
        Assert.fail(mensaje);
    }

    public static boolean cbxSeleccionado(String xpath) {
        return driver.findElement(By.xpath(xpath)).isSelected();
    }
}
