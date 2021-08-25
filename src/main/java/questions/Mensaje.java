package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import utils.enums.EnumVariablesSesion;

import java.util.logging.Level;
import static utils.enums.EnumConstantes.LOGGERCOLPATRIA;

public class Mensaje implements Question<Boolean> {

    private String mensaje;

    public Mensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public Boolean answeredBy(Actor actor) {

        String alertText = actor.recall(EnumVariablesSesion.GET_TEXTO_ALERTA.getValue());
        if(!alertText.contains(mensaje)){
           LOGGERCOLPATRIA.log(Level.INFO,"El MENSAJE ESPERADO ES \"" + mensaje + "\" PERO SE ENCONTRO \"" + alertText + "\"");
           return false;
        }
        LOGGERCOLPATRIA.log(Level.INFO,"SE CIERRA LA VENTANA");
        return true;
    }

    public static Mensaje alerta(String mesanje){
        return new Mensaje(mesanje);
    }
}
