package questions;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import utils.enums.EnumVariablesSesion;

import static userinterface.WebTablesUI.RESULTADO_BUSQUEDA;

public class ElementoEliminado implements Question<Boolean> {


    @Override
    public Boolean answeredBy(Actor actor) {
        return !RESULTADO_BUSQUEDA.of(actor.recall(EnumVariablesSesion.DATO_ELIMINADO.getValue()).toString()).resolveFor(actor).isVisible();
    }

    public static ElementoEliminado exitosamente () {
        return new ElementoEliminado();
    }
}
