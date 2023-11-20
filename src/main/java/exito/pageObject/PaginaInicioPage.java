package exito.pageObject;

import lombok.Data;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

@Data
public class PaginaInicioPage extends PageObject {
    private final By lnkMenu = By.xpath("//div[@id='category-menu']");

    public By getLnkMenu() {
        return lnkMenu;
    }
}
