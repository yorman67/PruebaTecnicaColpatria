package interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class AbrirNavegador implements Interaction {

    private String pagina;

    public AbrirNavegador(String pagina) {
        this.pagina = pagina;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.url(pagina));
    }

    public static Performable en (String pagina){
        return Tasks.instrumented(AbrirNavegador.class,pagina);
    }
}
