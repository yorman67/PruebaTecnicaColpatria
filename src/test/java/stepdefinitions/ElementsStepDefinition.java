package stepdefinitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import questions.ElementoCreado;
import tasks.Agregar;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;


public class ElementsStepDefinition {

    @Cuando("el usuario agrega un nuevo elemento")
    public void elUsuarioAgregaUnNuevoElemento() {
        OnStage.theActorInTheSpotlight().attemptsTo(Agregar.elemento());
    }

    @Entonces("el usuario valida que registro se encuentre en la tabla")
    public void elUsuarioValidaQueRegistroSeEncuentreEnLaTabla() {
        OnStage.theActorInTheSpotlight().should(seeThat(ElementoCreado.exitosamente()));
    }
}
