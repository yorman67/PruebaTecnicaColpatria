package tasks;

import model.DatosCsv;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import utils.ObtenerSetDatos;
import utils.enums.EnumConstantes;
import utils.enums.EnumVariablesSesion;

import java.util.logging.Level;

import static userinterface.WebTablesUI.BTN_ELIMINAR;
import static userinterface.WebTablesUI.FILTRO;

public class Eliminar implements Task {

    private String elemento;

    public Eliminar(String elemento) {
        this.elemento = elemento;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        DatosCsv datosCsv = ObtenerSetDatos.extraerDatos(elemento,EnumConstantes.RUTA_ARCHIVO_DATA_ELIMINAR.getValue(),EnumConstantes.NOMBRE_HOJA_EXCEL.getValue());
        actor.attemptsTo(
                Enter.theValue(datosCsv.getCorreo()).into(FILTRO),
                Click.on(BTN_ELIMINAR),
                Enter.theValue("").into(FILTRO)
        );
        actor.remember(EnumVariablesSesion.DATO_ELIMINADO.getValue(),datosCsv.getCorreo());
        EnumConstantes.LOGGERCOLPATRIA.log(Level.INFO, "Se elimina un  elemento de manera exitosa");
    }

    public static Eliminar el(String elemento) {
        return Tasks.instrumented(Eliminar.class,elemento);
    }
}
