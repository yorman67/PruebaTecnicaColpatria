package stepdefinitions;

import interactions.AbrirNavegador;
import interactions.Seleccionar;

import io.cucumber.java.es.Dado;
import net.serenitybdd.screenplay.actors.OnStage;
import utils.enums.EnumConstantes;

public class GeneralesStepDefinition {



    @Dado("^que el (.*) se encuentra en la pagina de demoqa$")
    public void elUsuarioSeEncuentraEnLaPaginaDeDemoqa(String actor) {
        OnStage.theActorCalled(actor).attemptsTo(AbrirNavegador.en(EnumConstantes.URL_PAGINA.getValue()));
    }

    @Dado("que el usuario se encuentra en el menu {string}")
    public void queElUsuarioSeEncuentraEnElMenu(String menu) {
        OnStage.theActorInTheSpotlight().attemptsTo(Seleccionar.opcion(menu));
    }

}
