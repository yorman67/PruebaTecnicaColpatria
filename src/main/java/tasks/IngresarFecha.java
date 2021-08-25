package tasks;

import model.DatosCsv;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;
import utils.ObtenerSetDatos;
import utils.enums.EnumConstantes;
import utils.enums.EnumVariablesSesion;

import java.util.logging.Level;

import static userinterface.WidgetUI.INPUT_FECHA;
import static userinterface.WidgetUI.INPUT_FECHA_HORA;

public class IngresarFecha implements Task {

    private String opcion;

    public IngresarFecha(String opcion) {
        this.opcion = opcion;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        DatosCsv datosCsv = ObtenerSetDatos.extraerDatos(opcion, EnumConstantes.RUTA_ARCHIVO_DATA_FECHA.getValue(),EnumConstantes.NOMBRE_HOJA_EXCEL.getValue());

        if(opcion.equalsIgnoreCase(EnumConstantes.FECHA_CON_HORA.getValue())){
            actor.attemptsTo(
                    Click.on(INPUT_FECHA_HORA),
                    Enter.theValue(datosCsv.getFechaHora()).into(INPUT_FECHA_HORA),
                    Hit.the(Keys.ENTER).into(INPUT_FECHA_HORA)
            );
            actor.remember(EnumVariablesSesion.FECHA_HORA.getValue(), datosCsv.getFechaHora());
        }else{
            actor.attemptsTo(
                    Click.on(INPUT_FECHA),
                    Enter.theValue(datosCsv.getFecha()).into(INPUT_FECHA),
                    Hit.the(Keys.ENTER).into(INPUT_FECHA)
            );
            actor.remember(EnumVariablesSesion.FECHA.getValue(), datosCsv.getFecha());
        }

        actor.remember(EnumVariablesSesion.OPCION_FECHA.getValue(), opcion);
        EnumConstantes.LOGGERCOLPATRIA.log(Level.INFO, "Fecha ingresada correctamente");
    }

    public static IngresarFecha con (String opcion) {
        return Tasks.instrumented(IngresarFecha.class,opcion);
    }
}
