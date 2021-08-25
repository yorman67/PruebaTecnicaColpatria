package interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import utils.enums.EnumConstantes;

import java.util.logging.Level;

public class AbrirNavegador implements Interaction {

    private String pagina;

    public AbrirNavegador(String pagina) {
        this.pagina = pagina;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.url(pagina));
        EnumConstantes.LOGGERCOLPATRIA.log(Level.INFO, "Se abre el navegador de manera exitosa");
    }

    public static Performable en (String pagina){
        return Tasks.instrumented(AbrirNavegador.class,pagina);
    }
}
