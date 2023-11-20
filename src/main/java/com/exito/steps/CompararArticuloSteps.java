package com.exito.steps;

import com.exito.pageObject.PaginaInicioPage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import org.junit.Assert;

import static com.exito.utils.Esperas.espera1;

public class CompararArticuloSteps {
    @Page
    PaginaInicioPage paginaInicioPage;
    @Step("Validacion del articulo")
    public void validacionArticulo(){
        espera1(paginaInicioPage.getDriver(),paginaInicioPage.getLnkCarroCompra());
        Assert.assertTrue(
                paginaInicioPage.getDriver().findElement(
                        paginaInicioPage.getLnkCarroCompra()
                ).isDisplayed()

        );


    }

}
