package tasks;

import interactions.Esperar;
import lombok.SneakyThrows;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;
import utils.Comunes;
import utils.GenerarData;
import utils.enums.EnumConstantes;
import utils.enums.EnumVariablesSesion;

import java.util.logging.Level;

import static net.serenitybdd.core.Serenity.getDriver;
import static userinterface.AlertsUI.*;

public class Seleccionar implements Task {

    private String alerta;
    private Target boton;


    public Seleccionar(String alerta) {
        this.alerta = alerta;
    }

    @SneakyThrows
    @Override
    public <T extends Actor> void performAs(T actor) {

        GenerarData data = new GenerarData();
        actor.remember(EnumVariablesSesion.INGRESAR_NOMBRE.getValue(), data.generarNombre());

        switch (alerta){
            case "ver alerta":
                EnumConstantes.LOGGERCOLPATRIA.log(Level.INFO, "boton ver alerta");
                boton = BTN_SEE_ALERT;
                boton.resolveFor(actor).click();
                actor.remember(EnumVariablesSesion.GET_TEXTO_ALERTA.getValue(),getDriver().switchTo().alert().getText());
                break;

            case "alerta con 5s":
                EnumConstantes.LOGGERCOLPATRIA.log(Level.INFO, "boton ver alerta despues de 5s");
                boton = BTN_WAIT_ALERT;
                actor.attemptsTo(Click.on(boton));
                Thread.sleep(8000);
                actor.remember(EnumVariablesSesion.GET_TEXTO_ALERTA.getValue(),getDriver().switchTo().alert().getText());
                break;

            case "alerta de confirmacion ok":
                EnumConstantes.LOGGERCOLPATRIA.log(Level.INFO, "boton ver confirmacion alerta ok");
                boton = BTN_COMFIRM_ALERT;
                boton.resolveFor(actor).click();
                Esperar.por("5");
                Comunes.opcionConfirmacionAlerta(EnumConstantes.ALERT_ACEPTAR.getValue());
                break;

            case "alerta de confirmacion cancel":
                EnumConstantes.LOGGERCOLPATRIA.log(Level.INFO, "boton ver confirmacion alerta cancel");
                boton = BTN_COMFIRM_ALERT;
                boton.resolveFor(actor).click();
                Esperar.por("5");
                Comunes.opcionConfirmacionAlerta(EnumConstantes.ALERT_CANCELAR.getValue());
                break;

            case "alerta con input":
                EnumConstantes.LOGGERCOLPATRIA.log(Level.INFO, "boton alerta con input");
                boton = BTN_INPUT_ALERT;
                boton.resolveFor(actor).click();
                Esperar.por("5");
                Comunes.inputAlerta(actor.recall(EnumVariablesSesion.INGRESAR_NOMBRE.getValue()));
                Esperar.por("5");
                Comunes.opcionConfirmacionAlerta(EnumConstantes.ALERT_ACEPTAR.getValue());
                break;
        }

    }

    public static Seleccionar tipo (String alerta) {
        return Tasks.instrumented(Seleccionar.class,alerta);
    }
}
