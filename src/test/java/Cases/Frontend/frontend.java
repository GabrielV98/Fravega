package Cases.Frontend;

import src.generales.Utilidades;
import src.pages.pages;

public class frontend {


        public static void testCase() throws InterruptedException {
            String palabra = "Heladera";

            try{
                pages.mainPage.barraClick();
                System.out.println("Click en barra de busqueda");
            }catch (Exception e){
                Utilidades.error("Error al clickear barra");
            }

            try{
                pages.mainPage.barra(palabra);
                System.out.println("Se escribe palabra Heladera");
            }catch (Exception e){
                Utilidades.error("Error al escribir string");
            }

            try{
                pages.mainPage.btnBuscar();
                System.out.println("Click en botón de busqueda");
            }catch (Exception e){
                Utilidades.error("Error al clickear botón");
            }

            try{
                pages.search.filtroHeladera();
                System.out.println("Click en filtro Heladeras");
            }catch (Exception e){
                Utilidades.error("Error al clickear filtro Heladeras");
            }

            try{
                pages.search.filtroTodasMarcas();
                System.out.println("Click en filtro de Ver Más");
            }catch (Exception e){
                Utilidades.error("Error al clickear filtro Ver Más");
            }
            Thread.sleep(500);
            try{
                pages.brands.samsung();
                System.out.println("Click en Samsung");
            }catch (Exception e){
                Utilidades.error("Error al elegir filtro Samsung");
            }

            try{
                pages.brands.aplicar();
                System.out.println("Click en Aplicar");
            }catch (Exception e){
                Utilidades.error("Error al aplicar filtro");
            }

            try{
                pages.mainPage.btnBuscar();
                System.out.println("Click en botón de busqueda");
            }catch (Exception e){
                Utilidades.error("");
            }


                pages.search.listaElementos();


               //    Utilidades.error("Error en lista de elementos");


        }
}
