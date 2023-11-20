package com.exito.steps;

import com.exito.pageObject.PaginaInicioPage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

public class PaginaInicioSteps {

    @Page
    PaginaInicioPage paginaInicioPage;

    @Step("Abrir navegador")
    public void abrirNavegador(){
        paginaInicioPage.openUrl("https://www.exito.com");
    }

    @Step("Click en el menu")
    public void clicMenu(){
       paginaInicioPage.getDriver().findElement(paginaInicioPage.getLnkMenu())
               .click();

    }
    @Step("Selecionar catagoria")
    public void seleccionarCate(){
        paginaInicioPage.getDriver().findElement(paginaInicioPage.getLnkCategoria())
                .click();
    }
    @Step("Agregar articulo carrito de compra")
    public void agregarCarrito(){
        paginaInicioPage.getDriver().findElement(paginaInicioPage.getBtonAgregarCarrito())
                .click();
    }
    @Step("Click en el carrito de compra")
    public void abrirCarritoCompra(){
        paginaInicioPage.getDriver().findElement(paginaInicioPage.getLnkCarroCompra())
                .click();
    }


}
