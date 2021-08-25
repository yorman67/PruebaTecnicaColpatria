package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import utils.enums.EnumVariablesSesion;

import static userinterface.AlertsUI.CONFIRMACION_RESULTADO;
import static userinterface.AlertsUI.INPUT_RESULTADO;


public class Respuesta implements Question<Boolean> {


    private String alerta;
    private String texto;

    public Respuesta(String alerta, String texto) {
        this.alerta = alerta;
        this.texto = texto;
    }

    @Override
    public Boolean answeredBy(Actor actor) {

        if(alerta.equalsIgnoreCase("Aceptar") || alerta.equalsIgnoreCase("Cancelar")){
            return CONFIRMACION_RESULTADO.resolveFor(actor).getText().equalsIgnoreCase(texto);
        }else{
            return INPUT_RESULTADO.resolveFor(actor).getText().equalsIgnoreCase(texto.concat(actor.recall(EnumVariablesSesion.INGRESAR_NOMBRE.getValue())));
        }

    }

    public static Respuesta alerta(String alerta,String texto){
        return new Respuesta(alerta,texto);
    }
}
