package com.exito.stepDefinition;

import exito.steps.PaginaInicioSteps;
import io.cucumber.java.es.*;
import net.thucydides.core.annotations.Steps;

public class ArticuloStepDefinition {
    @Steps
    PaginaInicioSteps paginaInicioSteps;

    @Dado("que el usuario abre el navegador y de clic al boton menu")
    public void queElUsuarioAbreElNavegadorYDeClicAlBotonMenu() {
        paginaInicioSteps.abrirNavegador();
       
    }
    @Cuando("el usuario ingrese al menu selecciones una categoria tecnologia  y subcategoria camaras")
    public void elUsuarioIngreseAlMenuSeleccionesUnaCategoriaTecnologiaYSubcategoriaCamaras() {
       
    }
    @Cuando("el usuario agraga el producto al carrito de compra")
    public void elUsuarioAgragaElProductoAlCarritoDeCompra() {
       
    }
    @Cuando("el usuario seleciona el carrito de compra y agraga el correo")
    public void elUsuarioSelecionaElCarritoDeCompraYAgragaElCorreo() {
       
    }
    @Entonces("el usuario podrá ver en el carrito el articulo agragado")
    public void elUsuarioPodráVerEnElCarritoElArticuloAgragado() {
       
    }

}
