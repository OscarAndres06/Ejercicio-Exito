package com.exito.pageObject;

import lombok.Data;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

@Data
public class PaginaInicioPage extends PageObject {
    private final By lnkMenu= By.xpath("//div[@id='category-menu']");
    private final By lnkCategoria= By.xpath("//li[div[@class='exito-category-menu-3-x-squareHoverD']][@id='categorias-nivel2-Cámaras']");
    private final By btonAgregarCarrito= By.xpath("(//button[@type='button'])[3]");
    private final By lnkCarroCompra = By.xpath("//a[@class='exito-header-3-x-minicartLink']");

    public By getLnkMenu() {
        return lnkMenu;
    }

    public By getLnkCategoria() {
        return lnkCategoria;
    }

    public By getBtonAgregarCarrito() {
        return btonAgregarCarrito;
    }

    public By getLnkCarroCompra() {
        return lnkCarroCompra;
    }
}

