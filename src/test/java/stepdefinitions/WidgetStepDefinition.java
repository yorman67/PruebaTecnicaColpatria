package stepdefinitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import questions.ElementoEliminado;
import questions.FechaIngresada;
import tasks.IngresarFecha;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class WidgetStepDefinition {

    @Cuando("el usuario ingresa la fecha {string}")
    public void elUsuarioIngresaLaFecha(String opcion) {
        OnStage.theActorInTheSpotlight().attemptsTo(IngresarFecha.con(opcion));
    }

    @Entonces("el usuario valida que el campo se diligencio de manera correcta")
    public void elUsuarioValidaQueElCampoSeDiligencioDeManeraCorrecta() {
        OnStage.theActorInTheSpotlight().should(seeThat(FechaIngresada.correctamente()));
    }
}
