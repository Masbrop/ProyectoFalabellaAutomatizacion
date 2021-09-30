package Falabella.navigation;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class NavegacionHacia {

    public static Performable PaginaFalabella() {
        return Task.where("{0} opens the DuckDuckGo home page",
                Open.browserOn().the(Navegar.class)
        );
    }
}