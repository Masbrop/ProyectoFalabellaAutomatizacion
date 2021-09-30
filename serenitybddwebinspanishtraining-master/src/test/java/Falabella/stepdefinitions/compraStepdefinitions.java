package Falabella.stepdefinitions;

import Falabella.task.tareaBusqueda;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import Falabella.navigation.NavegacionHacia;


import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class compraStepdefinitions {

    String actor;

    @Before
    public void stTheStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("(.*) realizar la busqueda")
    public void realizar_la_busqueda(String actor) {
        this.actor = actor;
    }

    @When("seleccionar producto")
    public void seleccionar_producto() {
        theActorCalled(actor).attemptsTo(
                NavegacionHacia.PaginaFalabella(),
                tareaBusqueda.busquedaProducto("Iphone","johan123@hotmail.com","calle 105","Casa primer")
        );

    }

    @Then("realizar proceso de compra")
    public void realizar_proceso_de_compra() {

    }

}
