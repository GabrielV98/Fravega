package src.pages;

import src.generales.Utilidades;

public class pageBrands {

    String samsung = "//label[text()='Samsung']",
    aplicar = "//button[@id='apply']";

    public void samsung(){
        Utilidades.click(samsung);
    }

    public void aplicar(){ Utilidades.click(aplicar);}

}
