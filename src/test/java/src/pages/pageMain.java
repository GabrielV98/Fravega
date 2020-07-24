package src.pages;

import src.generales.Utilidades;

public class pageMain {
    String barra = "//input[@placeholder='Buscar productos']",
            btnBuscar = "//button[@class='InputBar__SearchButton-t6v2m1-2 jRChuZ']";

    public void barraClick(){
        Utilidades.click(barra);
    }

    public void barra(String producto) throws InterruptedException { Utilidades.sendKeys(barra, producto);}

    public void btnBuscar(){ Utilidades.click(btnBuscar);}
}
