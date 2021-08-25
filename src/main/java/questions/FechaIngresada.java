package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import utils.enums.EnumConstantes;
import utils.enums.EnumVariablesSesion;

import static userinterface.WidgetUI.INPUT_FECHA;
import static userinterface.WidgetUI.INPUT_FECHA_HORA;

public class FechaIngresada implements Question<Boolean> {


    @Override
    public Boolean answeredBy(Actor actor) {


        if(actor.recall(EnumVariablesSesion.OPCION_FECHA.getValue()).equals(EnumConstantes.FECHA_CON_HORA.getValue())){
            return !INPUT_FECHA_HORA.resolveFor(actor).getValue().isEmpty();
        }else {
            return INPUT_FECHA.resolveFor(actor).getValue().equals(actor.recall(EnumVariablesSesion.FECHA.getValue()));
        }

    }

    public static FechaIngresada correctamente() {
        return new FechaIngresada();
    }
}
