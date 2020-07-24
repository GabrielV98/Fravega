package Launcher;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Cases.Frontend.frontend;
import src.generales.Launcher;

public class FrontEnd {


    @BeforeMethod
    public void navigate() throws InterruptedException {
        Launcher.navegador();
    }

    @Test
    public void testWebPage() throws InterruptedException {
        frontend.testCase();
    }

    @AfterMethod
     public void cerrar(){
       Launcher.getDriver().close();
     }
}
