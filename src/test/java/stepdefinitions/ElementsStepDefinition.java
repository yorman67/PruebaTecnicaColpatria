package stepdefinitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import questions.ElementoCreado;
import questions.ElementoEliminado;
import tasks.Agregar;
import tasks.Eliminar;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;


public class ElementsStepDefinition {

    @Cuando("el usuario agrega un nuevo elemento")
    public void elUsuarioAgregaUnNuevoElemento() {
        OnStage.theActorInTheSpotlight().attemptsTo(Agregar.elemento());
    }

    @Cuando("el usuario elimina el elemento para el escenario {string}")
    public void elUsuarioEliminaElElementoParaElEscenario(String elemento) {
        OnStage.theActorInTheSpotlight().attemptsTo(Eliminar.el(elemento));
    }

    @Entonces("el usuario valida que registro se encuentre en la tabla")
    public void elUsuarioValidaQueRegistroSeEncuentreEnLaTabla() {
        OnStage.theActorInTheSpotlight().should(seeThat(ElementoCreado.exitosamente()));
    }

    @Entonces("el usuario valida que el registro se elemino de manera exitosa")
    public void elUsuarioValidaQueElRegistroSeEleminoDeManeraExitosa() {
        OnStage.theActorInTheSpotlight().should(seeThat(ElementoEliminado.exitosamente()));
    }
}
