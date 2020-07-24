package src.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import src.generales.Utilidades;

import java.util.List;

public class pageSearch {
            String filtroHeladeras = "/html[1]/body[1]/div[1]/div[3]/div[1]/div[1]/div[1]/ul[1]/li[2]/ul[1]/li[1]/ul[1]/li[2]/a[1]/h4[1]",
            filtroTodasMarcas = "//a[@name='viewAllBrands']",
            listaElementos = "//ul[@name='itemsGrid']",
            breadcrumbsContainer = "//div[@name='breadcrumb']";

        public void filtroHeladera(){ Utilidades.click(filtroHeladeras);}

        public void filtroTodasMarcas(){ Utilidades.click(filtroTodasMarcas);}

        public void listaElementos(){

            WebElement lstElementos;
            WebElement breadcrumbElement;
            lstElementos = Utilidades.elemento(listaElementos);
            breadcrumbElement = Utilidades.elemento(breadcrumbsContainer);
            List<WebElement> listaElementos = lstElementos.findElements(By.tagName("li"));
            int cantElem = listaElementos.size();

                System.out.println("Elementos encontrados: " + cantElem);
                Assert.assertTrue(this.findTag(listaElementos));
                Assert.assertEquals(cantElem, 5);
                Assert.assertTrue(this.findAtribute(breadcrumbElement));

        }

        private Boolean findTag(List<WebElement> listaElementos) {
            for (WebElement element:listaElementos){
                for (WebElement h4:element.findElements(By.tagName("h4"))) {
                    if(!h4.getText().contains("Samsung"))
                        return false;
                }
            }
            return true;
        }

        private Boolean findAtribute(WebElement baseElement) {
            for (WebElement element:baseElement.findElements(By.name("breadcrumbItem"))){
                if ( element.getText().equals("Heladeras, Freezers y Cavas") )
                    return true;
            }
            return false;

        }

}
