package Falabella.task;

import Falabella.Interacciones.Interacciones;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class tareaBusqueda implements Task {

    private final String busqueda;
    private final String email;
    private final String direccion;
    private final String tipo_casa;

    public tareaBusqueda(String busqueda, String email, String direccion, String tipo_casa) {
        this.busqueda = busqueda;
        this.email = email;
        this.direccion = direccion;
        this.tipo_casa = tipo_casa;
    }

    public static Performable busquedaProducto(String busqueda,String email, String direccion, String tipo_casa){
        return instrumented(tareaBusqueda.class,busqueda,email,direccion,tipo_casa);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(busqueda).into(Interacciones.BARRA_BUSQUEDA),
                Click.on(Interacciones.BOTON_BUSQUEDA),
                Click.on(Interacciones.CERRAR_POP),
                Click.on(Interacciones.BOTON_PRODUCTO),
                Click.on(Interacciones.VER_BOLSA_DE_COMPRA),
                Click.on(Interacciones.IR_A_COMPRAR),
                Enter.theValue(email).into(Interacciones.EMAIL),
                Click.on(Interacciones.CONTINUAR_FALABELLA),
                Click.on(Interacciones.REGION),
                Click.on(Interacciones.REGION_OPTION),
                Click.on(Interacciones.CIUDAD),
                Click.on(Interacciones.CIUDAD_OPTION),
                Click.on(Interacciones.BARRIO),
                Click.on(Interacciones.BARRIO_OPTION),
                Click.on(Interacciones.CONTINUAR_COMPRA2),
                Enter.theValue(direccion).into(Interacciones.DIRECCION),
                Enter.theValue(tipo_casa).into(Interacciones.TIPO_CASA),
                Click.on(Interacciones.INGRESAR_DIRECCION),
                Click.on(Interacciones.CONTINUAR_FINAL)

        );
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
