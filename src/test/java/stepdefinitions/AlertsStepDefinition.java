package stepdefinitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import questions.Mensaje;
import questions.Respuesta;
import tasks.Seleccionar;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class AlertsStepDefinition {

    @Cuando("el usuario da click en el boton {string}")
    public void elUsuarioDaClickEnElBoton(String alerta) {
        OnStage.theActorInTheSpotlight().attemptsTo(Seleccionar.tipo(alerta));
    }

    @Entonces("la alerta deberia contener el texto {string}")
    public void laAlertaDeberiaContenerElTexto(String mensaje) {
        OnStage.theActorInTheSpotlight().should(seeThat(Mensaje.alerta(mensaje)));
    }

    @Entonces("el usuario valida que para la opcion {string} el resultado contenga el texto {string}")
    public void elUsuarioValidaQueParaLaOpcionElResultadoContengaElTexto(String opcionAlerta, String mensaje) {
        OnStage.theActorInTheSpotlight().should(seeThat(Respuesta.alerta(opcionAlerta,mensaje)));
    }
}
