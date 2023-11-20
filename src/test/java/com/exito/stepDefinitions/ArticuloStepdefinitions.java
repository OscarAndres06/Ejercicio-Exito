package com.exito.stepDefinitions;

import com.exito.steps.CompararArticuloSteps;
import com.exito.steps.PaginaInicioSteps;
import io.cucumber.java.es.*;
import net.thucydides.core.annotations.*;

public class ArticuloStepdefinitions {

    @Steps
    PaginaInicioSteps paginaInicioSteps;
    @Steps
    CompararArticuloSteps compararArticuloSteps;

    @Dado("que el usuario abre el navegador y de clic al boton menu")
    public void queElUsuarioAbreElNavegadorYDeClicAlBotonMenu() {
        paginaInicioSteps.abrirNavegador();

    }
    /*@Cuando("el usuario ingrese al menu selecciones una categoria tecnologia  y subcategoria camaras")
    public void elUsuarioIngreseAlMenuSeleccionesUnaCategoriaTecnologiaYSubcategoriaCamaras() {
        paginaInicioSteps.clicMenu();
        paginaInicioSteps.seleccionarCate();

    }
    @Cuando("el usuario agraga el producto al carrito de compra")
    public void elUsuarioAgragaElProductoAlCarritoDeCompra() {
        paginaInicioSteps.agregarCarrito();

    }
    @Cuando("el usuario seleciona el carrito de compra y agraga el correo")
    public void elUsuarioAgregaUnCorreoParaAgragarElArticuloAlCarro() {
        paginaInicioSteps.abrirCarritoCompra();

    }
    @Entonces("el usuario podrá ver en el carrito el articulo agragado")
    public void elUsuarioPodráVerEnElCarritoElArticuloAgragado() {
        compararArticuloSteps.validacionArticulo();

    }*/

}
