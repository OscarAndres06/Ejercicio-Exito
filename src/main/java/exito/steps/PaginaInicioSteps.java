package exito.steps;

import exito.pageObject.PaginaInicioPage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

public class PaginaInicioSteps {

    @Page
    PaginaInicioPage paginaInicioPage;

    @Step("Abrir navegador")
    public void abrirNavegador(){
        paginaInicioPage.openUrl("https://www.exito.com/");
    }
}
