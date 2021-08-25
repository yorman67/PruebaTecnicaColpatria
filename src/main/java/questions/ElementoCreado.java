package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Enter;
import utils.enums.EnumVariablesSesion;

import static userinterface.WebTablesUI.FILTRO;
import static userinterface.WebTablesUI.RESULTADO_BUSQUEDA;

public class ElementoCreado implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {

        actor.attemptsTo(
                Enter.theValue(actor.recall(EnumVariablesSesion.CORREO.getValue()).toString()).into(FILTRO)
        );

        return RESULTADO_BUSQUEDA.of(actor.recall(EnumVariablesSesion.CORREO.getValue()).toString()).resolveFor(actor).isVisible();
    }

    public static ElementoCreado exitosamente(){
        return new ElementoCreado();
    }
}
